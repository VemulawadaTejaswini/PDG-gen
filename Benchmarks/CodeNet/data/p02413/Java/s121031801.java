import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			String[] inputList = br.readLine().split(" ");
			int r = Integer.parseInt(inputList[0]);
			int c = Integer.parseInt(inputList[1]);
			int[][] list = new int[r + 1][c + 1];
			int i, j, num, sum;
			for (i = 0; i < r; i++) {
				sum = 0;
				String[] hoge = br.readLine().split(" ");
				for (j = 0; j < c; j++) {
					num = Integer.parseInt(hoge[j]);
					list[i][j] = Integer.parseInt(hoge[j]);
					sum = sum + num;
				}
				list[i][c] = sum;
			}

			for (i = 0; i < c + 1; i++) {
				sum = 0;
				for (j = 0; j < r + 1; j++) {
					sum = sum + list[j][i];
				}
				list[r][i] = sum;
			}

			for (i = 0; i < r + 1; i++) {
				for (j = 0; j < c + 1; j++) {
					System.out.print(list[i][j]);
					if (j != c) {
						System.out.print(" ");
					}
				}
				if (i != r) {
					System.out.println();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}