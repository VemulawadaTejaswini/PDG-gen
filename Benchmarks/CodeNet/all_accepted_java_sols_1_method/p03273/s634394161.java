import java.util.ArrayList;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		int wide = sc.nextInt();

		char[][] masu = new char[height][wide];

		for (int i = 0; i < height ; i++) {
			String row = sc.next();
			for (int j = 0; j < wide ; j++) {
				masu[i][j] = row.charAt(j);
			}
		}

//		for (int i = 0; i < height ; i++) {
//			for (int j = 0; j < wide ; j++) {
//				masu[i][j] = sc.next();
//			}
//		}
		ArrayList<Integer> deleteColumns = new ArrayList<>();
		ArrayList<Integer> deleteLines = new ArrayList<>();


		for (int i = 0; i < height ; i++) {
			boolean allWhileLine = true;
			for (int j = 0; j < wide ; j++) {
				if ("#".equals(String.valueOf(masu[i][j]))) {
					allWhileLine = false;
					continue;
				}

				boolean allWhileColumn = true;
				for (int k = 0; k < height ; k++) {
					if ("#".equals(String.valueOf(masu[k][j]))) {
						allWhileColumn = false;
						break;
					}
				}
				if (allWhileColumn) {
					deleteColumns.add(j);
				}

			}
			if (allWhileLine) {
				deleteLines.add(i);
			}
		}

		for (int i = 0; i < height ; i++) {
			if (deleteLines.contains(i)) {
				continue;
			}
			for (int j = 0; j < wide ; j++) {
				if (deleteColumns.contains(j)) {
					continue;
				}
				System.out.print(masu[i][j]);

			}
			System.out.println();
		}


	}
}
