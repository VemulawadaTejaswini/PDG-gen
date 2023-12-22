import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		int[][] paper = new int[14][14];
		byte x, y, size;
		int whites = 0, blot = 0;

		StringTokenizer st;
		while ((line = br.readLine()) != null) {

			st = new StringTokenizer(line, ",");
			x = Byte.parseByte(st.nextToken());
			y = Byte.parseByte(st.nextToken());
			size = Byte.parseByte(st.nextToken());

			x += 2;
			y += 2;

			if (size == 1) {
				paper[x - 1][y]++;
				paper[x][y - 1]++;
				paper[x][y]++;
				paper[x][y + 1]++;
				paper[x + 1][y]++;
			} else if (size == 2) {
				paper[x - 1][y - 1]++;
				paper[x - 1][y]++;
				paper[x - 1][y + 1]++;
				paper[x][y - 1]++;
				paper[x][y]++;
				paper[x][y + 1]++;
				paper[x + 1][y - 1]++;
				paper[x + 1][y]++;
				paper[x + 1][y + 1]++;
			} else {
				paper[x - 2][y]++;
				paper[x - 1][y - 1]++;
				paper[x - 1][y]++;
				paper[x - 1][y + 1]++;
				paper[x][y - 2]++;
				paper[x][y - 1]++;
				paper[x][y]++;
				paper[x][y + 1]++;
				paper[x][y + 2]++;
				paper[x + 1][y - 1]++;
				paper[x + 1][y]++;
				paper[x + 1][y + 1]++;
				paper[x + 2][y]++;
			}

		}
		for (int i = 2; i < 12; i++) {
			for (int j = 2; j < 12; j++) {
				if (paper[i][j] == 0)
					whites++;
				if (paper[i][j] > blot)
					blot = paper[i][j];
			}
		}
		System.out.println(whites + "\n" + blot);
	}
}