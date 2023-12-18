import java.io.IOException;
import java.util.Arrays;

public class Main {
	/**
	 * @param args
	 */
	public	static	int[]	c = new int[8*2];
	public	static	int[]	d = new int[8*1001];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int	m = 0;

		while((m = parseNum()) != 0) {
			solve(m);
		}
	}

	private static void solve(int m) {
		int	g = 0;

		Arrays.fill(c, 0);
		for (int i = 1; i <= m; i++) {
			c[i*2+0] = parseNum();
			c[i*2+1] = parseNum();
		}

		Arrays.fill(d, 0);
		d[0] = 1;
		for (int i = 1; i <= m; i++) {
			for (int j = 0; j <= c[i*2+1]; j++) {
				for (int k = 1000-c[i*2+0]*j; k >= 0; k--) {
					d[i*1001+k+c[i*2+0]*j] += d[(i-1)*1001+k];
				}
			}
		}

		g = parseNum();
		for (int i = 0; i < g; i++) {
			System.out.println(d[m*1001+parseNum()]);
		}
	}

	private static int parseNum() {
		try {
			int	buf = 0;
			int	num = 0;
			int	mns = 0;
			int	skp = 1;

			// -,0〜9以外は読み飛ばす
			while (true) {
				buf = System.in.read();
				if (buf == '-') {
					mns = 1;
					skp = 0;
				} else if (buf >= '0' && buf <= '9') {
					num = num * 10 + (buf - '0');
					skp = 0;
				} else if ((skp == 0 || buf == -1) && buf != '.') {
					return (mns == 0)?num:num*(-1);
				}
			}
		} catch (IOException e) {}
		return -1;
	}
}