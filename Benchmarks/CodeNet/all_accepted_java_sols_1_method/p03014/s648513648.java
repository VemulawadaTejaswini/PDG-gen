import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int h = Integer.parseInt(str[0]);
		int w = Integer.parseInt(str[1]);

		char matrix[][] = new char[h][w];

		for (int i = 0; i < h; i++) {
			char c[] = br.readLine().toCharArray();
			for (int j = 0; j < w; j++) {
				matrix[i][j] = c[j];
			}
		}

		int left[][] = new int[h + 10][w + 10];
		int right[][] = new int[h + 10][w + 10];
		int top[][] = new int[h + 10][w + 10];
		int bottom[][] = new int[h + 10][w + 10];

		for (int i = 0; i < h; ++i) {
			int cur = 0;
			for (int j = 0; j < w; ++j) {
				if (matrix[i][j] == '#')
					cur = 0;
				else
					++cur;
				left[i][j] = cur;
			}
		}

		for (int i = 0; i < h; ++i) {
			int cur = 0;
			for (int j = w - 1; j >= 0; --j) {
				if (matrix[i][j] == '#')
					cur = 0;
				else
					++cur;
				right[i][j] = cur;
			}
		}

		for (int j = 0; j < w; ++j) {
			int cur = 0;
			for (int i = 0; i < h; ++i) {
				if (matrix[i][j] == '#')
					cur = 0;
				else
					++cur;
				top[i][j] = cur;
			}
		}

		for (int j = 0; j < w; ++j) {
			int cur = 0;
			for (int i = h - 1; i >= 0; --i) {
				if (matrix[i][j] == '#')
					cur = 0;
				else
					++cur;
				bottom[i][j] = cur;
			}
		}

		int max = 0;

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (matrix[i][j] == '#')
					continue;
				max = Math.max(max, left[i][j] + right[i][j] + top[i][j] + bottom[i][j] - 3);
			}
		}

		System.out.println(max);
	}

}