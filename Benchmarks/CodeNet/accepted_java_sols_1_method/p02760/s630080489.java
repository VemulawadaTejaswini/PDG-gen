import java.util.Scanner;

//AtCoder Beginner Contest 157
//B	Bingo
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] A = new int[9];
		for (int i = 0; i < 9; i++) {
			A[i] = Integer.parseInt(sc.next());
		}
		int N = Integer.parseInt(sc.next());
		boolean[] c = new boolean[9];
		for (int i = 0; i < N; i++) {
			int b = Integer.parseInt(sc.next());
			for (int j = 0; j < 9; j++) {
				if (A[j] == b) {
					c[j] = true;
				}
			}
		}
		sc.close();

		if (c[0] && c[3] && c[6]) {
			System.out.println("Yes");
		}
		else if (c[1] && c[4] && c[7]) {
			System.out.println("Yes");
		}
		else if (c[2] && c[5] && c[8]) {
			System.out.println("Yes");
		}
		else if (c[0] && c[1] && c[2]) {
			System.out.println("Yes");
		}
		else if (c[3] && c[4] && c[5]) {
			System.out.println("Yes");
		}
		else if (c[6] && c[7] && c[8]) {
			System.out.println("Yes");
		}
		else if (c[0] && c[4] && c[8]) {
			System.out.println("Yes");
		}
		else if (c[2] && c[4] && c[6]) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}
