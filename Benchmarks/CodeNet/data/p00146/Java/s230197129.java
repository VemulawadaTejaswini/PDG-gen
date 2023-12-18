import java.io.IOException;
import java.util.Arrays;

public class Main {
	/**
	* @param args
	*/

	static class SH {
		public	int	n;
		public	int	d;
		public	int	b;
		public SH(int n, int d, int b) {
			this.n = n;
			this.d = d;
			this.b = b;
		}
	}

	public	static	SH[]		t = null;
	public	static	double[][]	d = null;
	public	static	int[][][]	p = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int		n   = parseNum();
		int[]	tmp = new int[2];
		double	min = Double.MAX_VALUE;
		String	out = "";

		t = new SH[n];
		d = new double[n][1<<n];
		p = new int[n][1<<n][2];

		for (int i = 0; i < n; i++) {
			t[i] = new SH(parseNum(), parseNum(), parseNum());
			Arrays.fill(d[i], Double.MAX_VALUE);
		}

		solve(0, 0, 0, 1);

		for (int i = 0; i < n; i++) {
			if (d[i][1<<i] < min) {
				min    = d[i][1<<i];
				tmp[0] = 1<<i;
				tmp[1] = i;
			}
		}

		while (tmp[0] != -1) {
			if (out.isEmpty()) {
				out += ""+t[tmp[1]].n;
			} else {
				out += " "+t[tmp[1]].n;
			}
			tmp = p[tmp[1]][tmp[0]];
		}

		System.out.println(out);
	}

	private	static double solve(int state, int j, int w, int dp) {
		double min = Double.MAX_VALUE;

		if (state == (1<<t.length)-1) {
			p[j][state] = new int[]{-1, -1};
			return 0.0;
		}

		if (d[j][state] != Double.MAX_VALUE) {
			return d[j][state];
		}

		for (int i = 0; i < t.length; i++) {
			double tmp = (dp == 1)?0.0:Math.abs(t[j].d-t[i].d)/(2000.0/(70+w));
			if ((state&(1<<i))!=0) continue;

			tmp += solve(state+(1<<i), i, w+20*t[i].b, dp+1);
			if(tmp < min){
				if (dp > 1) {
					p[j][state] = new int[]{state+(1<<i), i};
				}
				min = tmp;
			}
		}

		if (dp > 1) d[j][state] = min;
		return min;
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
				} else if (skp == 0) {
					return (mns == 0)?num:num*(-1);
				}
			}
		} catch (IOException e) {}
		return -1;
	}
}