import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		short n, h;
		short[][] holes;
		int intersect;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			n = Short.parseShort(line.substring(0, line.indexOf(' ')));
			h = Short.parseShort(line.substring(line.indexOf(' ') + 1));
			if ((n | h) == 0) {
				break;
			}
			holes = new short[h][4];

			StringTokenizer st;
			for (int i = 0; i < h; i++) {
				st = new StringTokenizer(br.readLine());
				String plane = st.nextToken();
				if (plane.equals("xy")) {
					holes[i][0] = Short.parseShort(st.nextToken());
					holes[i][1] = Short.parseShort(st.nextToken());
					holes[i][3] = 1;
				} else if (plane.equals("xz")) {
					holes[i][0] = Short.parseShort(st.nextToken());
					holes[i][2] = Short.parseShort(st.nextToken());
					holes[i][3] = 2;
				} else {
					holes[i][1] = Short.parseShort(st.nextToken());
					holes[i][2] = Short.parseShort(st.nextToken());
					holes[i][3] = 4;
				}
			}
			// 交点判定
			intersect = 0;
			for (int i = 0; i < h - 2; i++) {
				for (int j = 1; j < h - 1; j++) {
					for (int k = 2; k < h; k++) {
						//
						if (i != j && j != k && k != i) {
							short p1, p2, p3;
							p1 = holes[i][3];
							p2 = holes[j][3];
							p3 = holes[k][3];
							if (!(p1 == p2 && p2 == p3 && p3 == p1)) {
								boolean b1, b2, b3;
								b1 = cross(holes[i], holes[j]);
								b2 = cross(holes[j], holes[k]);
								b3 = cross(holes[k], holes[i]);
								if (b1 && b2 && b3) { // 3線交差
									intersect++;
								} else { // 2線交差
									if (b1)
										intersect++;
									if (b2)
										intersect++;
									if (b3)
										intersect++;
								}
							}
						}
						//
					}
				}
			}
			// 穴の開いていない立方体の数
			System.out.println((int) Math.pow(n, 3) - n * h + intersect);
		}
	}

	static boolean cross(short[] p1, short[] p2) {
		boolean b = false;
		for (int p = 0; p < 3; p++) {
			b = true;
			b &= (p1[p] == p2[p]);
			b &= (p1[(p + 1) % 3] == 0);
			b &= (p2[(p + 2) % 3] == 0);
			if (b)
				break;
		}
		return b;
	}
}