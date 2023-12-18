import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class　Main {
	static int[][] diamond = null;
	static int[][] max = null;
	static int[] tmpMax = null;
	static int height = -1;
	static int width = -1;

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> array = new ArrayList<String>();

		try {
			String str = null;
			while ((str = br.readLine()) != null && !str.equals("")) {
				array.add(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		width = array.size() / 2 + 1;
		height = array.size();
		diamond = new int[height][width];

		max = new int[height][width];

		for (int i = 0; i < height; i++) {
			String s = array.get(i);
			String[] data = s.split(",");
			for (int j = 0; j < data.length; j++) {
				diamond[i][j] = Integer.parseInt(data[j]);
			}
		}
		bfs();

		System.out.println(max[height - 1][0]);

	}

	private static void bfs() {
		max[0][0] = diamond[0][0];
		//前半
		for (int i = 1; i < width; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0)
					max[i][j] = diamond[i][j] + max[i - 1][j];
				else if (j == i)
					max[i][j] = diamond[i][j] + max[i - 1][j - 1];
				else {
					max[i][j] = diamond[i][j]
							+ Math.max(max[i - 1][j], max[i - 1][j - 1]);
				}
			}
		}
		//後半
		for (int i = width; i < height; i++) {
			for (int j = 0; j <= (height - i - 1); j++) {
				max[i][j] = diamond[i][j]
						+ Math.max(max[i - 1][j], max[i - 1][j + 1]);
			}
		}
	}
}