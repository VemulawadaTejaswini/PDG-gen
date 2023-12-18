import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		int[][] trump = new int [4][13];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		for (int i =0; i < n; i++) {
			String[] info = br.readLine().split(" ");
			int num = Integer.parseInt(info[1]);

			if ("S".equals(info[0])) {
				trump[0][num-1] = 1;
			} else if ("H".equals(info[0])) {
				trump[1][num-1] = 1;
			} else if ("C".equals(info[0])) {
				trump[2][num-1] = 1;
			} else if ("D".equals(info[0])) {
				trump[3][num-1] = 1;
			}
		}

		String blank = " ";
		for (int i = 0; i< trump.length; i++) {
			for (int j = 0; j < trump[0].length; j++) {
				if (trump[i][j] == 0) {
					if (i == 0) {
						System.out.println("S" + blank + (j + 1));
					} else if (i == 1) {
						System.out.println("H" + blank + (j + 1));
					} else if (i == 2) {
						System.out.println("C" + blank + (j + 1));
					} else {
						System.out.println("D" + blank + (j + 1));
					}
				}
			}
		}
	}
}