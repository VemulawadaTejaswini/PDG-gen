import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[][] A = new int[3][3];
		int N;
		int b;
		int i;
		int j;
		int n;
		int flag = 0;
		Scanner sc = new Scanner(System.in);
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				A[i][j] = Integer.parseInt(sc.next());
			}
		}
		N = Integer.parseInt(sc.next());
		for (n = 0; n < N; n++) {
			b = Integer.parseInt(sc.next());
			for (i = 0; i < 3; i++) {
				for (j = 0; j < 3; j++) {
					if (A[i][j] == b) {
						A[i][j] = 0;
						flag = 1;

						break;
					}
				}
				if (flag == 1) {
					flag = 0;
					break;
				}
			}
		}
		sc.close();
		for (i = 0; i < 3; i++) {
			if ((A[i][0] == A[i][1] && A[i][1] == A[i][2])||(A[0][i] == A[1][i] && A[1][i] == A[2][i])) {
				System.out.println("Yes");
				return;
			}
		}
		if (A[0][0] == A[1][1] && A[1][1] == A[2][2] || A[0][2] == A[1][1] && A[1][1] == A[2][0]) {
			System.out.println("Yes");
			return;
		}
		System.out.println("No");
	}
}