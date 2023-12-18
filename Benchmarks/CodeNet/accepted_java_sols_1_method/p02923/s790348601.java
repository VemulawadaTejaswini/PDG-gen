import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cellNum = Integer.parseInt(sc.next());
		long[] cell = new long[cellNum];
		for (int i = 0; i < cellNum; i++) {
			long height = Long.parseLong(sc.next());
			cell[i] = height;
		}
		int moveMax = 0;
		for (int i = 0; i < cellNum; i++) {
			if (moveMax >= cell.length - i) {
				break;
			}
			int moveCount = 0;
			for (int j = i; j < cellNum; j++) {
				if (j < cellNum - 1 && cell[j] >= cell[j + 1]) {
					moveCount++;
				} else if (moveCount > moveMax) {
					moveMax = moveCount;
					break;
				} else {
					break;
				}
			}
		}
		System.out.println(moveMax);

	}

}
