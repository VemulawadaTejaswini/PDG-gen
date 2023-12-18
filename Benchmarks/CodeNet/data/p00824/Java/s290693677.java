import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static final int INF = 0xFFFFFFF;
	static long[][] hash = new long[32][32];
	static int[][][] buf = new int[2][8192][32];
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
				finish ^= hash[(j - 1) * 4 + i][i * 8 + j];
			}
		}
		int T = sc.nextInt();
		for (int i = 0; i < T; ++i) {
			System.out.println(solve());
		}
	}

	static int solve() {
		ArrayList<Board> cur = new ArrayList<Board>();
		HashSet<Long> hashes = new HashSet<Long>(30000);
		cur.add(new Board(buf[0][0]));
		if (cur.get(0).h == finish) return 0;
		hashes.add(cur.get(0).h);
		int i = 1;
		for (; !cur.isEmpty(); ++i) {
			//			System.out.println("turn:" + i + " size:" + cur.size());
			ArrayList<Board> next = new ArrayList<Board>(cur.size());
			for (Board b : cur) {
				for (int j = 4; j < 32; ++j) {
					if (b.f[j] == INF && (b.f[j - 4] & 7) != 7) {
						Board created = new Board(buf[i & 1][next.size()], b, j);
						if (hashes.contains(created.h)) continue;
						if (created.h == finish) return i;
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
		int[] f;
		long h;

		Board(int[] buf) {
			f = buf;
			for (int i = 0; i < 4; ++i) {
				for (int j = 1; j <= 7; ++j) {
					String v = sc.next();
					int suit = v.charAt(0) - '1';
					int num = v.charAt(1) - '0';
					int card = suit * 8 + num;
					if (num == 1) {
						f[j * 4 + i] = INF;
						f[suit] = card;
					} else {
						f[j * 4 + i] = card;
						h ^= hash[j * 4 + i][card];
					}
				}
			}
		}

		Board(int[] buf, Board orig, int pos) {
			this.f = buf;
			System.arraycopy(orig.f, 0, this.f, 0, 32);
			this.h = orig.h;
			final int target = orig.f[pos - 4] + 1;
			for (int i = 4; i < 32; ++i) {
				if (orig.f[i] == target) {
					this.f[i] = INF;
					this.h ^= hash[i][target];
					break;
				}
			}
			this.f[pos] = target;
			this.h ^= hash[pos][target];
		}
	}
}