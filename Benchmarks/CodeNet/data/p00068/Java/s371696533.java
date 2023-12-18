import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Main {
	private	static	BufferedReader	br = null;

	static {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int	num = 0;
		MyPolygon	polygon = new MyPolygon();
		while ((num = parseNum()) != 0) {
			polygon.clear();

			for (int n = 0; n < num; n++) {
				polygon.AddEx(parsePoint());
				polygon.removeUselessPos();
			}

			System.out.println(num - polygon.size());
		}
	}

	private static int parseNum() {
		String	line = null;
		int		num  = 0;

		if ((line = parseStdin()) != null) {
			num = Integer.parseInt(line);
		}

		return num;
	}

	private static double[] parsePoint() {
		String		line  = null;
		String[]	split = null;
		double[]	point = null;

		if ((line = parseStdin()) != null) {
			split    = line.split(",");
			point    = new double[4];
			point[0] = Double.parseDouble(split[0]);
			point[1] = Double.parseDouble(split[1]);
		}

		return point;
	}

	private static String parseStdin() {
		String	stdin = null;

		try {
			stdin = br.readLine();
		}
		catch (IOException e) {}

		return stdin;
	}
}

class MyPolygon extends ArrayList<double[]> {
	private	static	double[]	oPos = null;

	public void AddEx(double[] element) {
		int	len = size();

		if (len == 0) {
			oPos = element;
		}
		else {
			if (element[1] < oPos[1] || (element[1] == oPos[1] && element[0] < oPos[0])) {
				oPos = element;
			}
		}

		add(element);
		Collections.sort(this, new MyComparator());
	}

	public void removeEx(double[] element) {
		int	len = size();

		if (oPos[0] == element[0] && oPos[1] == element[1]) {
			oPos = null;
		}

		remove(element);
		len = size();

		if (oPos == null && len > 0) {
			double[]	tPos = get(0);
			oPos = tPos;

			for (int n = 1; n < len; n++) {
				tPos = get(n);
				if (tPos[1] < oPos[1] || (tPos[1] == oPos[1] && tPos[0] < oPos[0])) {
					oPos = tPos;
				}
			}
		}

		Collections.sort(this, new MyComparator());
	}

	public void removeUselessPos() {
		// 同じ直線状に点があれば削除する（点が3個登録されている場合）
		removeSameLinePos();
	
		// 図形の内側に点があれば削除する（点が4個以上登録されている場合）
		removeInnerPos();
	}

	private void removeSameLinePos() {
		int	len = size();
		if (len == 3) {
			for (int n = 1; n >= 0; n--) {
				double[]	pos1 = get(n);
				double[]	pos2 = get(n+1);
				if (pos1[3] == pos2[3]) {
					remove(n);
				}
			}
		}
	}
	
	private void removeInnerPos() {
		int	len = size();
		if (len > 3) {
			for (int i = size() - 1; i >= 0; i--) {
				double[]	pos  = get(i);
				int			sign = 1;

				// 図形を構成する点を取り出す
				removeEx(pos);
				len = size();
				for (int j = 0; j < len && sign != -1; j++) {
					sign = getCrossSign(get(j), get((j + 1) % len), pos);
				}

				if (sign == -1) {
					// 残りの点で構成される図形の外側に点があれば戻す
					AddEx(pos);
				}
			}
		}
	}
	
	private static int getCrossSign(double[] da, double[] db, double[] dp) {
		double[]	dab = { db[0] - da[0], db[1] - da[1] };
		double[]	dap = { dp[0] - da[0], dp[1] - da[1] };
		return ( getCross(dab, dap) >= 0.0 ) ? 1 : -1;
	}

	private static double getCross(double[] d1, double[] d2) {
		return d1[0] * d2[1] - d1[1] * d2[0];	// x1*x2 + y1*y2
	}

	class MyComparator implements Comparator<double[]> {
		public int compare(double[] pos1,double[] pos2){
			pos1[2] = Math.sqrt(Math.pow(pos1[1] - oPos[1], 2.0) + Math.pow(pos1[0] - oPos[0], 2.0));
			pos1[3] = Math.atan2(pos1[1] - oPos[1], pos1[0] - oPos[0]);
			pos2[2] = Math.sqrt(Math.pow(pos2[1] - oPos[1], 2.0) + Math.pow(pos2[0] - oPos[0], 2.0));
			pos2[3] = Math.atan2(pos2[1] - oPos[1], pos2[0] - oPos[0]);

			return (pos1[3] == pos2[3]) ? (pos1[2] == pos2[2]) ? 0 : (pos1[2] < pos2[2]) ? -1 : 1 : (pos1[3] < pos2[3]) ? -1 : 1;
		}
	}
}