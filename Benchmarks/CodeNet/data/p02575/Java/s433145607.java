import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	int H, W;
	int[] A, B, mins;

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		H = Integer.parseInt(tokens[0]);
		W = Integer.parseInt(tokens[1]);
		A = new int[H];
		B = new int[H];
		for (int i = 0; i < H; ++i) {
			tokens = in.readLine().split(" ");
			A[i] = Integer.parseInt(tokens[0]) - 1;
			B[i] = Integer.parseInt(tokens[1]) - 1;
		}
		mins = new int[H + 1];
		Arrays.fill(mins, Integer.MAX_VALUE / 2);
		mins[0] = 0;
	}

	void search(int h, int w, int dist) {
		mins[h] = Math.min(mins[h], dist);

		if (A[h] <= w && w <= B[h]) {
			// 右にしかいけない
			if (w + 1 < W) {
				search(h, w + 1, dist + 1);
			}
		} else {
			// 下にも行ける
			if (h + 1 <= H) {
				search(h + 1, w, dist + 1);
				if (w + 1 < W && h - 1 >= 0) {
					// 右上チェック
					if (A[h - 1] <= w + 1 && w + 1 <= B[h - 1]) {
						search(h, w + 1, dist + 1);
					}
				}
			}
		}
	}

	void calc() {
		for (int i = 0; i < W; ++i) {
			search(0, i, 0);
		}
	}

	void showResult() {
		for (int h = 1; h <= H; ++h) {
			if (mins[h] < (H + W) * 2) {
				System.out.println(mins[h]);
			} else {
				System.out.println("-1");
			}
		}
	}
}