
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] array = new String[2];
		int N = 13;
		int M = 4;
		boolean[][] card = new boolean[M][N];

		// 初期
		int n = Integer.parseInt(br.readLine());
		for (int i = 1; i <= n; i++) {
			array = br.readLine().split(" ");
			if (array[0].equals("S")) {
				card[0][Integer.parseInt(array[1]) - 1] = true;
			} else if (array[0].equals("H")) {
				card[1][Integer.parseInt(array[1]) - 1] = true;
			} else if (array[0].equals("C")) {
				card[2][Integer.parseInt(array[1]) - 1] = true;
			} else if (array[0].equals("D")) {
				card[3][Integer.parseInt(array[1]) - 1] = true;
			} else {
				System.out.println("error:invalid parameter.");
			}

		}
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (!card[i][j]) {
					if (i == 0) {
						System.out.println("S " + j);
					} else if (i == 1) {
						System.out.println("H " + j);
					} else if (i == 2) {
						System.out.println("C " + j);
					} else {
						System.out.println("D " + j);
					}
				}
			}
		}
	}
}