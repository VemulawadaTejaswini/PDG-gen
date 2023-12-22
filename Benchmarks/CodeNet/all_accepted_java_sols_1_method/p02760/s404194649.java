import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] board = new int[3][3];

//		String[] line1 = sc.nextLine().split(" ");
//		String[] line2 = sc.nextLine().split(" ");
//		String[] line3 = sc.nextLine().split(" ");
//
		for (int i = 0; i < 3; i++) {
			board[i][0] = sc.nextInt();
			board[i][1] = sc.nextInt();
			board[i][2] = sc.nextInt();
		}

		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {

			int b = sc.nextInt();

			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					if(b==board[j][k]) {
						board[j][k] = 0;
					}
				}
			}
		}

		if(board[0][0]==0 &&board[0][1]== 0 && board[0][2]==0) {
			System.out.println("Yes");
			return;
		}
		if(board[1][0]==0 &&board[1][1]== 0 && board[1][2]==0) {
			System.out.println("Yes");
			return;
		}
		if(board[2][0]==0 &&board[2][1]== 0 && board[2][2]==0) {
			System.out.println("Yes");
			return;
		}
		if(board[0][0]==0 &&board[1][0]== 0 && board[2][0]==0) {
			System.out.println("Yes");
			return;
		}
		if(board[0][1]==0 &&board[1][1]== 0 && board[2][1]==0) {
			System.out.println("Yes");
			return;
		}
		if(board[0][2]==0 &&board[1][2]== 0 && board[2][2]==0) {
			System.out.println("Yes");
			return;
		}
		if(board[0][0]==0 &&board[1][1]== 0 && board[2][2]==0) {
			System.out.println("Yes");
			return;
		}
		if(board[0][2]==0 &&board[1][1]== 0 && board[2][0]==0) {
			System.out.println("Yes");
			return;
		}

		System.out.println("No");
	}
}