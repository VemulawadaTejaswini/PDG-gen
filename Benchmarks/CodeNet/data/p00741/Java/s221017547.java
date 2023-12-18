import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	int count = 0;
	
	void run() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] dataSet = br.readLine().split(" ");
		int W = Integer.parseInt(dataSet[0]);
		int H = Integer.parseInt(dataSet[1]);
		
		List<Integer> result = new ArrayList<Integer>();
		
		while (W != 0 || H != 0) {
			char[][] tile = new char[H][W];
			for (int i = 0; i < H; i++) {
				String[] line = br.readLine().split(" ");
				for (int j = 0; j < W; j++) {
					tile[i][j] = line[j].charAt(0);
				}
			}
			for (int m = 0; m < H; m++) {
				for (int n = 0; n < W; n++) {
					if (tile[m][n] == '1') {
						trace(m, n, tile, H, W);
						count++;
					}
				}
			}	
			result.add(count);
			count = 0;
			dataSet = br.readLine().split(" ");
			W = Integer.parseInt(dataSet[0]);
			H = Integer.parseInt(dataSet[1]);
		}
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}
	}
	
	void trace(int i, int j, char tile[][], int H, int W) {
		
		// ??????????????¢?´¢
		if (i - 1 >= 0) {
			if (tile[i - 1][j] == '1') {
				tile[i - 1][j] = '2';
				trace(i - 1, j, tile, H, W);
			}
		}
		// ??????????????¢?´¢
		if (j + 1 < W) {
			if (tile[i][j + 1] == '1') {
				tile[i][j + 1] = '2';
				trace(i, j + 1, tile, H, W);
			}
		}
		// ??????????????¢?´¢
		if (i + 1 < H) {
			if (tile[i + 1][j] == '1') {
				tile[i + 1][j] = '2';
				trace(i + 1, j, tile, H, W);
			}
		}
		// ??????????????¢?´¢
		if (j - 1 >= 0) {
			if (tile[i][j - 1] == '1') {
				tile[i][j - 1] = '2';
				trace(i, j - 1, tile, H, W);
			}
		}
		// ?????????????????¢?´¢
		if (i - 1 >= 0 && j - 1 >= 0) {
			if (tile[i - 1][j - 1] == '1') {
				tile[i - 1][j - 1] = '2';
				trace(i - 1, j - 1, tile, H, W);
			}
		}
		// ?????????????????¢?´¢
		if (i - 1 >= 0 && j + 1 < W) {
			if (tile[i - 1][j + 1] == '1') {
				tile[i - 1][j + 1] = '2';
				trace(i - 1, j + 1, tile, H, W);
			}
		}
		// ?????????????????¢?´¢
		if (i + 1 < H && j - 1 >= 0) {
			if (tile[i + 1][j - 1] == '1') {
				tile[i + 1][j - 1] = '2';
				trace(i + 1, j - 1, tile, H, W);
			}
		}
		// ?????????????????¢?´¢
		if (i + 1 < H && j + 1 < W) {
			if (tile[i + 1][j + 1] == '1') {
				tile[i + 1][j + 1] = '2';
				trace(i + 1, j + 1, tile, H, W);
			}
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		new Main().run();
	}

}