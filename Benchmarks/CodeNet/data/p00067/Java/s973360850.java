

import java.io.IOException;
import java.util.Scanner;

/**
 * <pre>
 * NumberOfIsland
 *
 * ??¶?????°???????????????
 * </pre>
 *
 * @author ?????????????????§???
 *
 */
public class Main{

	static boolean map[][] = new boolean[12][12];
	static int ans = 0;

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			for (int cnt = 0; cnt < map.length; cnt++) {
				int trans = 0;
				for (String s : sc.next().split("", 0)) {
					if (s.equals("1")) {
						map[cnt][trans] = true;
					} else {
						map[cnt][trans] = false;
					}
					trans++;
				}
			}
			for (int mh = 0; mh < map.length; mh++) {
				for (int mw = 0; mw < map.length; mw++) {
					if (map[mh][mw]) {
						test(mh, mw);
						ans++;
					}
				}
			}
			System.out.println(ans);
		} // ?????????????????????
	}// ?????????????????????????????????

	public static void test(int mh, int mw) {
		map[mh][mw] = false;
		int move_h[] = { 1, 0, -1, 0 };
		int move_w[] = { 0, 1, 0, -1 };
		for (int cnt = 0; cnt < 4; cnt++) {
			int tmp_h = mh + move_h[cnt];
			int tmp_w = mw + move_w[cnt];
			if (0 <= tmp_h && 0 <= tmp_w && tmp_h < map.length && tmp_w < map[0].length && map[tmp_h][tmp_w])//
				test(tmp_h, tmp_w);
		}
	}
}// ??????????????????????????????