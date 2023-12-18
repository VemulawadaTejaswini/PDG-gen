
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	/** 標準入力 */
	private static BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));;
	private static final char FIRE = '1';
	private static final char FROZEN = '2';
	private static final char TREE = '3';
	private static final char MUD = '4';
	private static final char WATER = '5';
	private static final char START = 'S';
	private static final char GOAL = 'G';
	private static char[] pachimons;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		String line;
		int y = 0;
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
		int maxX = 0;
		int maxY = 0;
		List<int[]> mapInfo[] = new ArrayList[5];
		int startGoal[] = new int[4];
		List<List<int[]>[]> mapInfoList = new ArrayList<List<int[]>[]>();
		List<int[]> startGoalList = new ArrayList<int[]>();
		List<Boolean> ZERO = new ArrayList<Boolean>();

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			if (line.contains(" ")) {
				if (begin) {
					begin = false;
				} else {
					assign(mapInfo, startGoal, startx, starty, goalx, goaly,
							fireMapInfo, frozenMapInfo, treeMapInfo,
							mudMapInfo, waterMapInfo, mapInfoList,
							startGoalList);
					fireMapInfo = new ArrayList<int[]>();
					frozenMapInfo = new ArrayList<int[]>();
					treeMapInfo = new ArrayList<int[]>();
					mudMapInfo = new ArrayList<int[]>();
					waterMapInfo = new ArrayList<int[]>();
					mapInfo = new ArrayList[5];
					startGoal = new int[4];
				}
				y = 0;
				String[] size = line.split(" ");
				maxX = Integer.parseInt(size[0]);
				maxY = Integer.parseInt(size[1]);
				if (maxX == 0 && maxY == 0) {
					ZERO.add(y, true);
				} else {
					ZERO.add(y, false);
				}
				continue;
			}

			for (int x = 0; x < maxY; x++) {
				int[] xy = { x, y };
				char cell = line.charAt(x);
				if (START == cell) {
					startx = x;
					starty = y;
					continue;
				}
				if (GOAL == cell) {
					goalx = x;
					goaly = y;
					continue;
				}
				if (FIRE == cell) {
					fireMapInfo.add(xy);
					continue;
				}
				if (FROZEN == cell) {
					frozenMapInfo.add(xy);
					continue;
				}
				if (TREE == cell) {
					treeMapInfo.add(xy);
					continue;
				}
				if (MUD == cell) {
					mudMapInfo.add(xy);
					continue;
				}
				if (WATER == cell) {
					waterMapInfo.add(xy);
					continue;
				}
			}
			y++;
		}
		assign(mapInfo, startGoal, startx, starty, goalx, goaly, fireMapInfo,
				frozenMapInfo, treeMapInfo, mudMapInfo, waterMapInfo,
				mapInfoList, startGoalList);

		String message = null;
		for (int i = 0; i < mapInfoList.size() && i < startGoalList.size(); i++) {
			if (!ZERO.get(i)) {
				if (!canClear(startGoalList.get(i)[0], startGoalList.get(i)[1],
						startGoalList.get(i)[2], startGoalList.get(i)[3],
						mapInfoList.get(i)[0], mapInfoList.get(i)[1],
						mapInfoList.get(i)[2], mapInfoList.get(i)[3],
						mapInfoList.get(i)[4])) {
					message = "NA";
				} else {
					int minDistance = Integer.MAX_VALUE;
					char answerPachimon = '\u0000';
					for (char pachimon : pachimons) {
						int distance = getMinDistance(pachimon,
								mapInfoList.get(i)[0], mapInfoList.get(i)[1],
								mapInfoList.get(i)[2], mapInfoList.get(i)[3],
								mapInfoList.get(i)[4], startGoalList.get(i)[0],
								startGoalList.get(i)[1],
								startGoalList.get(i)[2],
								startGoalList.get(i)[3]);
						if (distance < minDistance) {
							answerPachimon = pachimon;
							minDistance = distance;
							if (distance < Math.abs(startGoalList.get(i)[1]
									- startGoalList.get(i)[2])
									+ Math.abs(startGoalList.get(i)[1]
											- startGoalList.get(i)[3])) {
								break;
							}
						}

						message = answerPachimon + " " + minDistance;
					}
				}
				System.out.println(message);
			}
		}
	}

	private static void assign(List<int[]>[] mapInfo, int[] startGoal,
			int startx, int starty, int goalx, int goaly,
			List<int[]> fireMapInfo, List<int[]> frozenMapInfo,
			List<int[]> treeMapInfo, List<int[]> mudMapInfo,
			List<int[]> waterMapInfo, List<List<int[]>[]> mapInfoList,
			List<int[]> startGoalList) {
		mapInfo[0] = fireMapInfo;
		mapInfo[1] = frozenMapInfo;
		mapInfo[2] = treeMapInfo;
		mapInfo[3] = mudMapInfo;
		mapInfo[4] = waterMapInfo;
		startGoal[0] = startx;
		startGoal[1] = starty;
		startGoal[2] = goalx;
		startGoal[3] = goaly;
		mapInfoList.add(mapInfo);
		startGoalList.add(startGoal);
	}

	private static boolean canClear(int startx, int starty, int goalx,
			int goaly, List<int[]> fireMapInfo, List<int[]> frozenMapInfo,
			List<int[]> treeMapInfo, List<int[]> mudMapInfo,
			List<int[]> waterMapInfo) {
		if (startx == -1 || starty == -1 || goalx == -1 || goaly == -1)
			return false;
		if (fireMapInfo.isEmpty() && !frozenMapInfo.isEmpty()
				&& !treeMapInfo.isEmpty() && !mudMapInfo.isEmpty()
				&& !waterMapInfo.isEmpty()) {
			pachimons = new char[1];
			pachimons[0] = FIRE;
		} else if (!fireMapInfo.isEmpty() && frozenMapInfo.isEmpty()
				&& !treeMapInfo.isEmpty() && !mudMapInfo.isEmpty()
				&& !waterMapInfo.isEmpty()) {
			pachimons = new char[1];
			pachimons[0] = FROZEN;
		} else if (!fireMapInfo.isEmpty() && !frozenMapInfo.isEmpty()
				&& treeMapInfo.isEmpty() && !mudMapInfo.isEmpty()
				&& !waterMapInfo.isEmpty()) {
			pachimons = new char[1];
			pachimons[0] = TREE;
		} else if (!fireMapInfo.isEmpty() && !frozenMapInfo.isEmpty()
				&& !treeMapInfo.isEmpty() && mudMapInfo.isEmpty()
				&& !waterMapInfo.isEmpty()) {
			pachimons = new char[1];
			pachimons[0] = MUD;
		} else if (!fireMapInfo.isEmpty() && !frozenMapInfo.isEmpty()
				&& !treeMapInfo.isEmpty() && !mudMapInfo.isEmpty()
				&& waterMapInfo.isEmpty()) {
			pachimons = new char[1];
			pachimons[0] = WATER;
		} else if (!fireMapInfo.isEmpty() && !frozenMapInfo.isEmpty()
				&& !treeMapInfo.isEmpty() && !mudMapInfo.isEmpty()
				&& !waterMapInfo.isEmpty()) {
			pachimons = new char[5];
			pachimons[0] = FIRE;
			pachimons[1] = FROZEN;
			pachimons[2] = TREE;
			pachimons[3] = MUD;
			pachimons[4] = WATER;
		} else {
			return false;
		}
		return true;
	}

	private static int getMinDistance(char pachimon, List<int[]> fireMapInfo,
			List<int[]> frozenMapInfo, List<int[]> treeMapInfo,
			List<int[]> mudMapInfo, List<int[]> waterMapInfo, Integer startx,
			Integer starty, Integer goalx, Integer goaly) {
		int minDistance = Integer.MAX_VALUE;
		if (FIRE == pachimon) {
			minDistance = getMindistance(frozenMapInfo, treeMapInfo,
					mudMapInfo, waterMapInfo, startx, starty, goalx, goaly,
					minDistance);
		} else if (FROZEN == pachimon) {
			minDistance = getMindistance(treeMapInfo, mudMapInfo, waterMapInfo,
					fireMapInfo, startx, starty, goalx, goaly, minDistance);
		} else if (TREE == pachimon) {
			minDistance = getMindistance(mudMapInfo, waterMapInfo, fireMapInfo,
					frozenMapInfo, startx, starty, goalx, goaly, minDistance);
		} else if (MUD == pachimon) {
			minDistance = getMindistance(waterMapInfo, fireMapInfo,
					frozenMapInfo, treeMapInfo, startx, starty, goalx, goaly,
					minDistance);
		} else if (WATER == pachimon) {
			minDistance = getMindistance(fireMapInfo, frozenMapInfo,
					treeMapInfo, mudMapInfo, startx, starty, goalx, goaly,
					minDistance);
		}
		return minDistance;
	}

	private static int getMindistance(List<int[]> mapInfo1,
			List<int[]> mapInfo2, List<int[]> mapInfo3, List<int[]> mapInfo4,
			Integer startx, Integer starty, Integer goalx, Integer goaly,
			int minDistance) {
		for (int[] map1 : mapInfo1) {
			for (int[] map2 : mapInfo2) {
				for (int[] map3 : mapInfo3) {
					for (int[] map4 : mapInfo4) {
						int distance = getTargetDistance(startx, starty,
								map1[0], map1[1])
								+ getTargetDistance(map1[0], map1[1], map2[0],
										map2[1])
								+ getTargetDistance(map2[0], map2[1], map3[0],
										map3[1])
								+ getTargetDistance(map3[0], map3[1], map4[0],
										map4[1])
								+ getTargetDistance(map4[0], map4[1], goalx,
										goaly);
						if (minDistance > distance) {
							minDistance = distance;
						}
					}
				}
			}
		}
		return minDistance;
	}

	private static int getTargetDistance(int currentx, int currenty,
			int targetx, int targety) {
		return Math.abs(currentx - targetx) + Math.abs(currenty - targety);
	}
}