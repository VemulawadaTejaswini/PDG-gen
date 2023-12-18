import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String buffer;
		int count = 0;

		int n = 0;
		int m = 0;
		int[][] matrix = null;
		int[] vector = null;

		try {
			while ((buffer = reader.readLine())  != null) {
				String[] strings = buffer.split(" ");
				++count;
				if (count == 1) {
					n = Integer.valueOf(strings[0]);
					m = Integer.valueOf(strings[1]);
					matrix = new int[n][m];
					vector = new int[m];
				}
				else {
					if (1 < count && count <= 1 + n) {
						for (int w = 0; w < m; w++) {
							matrix[count - 2][w] = Integer.valueOf(strings[w]);
						}
					}
					if (1 + n < count && count <= 1 + n + m) {
						vector[count - 2 - n] = Integer.valueOf(strings[0]);
					}
					if (1 + n + m == count) {
						for (int h = 0; h < n; h++) {
							int calc = 0;
							for (int w = 0; w < m; w++) {
								calc += (matrix[h][w] * vector[w]);
							}
							System.out.println(calc);
						}
					}
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}

