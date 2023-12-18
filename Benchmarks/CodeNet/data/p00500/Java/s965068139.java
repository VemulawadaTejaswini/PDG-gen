import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int[][] c = new int[N][3];
		for (int i = 0; i < N; ++i) {
			for (int j = 0; j < 3; ++j) {
				c[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < N; ++i) {
			int p = 0;
			for (int j = 0; j < 3; ++j) {
				int count = 0;
				for (int k = 0; k < N; ++k) {
					if (c[i][j] == c[k][j]) ++count;
				}
				if (count == 1) p += c[i][j];
			}
			System.out.println(p);
		}
	}

}