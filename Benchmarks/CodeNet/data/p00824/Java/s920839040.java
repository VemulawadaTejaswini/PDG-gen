import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static final int INF = 1 << 30;
	static long[][][] hash = new long[4][9][32];
	static long finish;

	public static void main(String[] args) {
		Random rnd = new Random();
		for (int i = 0; i < 4; ++i) {
			for (int j = 0; j < 9; ++j) {
				for (int k = 0; k < 32; ++k) {
					hash[i][j][k] = rnd.nextLong();
				}
			}
		}
		for (int i = 0; i < 4; ++i) {
			for (int j = 2; j <= 7; ++j) {
				finish ^= hash[i][j - 1][i * 8 + j];
			}
		}
		int T = sc.nextInt();
		for (int i = 0; i < T; ++i) {
			System.out.println(solve());
		}
	}

	static int solve() {
		ArrayList<Board> cur = new ArrayList<Board>();
		HashSet<Long> hashes = new HashSet<Long>();
		cur.add(new Board());
		hashes.add(cur.get(0).h);
		int i = 0;
		for (; !cur.isEmpty(); ++i) {
			ArrayList<Board> next = new ArrayList<Board>();
			for (Board b : cur) {
				if (b.h == finish) {
					return i;
				}
				for (int j = 0; j < 4; ++j) {
					for (int k = 1; k < 8; ++k) {
						if (b.f[j][k] == INF && b.f[j][k - 1] != INF && (b.f[j][k - 1] & 7) != 7) {
							Board created = new Board(b, j, k);
							if (hashes.contains(created.h)) continue;
							hashes.add(created.h);
							next.add(created);
						}
					}
				}
			}
			cur = next;
		}
		return -1;
	}

	static class Board {
		int[][] f = new int[4][8];
		long h;

		Board() {
			for (int i = 0; i < 4; ++i) {
				for (int j = 0; j < 7; ++j) {
					int v = sc.nextInt();
					int suit = v / 10 - 1;
					int num = v % 10;
					int card = (suit << 3) + num;
					if (num == 1) {
						f[i][j + 1] = INF;
						f[suit][0] = card;
					} else {
						f[i][j + 1] = card;
						h ^= hash[i][j + 1][card];
					}
				}
			}
		}

		Board(Board orig, int r, int c) {
			this.h = orig.h;
			for (int i = 0; i < 4; ++i) {
				for (int j = 0; j < 8; ++j) {
					this.f[i][j] = orig.f[i][j];
					if (orig.f[i][j] == orig.f[r][c - 1] + 1) {
						this.f[i][j] = INF;
						this.h ^= hash[i][j][orig.f[r][c - 1] + 1];
					}
				}
			}
			this.f[r][c] = orig.f[r][c - 1] + 1;
			this.h ^= hash[r][c][orig.f[r][c - 1] + 1];
		}

		void print() {
			for (int j = 0; j < 4; ++j) {
				for (int k = 0; k < 8; ++k) {
					if (f[j][k] == INF) {
						System.out.print("-1 ");
					} else {
						System.out.print((f[j][k] >> 3) + "" + (f[j][k] & 7) + " ");
					}
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}