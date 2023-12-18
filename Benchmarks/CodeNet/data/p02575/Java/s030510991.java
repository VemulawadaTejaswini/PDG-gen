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
	int[] A, B;
	boolean[][] map;
	Cell[][] cells;

	static class Cell {
		int h, w, dist, rowMin;

		Cell(int h, int w) {
			this.h = h;
			this.w = w;
			this.dist = Integer.MAX_VALUE / 2;
			this.rowMin = Integer.MAX_VALUE / 2;
		}
	}

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		H = Integer.parseInt(tokens[0]);
		W = Integer.parseInt(tokens[1]);
		map = new boolean[H + 1][W];
		for (int i = 0; i <= H; ++i) {
			Arrays.fill(map[i], true);
		}
		A = new int[H];
		B = new int[H];
		for (int i = 0; i < H; ++i) {
			tokens = in.readLine().split(" ");
			A[i] = Integer.parseInt(tokens[0]) - 1;
			B[i] = Integer.parseInt(tokens[1]) - 1;
			for (int j = A[i]; j <= B[i]; ++j) {
				map[i][j] = false;
			}
		}

		cells = new Cell[H + 1][W];
		for (int i = 0; i <= H; ++i) {
			for (int j = 0; j < W; ++j) {
				cells[i][j] = new Cell(i, j);
			}
		}
		for (int i = 0; i < W; ++i) {
			cells[0][i].dist = 0;
			cells[0][i].rowMin = 0;
		}
	}

	void calc() {
		for (int h = 1; h <= H; ++h) {
			if (map[h - 1][0]) {
				cells[h][0].dist = cells[h - 1][0].dist + 1;
				cells[h][0].rowMin = cells[h][0].dist;
			}
			for (int w = 1; w < W; ++w) {
				if (map[h - 1][w]) {
					// 上から来れる
					cells[h][w].dist = Math.min(cells[h - 1][w].dist + 1, cells[h][w - 1].dist + 1);
				} else {
					// 横からしか来られない
					cells[h][w].dist = cells[h][w - 1].dist + 1;
				}
				cells[h][w].rowMin = Math.min(cells[h][w - 1].rowMin, cells[h][w].dist);
			}
		}

	}

	void showResult() {
		for (int h = 1; h <= H; ++h) {
			if (cells[h][W - 1].rowMin < (H + W) * 2) {
				System.out.println(cells[h][W - 1].rowMin);
			} else {
				System.out.println("-1");
			}
		}
	}
}