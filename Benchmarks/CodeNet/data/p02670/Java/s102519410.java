import java.util.*;
public class Main {
	static int[][] seat;	//0 退場前 1 退場後
	static int n;
	static HashMap<String, Integer> memo = new HashMap<String, Integer>();

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
		String[] lineString = sc.nextLine().split(" ");
		n = Integer.parseInt(lineString[0]);
		seat = new int[n][n];

		lineString = sc.nextLine().split(" ");
		int hate = 0;
		for (int i = 0; i < n * n; i++) {
			memo.clear();
			int number = Integer.parseInt(lineString[i]) - 1;
			int row = number / n;
			int column = number % n;
			int[][] moveMap = new int[n][n];

			hate += move(row, column, moveMap, Math.min(Math.min(row, column), Math.min(n - row - 1, n - column - 1)));

			seat[row][column] = 1;
		}

		// 出力
		System.out.println(hate);
		sc.close();
	}

	static int move(int currentRow, int currentColumn, int[][] moveMap, int maxHate) {
		if (currentRow == 0 || currentColumn == 0 || currentRow == n - 1 || currentColumn == n - 1) {
			return 0;
		} else if (memo.containsKey(currentRow + "," + currentColumn)) {
			return memo.get(currentRow + "," + currentColumn);
		} else {
			int resultUp = 500;
			int resultRight = 500;
			int resultDown = 500;
			int resultLeft = 500;
			int hate = 0;
			int[][] nextMoveMap = new int[n][n];
			for (int i = 0; i < n; i++) {
				System.arraycopy(moveMap[i], 0, nextMoveMap[i], 0, n);
			}
			nextMoveMap[currentRow][currentColumn] = 1;
			//通ったことがない方向のみ探索
			//上探索
			if (moveMap[currentRow - 1][currentColumn] == 0) {
				if (seat[currentRow - 1][currentColumn] == 0) {
					hate = 1;
				} else {
					hate = 0;
				}
				resultUp = hate + move(currentRow - 1, currentColumn, nextMoveMap, maxHate);
			}
			//右探索
			if (moveMap[currentRow][currentColumn + 1] == 0) {
				if (seat[currentRow][currentColumn + 1] == 0) {
					hate = 1;
				} else {
					hate = 0;
				}
				resultRight = hate + move(currentRow, currentColumn + 1, nextMoveMap, maxHate);
			}
			//下探索
			if (moveMap[currentRow + 1][currentColumn] == 0) {
				if (seat[currentRow + 1][currentColumn] == 0) {
					hate = 1;
				} else {
					hate = 0;
				}
				resultDown = hate + move(currentRow + 1, currentColumn, nextMoveMap, maxHate);
			}
			//左探索
			if (moveMap[currentRow][currentColumn - 1] == 0) {
				if (seat[currentRow][currentColumn - 1] == 0) {
					hate = 1;
				} else {
					hate = 0;
				}
				resultLeft = hate + move(currentRow, currentColumn - 1, nextMoveMap, maxHate);
			}
			int result = Math.min(Math.min(resultUp, resultRight), Math.min(resultDown, resultLeft));
			memo.put(currentRow + "," + currentColumn, result);
			return result;
		}
	}
}
