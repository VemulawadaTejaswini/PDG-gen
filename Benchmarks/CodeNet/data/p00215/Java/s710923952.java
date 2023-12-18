import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	/** 標準入力 */
	private static BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));
	private static final char FIRE = '1';
	private static final char FROZEN = '2';
	private static final char TREE = '3';
	private static final char MUD = '4';
	private static final char WATER = '5';
	private static final char START = 'S';
	private static final char GOAL = 'G';
	private static char[] pachimons = { FIRE, FROZEN, TREE, MUD, WATER };

	public static void main(String[] args) throws IOException {
		String line;
		int y = 0;
		List<List<int[]>> mapInfo = new ArrayList<List<int[]>>();
		List<Integer> startGoal = new ArrayList<Integer>();
		boolean begin = true;
		int startx = -1;
		int starty = -1;
		int goalx = -1;
		int goaly = -1;
		List<int[]> fireMapInfo = new ArrayList<int[]>();
		List<int[]> frozenMapInfo = new ArrayList<int[]>();
		List<int[]> treeMapInfo = new ArrayList<int[]>();
		List<int[]> mudMapInfo = new ArrayList<int[]>();
		List<int[]> waterMapInfo = new ArrayList<int[]>();
		List<List<List<int[]>>> mapInfoList = new ArrayList<List<List<int[]>>>();
		List<List<Integer>> startGoalList = new ArrayList<List<Integer>>();

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			if (line.contains(" ")) {
				if (begin) {
					begin = false;
				} else {
					mapInfo.add(fireMapInfo);
					mapInfo.add(frozenMapInfo);
					mapInfo.add(treeMapInfo);
					mapInfo.add(mudMapInfo);
					mapInfo.add(waterMapInfo);
					startGoal.add(startx);
					startGoal.add(starty);
					startGoal.add(goalx);
					startGoal.add(goaly);
					mapInfoList.add(mapInfo);
					startGoalList.add(startGoal);
					fireMapInfo = new ArrayList<int[]>();
					frozenMapInfo = new ArrayList<int[]>();
					treeMapInfo = new ArrayList<int[]>();
					mudMapInfo = new ArrayList<int[]>();
					waterMapInfo = new ArrayList<int[]>();
					mapInfo = new ArrayList<List<int[]>>();
					startGoal = new ArrayList<Integer>();
				}
				continue;
			}

			for (int i = 0, x = 0; i < line.length(); i++, x++) {
				int[] xy = { x, y };
				char cell = line.charAt(i);
				if (START == cell) {
					startx = x;
					starty = y;
				}
				if (GOAL == cell) {
					goalx = x;
					goaly = y;
				}
				if (FIRE == cell) {
					fireMapInfo.add(xy);
				}
				if (FROZEN == cell) {
					frozenMapInfo.add(xy);
				}
				if (TREE == cell) {
					treeMapInfo.add(xy);
				}
				if (MUD == cell) {
					mudMapInfo.add(xy);
				}
				if (WATER == cell) {
					waterMapInfo.add(xy);
				}
			}
			y++;
		}
		mapInfo.add(fireMapInfo);
		mapInfo.add(frozenMapInfo);
		mapInfo.add(treeMapInfo);
		mapInfo.add(mudMapInfo);
		mapInfo.add(waterMapInfo);
		startGoal.add(startx);
		startGoal.add(starty);
		startGoal.add(goalx);
		startGoal.add(goaly);
		mapInfoList.add(mapInfo);
		startGoalList.add(startGoal);

		boolean NA = false;
		String message = null;

		for (int i = 0; i < mapInfoList.size() && i < startGoalList.size(); i++) {
			for (int j = 0; j < mapInfoList.get(i).size(); j++) {
				if (mapInfoList.get(i).get(j).isEmpty()) {
					message = "NA";
					NA = true;
					break;
				}
			}
			for (int j = 0; j < startGoalList.get(i).size(); j++) {
				if (NA) {
					break;
				}

				if (startGoalList.get(i).get(j) == -1) {
					message = "NA";
					NA = true;
					break;
				}
			}
			if (!NA) {
				int minDistance = 1000000000;
				char answerPachimon = '\u0000';
				for (char pachimon : pachimons) {
					int distance = getMinDistance(pachimon, mapInfoList.get(i)
							.get(0), mapInfoList.get(i).get(1), mapInfoList
							.get(i).get(2), mapInfoList.get(i).get(3),
							mapInfoList.get(i).get(4), startGoalList.get(i)
									.get(0), startGoalList.get(i).get(1),
							startGoalList.get(i).get(2), startGoalList.get(i)
									.get(3));
					if (distance < minDistance) {
						answerPachimon = pachimon;
						minDistance = distance;
					}
				}
				message = answerPachimon + " " + minDistance;
			}
			System.out.println(message);
			NA = false;
		}
	}

	private static int getMinDistance(char pachimon, List<int[]> fireMapInfo,
			List<int[]> frozenMapInfo, List<int[]> treeMapInfo,
			List<int[]> mudMapInfo, List<int[]> waterMapInfo, Integer startx,
			Integer starty, Integer goalx, Integer goaly) {
		int minDistance = 1000000000;
		if (FIRE == pachimon) {
			for (int[] frxy : frozenMapInfo) {
				for (int[] trxy : treeMapInfo) {
					for (int[] muxy : mudMapInfo) {
						for (int[] waxy : waterMapInfo) {
							int distance = getTargetDistance(startx, starty,
									frxy[0], frxy[1])
									+ getTargetDistance(frxy[0], frxy[1],
											trxy[0], trxy[1])
									+ getTargetDistance(trxy[0], trxy[1],
											muxy[0], muxy[1])
									+ getTargetDistance(muxy[0], muxy[1],
											waxy[0], waxy[1])
									+ getTargetDistance(waxy[0], waxy[1],
											goalx, goaly);
							if (minDistance > distance) {
								minDistance = distance;
							}
						}
					}
				}
			}
		} else if (FROZEN == pachimon) {
			for (int[] trxy : treeMapInfo) {
				for (int[] muxy : mudMapInfo) {
					for (int[] waxy : waterMapInfo) {
						for (int[] fixy : fireMapInfo) {
							int distance = getTargetDistance(startx, starty,
									trxy[0], trxy[1])
									+ getTargetDistance(trxy[0], trxy[1],
											muxy[0], muxy[1])
									+ getTargetDistance(muxy[0], muxy[1],
											waxy[0], waxy[1])
									+ getTargetDistance(waxy[0], waxy[1],
											fixy[0], fixy[1])
									+ getTargetDistance(fixy[0], fixy[1],
											goalx, goaly);
							if (minDistance > distance) {
								minDistance = distance;
							}
						}
					}
				}
			}
		} else if (TREE == pachimon) {
			for (int[] muxy : mudMapInfo) {
				for (int[] waxy : waterMapInfo) {
					for (int[] fixy : fireMapInfo) {
						for (int[] frxy : frozenMapInfo) {
							int distance = getTargetDistance(startx, starty,
									muxy[0], muxy[1])
									+ getTargetDistance(muxy[0], muxy[1],
											waxy[0], waxy[1])
									+ getTargetDistance(waxy[0], waxy[1],
											fixy[0], fixy[1])
									+ getTargetDistance(fixy[0], fixy[1],
											frxy[0], frxy[1])
									+ getTargetDistance(frxy[0], frxy[1],
											goalx, goaly);

							if (minDistance > distance) {
								minDistance = distance;
							}
						}
					}
				}
			}
		} else if (MUD == pachimon) {
			for (int[] waxy : waterMapInfo) {
				for (int[] fixy : fireMapInfo) {
					for (int[] frxy : frozenMapInfo) {
						for (int[] trxy : treeMapInfo) {
							int distance = getTargetDistance(startx, starty,
									waxy[0], waxy[1])
									+ getTargetDistance(waxy[0], waxy[1],
											fixy[0], fixy[1])
									+ getTargetDistance(fixy[0], fixy[1],
											frxy[0], frxy[1])
									+ getTargetDistance(frxy[0], frxy[1],
											trxy[0], trxy[1])
									+ getTargetDistance(trxy[0], trxy[1],
											goalx, goaly);

							if (minDistance > distance) {
								minDistance = distance;
							}
						}
					}
				}
			}
		} else if (WATER == pachimon) {
			for (int[] fixy : fireMapInfo) {
				for (int[] frxy : frozenMapInfo) {
					for (int[] trxy : treeMapInfo) {
						for (int[] muxy : mudMapInfo) {
							int distance = getTargetDistance(startx, starty,
									fixy[0], fixy[1])
									+ getTargetDistance(fixy[0], fixy[1],
											frxy[0], frxy[1])
									+ getTargetDistance(frxy[0], frxy[1],
											trxy[0], trxy[1])
									+ getTargetDistance(trxy[0], trxy[1],
											muxy[0], muxy[1])
									+ getTargetDistance(muxy[0], muxy[1],
											goalx, goaly);
							if (minDistance > distance) {
								minDistance = distance;
							}
						}
					}
				}
			}
		}
		return minDistance;
	}

	private static int getTargetDistance(int currentx, int currenty, int i,
			int j) {
		return Math.abs(currentx - i) + Math.abs(currenty - j);
	}
}