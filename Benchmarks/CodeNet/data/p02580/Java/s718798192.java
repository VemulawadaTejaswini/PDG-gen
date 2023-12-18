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

	int H, W, M;
	int[] h, w;
	Set<Integer>[] rows, cols;

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		H = Integer.parseInt(tokens[0]);
		W = Integer.parseInt(tokens[1]);
		M = Integer.parseInt(tokens[2]);
		h = new int[M];
		w = new int[M];
		for (int i = 0; i < M; ++i) {
			tokens = in.readLine().split(" ");
			h[i] = Integer.parseInt(tokens[0]) - 1;
			w[i] = Integer.parseInt(tokens[1]) - 1;
		}

		rows = new Set[H];
		cols = new Set[W];
		for (int i = 0; i < H; ++i) {
			rows[i] = new HashSet<>();
		}
		for (int i = 0; i < W; ++i) {
			cols[i] = new HashSet<>();
		}

		for (int i = 0; i < M; ++i) {
			rows[h[i]].add(i);
			// cols[w[i]].add(i);
		}
	}

	void calc() {
		// 要素数最大の行を求める
		int maxRow = 0;
		int maxRowCount = -1;
		for (int i = 0; i < H; ++i) {
			if (rows[i].size() > maxRowCount) {
				maxRow = i;
				maxRowCount = rows[i].size();
			}
		}
		// この行で爆破される対象を除いて，カウントする
		Set<Integer> row = rows[maxRow];
		for (int i = 0; i < M; ++i) {
			if (!row.contains(i)) {
				cols[w[i]].add(i);
			}
		}
		int maxCol = 0;
		int maxColCount = 0;
		for (int i = 0; i < W; ++i) {
			//System.out.println(cols[i].size());
			if (cols[i].size() > maxColCount) {
				maxCol = i;
				maxColCount = cols[i].size();
			}
		}
		//System.out.println(maxRow + " " + maxRowCount + " " + maxCol + " " + maxColCount);
		System.out.println((maxRowCount + maxColCount));
	}

	void showResult() {
	}
}