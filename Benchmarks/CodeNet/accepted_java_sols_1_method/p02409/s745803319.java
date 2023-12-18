import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));

			int[][] house = new int[12][10];

			for (int[] rooms : house) {
				for (int room : rooms) {
					room = 0;
				}
			}

			int n = Integer.parseInt(br.readLine());
			String[] strs;

			for (int i = 0; i < n; i++) {
				strs = br.readLine().split("\\s");
				house[(Integer.parseInt(strs[0]) - 1) * 3
						+ Integer.parseInt(strs[1]) - 1][Integer
						.parseInt(strs[2]) - 1] += Integer.parseInt(strs[3]);
			}

			for (int i = 0; i < house.length; i++) {
				for (int j = 0; j < house[i].length; j++) {
					if (j != 0 || j != house[i].length - 1)
						System.out.print(" " + house[i][j]);
				}
				System.out.println();
				if (i != 0 && i != house.length - 1 && (i + 1) % 3 == 0)
					System.out.println("####################");
			}
			br.close();
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}