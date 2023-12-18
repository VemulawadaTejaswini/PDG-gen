import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	/** 標準入力 */
	private static BufferedReader br;
	private static final char FIRE = '1';
	private static final char FROZEN = '2';
	private static final char TREE = '3';
	private static final char MUD = '4';
	private static final char WATER = '5';
	private static final char START = 'S';
	private static final char GOAL = 'G';
	private static char[] pachimons;

	public static void main(String[] args) throws IOException {
		String line;
		int y = 0;
		int startx = -1;
		int starty = -1;
		int goalx = -1;
		int goaly = -1;
		List<int[]> fireMapInfo = new ArrayList<int[]>();
		List<int[]> frozenMapInfo = new ArrayList<int[]>();
		List<int[]> treeMapInfo = new ArrayList<int[]>();
		List<int[]> mudMapInfo = new ArrayList<int[]>();
		List<int[]> waterMapInfo = new ArrayList<int[]>();
		br = new BufferedReader(new InputStreamReader(System.in));

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			if (line.contains(" ")) {
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

		String message = null;

		if (!canClear(startx, starty, goalx, goaly, fireMapInfo, frozenMapInfo,
				treeMapInfo, mudMapInfo, waterMapInfo)) {
			message = "NA";
		} else {
			int minDistance = 1000000000;
			char answerPachimon = '\u0000';
			for (char pachimon : pachimons) {
				int distance = getMinDistance(pachimon, fireMapInfo,
						frozenMapInfo, treeMapInfo, mudMapInfo, waterMapInfo,
						startx, starty, goalx, goaly);
				if (distance < minDistance) {
					answerPachimon = pachimon;
					minDistance = distance;
					if (distance == Math.abs(startx - goalx)
							+ Math.abs(starty - goaly)) {
						break;
					}
				}
			}
			message = answerPachimon + " " + minDistance;
		}
		System.out.println(message);

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
		int minDistance = 1000000000;
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

	private static int getTargetDistance(int currentx, int currenty, int i,
			int j) {
		return Math.abs(currentx - i) + Math.abs(currenty - j);
	}
}