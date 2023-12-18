import java.awt.Point;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static long startTime = System.currentTimeMillis();
	static final int[] DR = { 1, 0, -1, 0 };
	static final int[] DC = { 0, 1, 0, -1 };
	static int H, W, gr, gc;
	static char[][] F;

	public static void main(String[] args) {
		H = sc.nextInt();
		W = sc.nextInt();
		F = new char[H][];
		int stone = 0;
		for (int i = 0; i < H; ++i) {
			F[i] = sc.next().toCharArray();
			for (int j = 0; j < W; ++j) {
				if (F[i][j] == 'o') {
					++stone;
				} else if (F[i][j] == '@') {
					gr = i;
					gc = j;
				}
			}
		}
		boolean ans;
		if (stone >= 3) {
			if (H > 1 && W > 1) {
				ans = true;
			} else {
				ans = search();
			}
		} else if (stone == 2) {
			if (H > 1 && W > 1 && (gr == 0 || gr == H - 1 || gc == 0 || gc == W - 1)) {
				ans = true;
			} else {
				ans = search();
			}
		} else {
			ans = search();
		}
		System.out.println(ans ? "yes" : "no");
	}

	static boolean search() {
		HashSet<ArrayList<Point>> cur = new HashSet<>();
		ArrayList<Point> init = new ArrayList<>();
		for (int i = 0; i < H; ++i) {
			for (int j = 0; j < W; ++j) {
				if (F[i][j] == 'o') init.add(new Point(j, i));
			}
		}
		cur.add(init);
		OUT: for (int i = 0;; ++i) {
			HashSet<ArrayList<Point>> next = new HashSet<>();
			for (ArrayList<Point> st : cur) {
				if (System.currentTimeMillis() - startTime > 900) {
					break OUT;
				}
				for (Point p : st) {
					for (int dir = 0; dir < 4; ++dir) {
						ArrayList<Point> moved = new ArrayList<>();
						Point mp = null;
						for (Point np : st) {
							moved.add(new Point(np.x, np.y));
							if (np.equals(p)) mp = moved.get(moved.size() - 1);
						}
						while (true) {
							int nx = mp.x + DC[dir];
							int ny = mp.y + DR[dir];
							if (nx < 0 || nx >= W || ny < 0 || ny >= H) {
								if (mp.x == gc && mp.y == gr) return true;
								break;
							}
							for (Point np : moved) {
								if (np == mp) continue;
								if (np.x == nx && np.y == ny) {
									if (mp.x == gc && mp.y == gr) return true;
									mp = np;
									break;
								}
							}
							mp.x = nx;
							mp.y = ny;
						}
						//						System.out.println(moved);
						Collections.sort(moved, (Point p1, Point p2) -> {
							if (p1.x != p2.x) return Integer.compare(p1.x, p2.x);
							return Integer.compare(p1.y, p2.y);
						});
						next.add(moved);
					}
				}
			}
			cur = next;
		}
		return false;
	}

}