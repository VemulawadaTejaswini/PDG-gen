import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String buffer;

		int count = 0;
		int r = 0;
		int c = 0;
		int[][] sheet = null;
		try {
			while ((buffer = reader.readLine())  != null) {
				String[] strings = buffer.split(" ");

				if (count == 0) {
					r = Integer.valueOf(strings[0]);
					c = Integer.valueOf(strings[1]);
					sheet = new int[r + 1][c + 1];
				}
				else if (count <= r) {
					for (int i = 0; i < c; i++) {
						sheet[count - 1][i] = Integer.valueOf(strings[i]);
					}
				}
				if (count == r) {
					for (int w = 0; w < c; w++) {
						int sum = 0;
						for (int h = 0; h < r; h++) {
							sum += sheet[h][w];
						}
						sheet[r][w] = sum;
					}

					for (int h = 0; h < r + 1; h++) {
						int sum = 0;
						for (int w = 0; w < c; w++) {
								sum += sheet[h][w];
								System.out.print(sheet[h][w] + " ");
							if (w + 1 == c) {
								System.out.println(sum);
							}
						}
					}

				}

				count++;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}

