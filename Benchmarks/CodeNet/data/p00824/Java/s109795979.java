import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static final int INF = 1 << 30;
	static long[][] hash = new long[32][32];
	static long finish;

	public static void main(String[] args) {
		Random rnd = new Random();
		for (int i = 0; i < 32; ++i) {
			for (int j = 0; j < 32; ++j) {
				hash[i][j] = rnd.nextLong();
			}
		}
		for (int i = 0; i < 4; ++i) {
			for (int j = 2; j <= 7; ++j) {
				finish ^= hash[i * 8 + j - 1][i * 8 + j];
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
				if (b.h == finish) return i;
				for (int j = 0; j < 32; ++j) {
					if (b.f[j] == INF && b.f[j - 1] != INF && (b.f[j - 1] & 7) != 7) {
						Board created = new Board(b, j);
						if (hashes.contains(created.h)) continue;
						hashes.add(created.h);
						next.add(created);
					}
				}
			}
			cur = next;
		}
		return -1;
	}

	static class Board {
		int[] f = new int[32];
		long h;

		Board() {
			for (int i = 0; i < 4; ++i) {
				for (int j = 1; j <= 7; ++j) {
					int v = sc.nextInt();
					int suit = v / 10 - 1;
					int num = v % 10;
					int card = suit * 8 + num;
					if (num == 1) {
						f[i * 8 + j] = INF;
						f[suit * 8] = card;
					} else {
						f[i * 8 + j] = card;
						h ^= hash[i * 8 + j][card];
					}
				}
			}
		}

		Board(Board orig, int pos) {
			this.h = orig.h;
			for (int i = 0; i < 4; ++i) {
				for (int j = 0; j < 8; ++j) {
					this.f[i * 8 + j] = orig.f[i * 8 + j];
					if (orig.f[i * 8 + j] == orig.f[pos - 1] + 1) {
						this.f[i * 8 + j] = INF;
						this.h ^= hash[i * 8 + j][orig.f[pos - 1] + 1];
					}
				}
			}
			this.f[pos] = orig.f[pos - 1] + 1;
			this.h ^= hash[pos][orig.f[pos - 1] + 1];
		}
	}
}