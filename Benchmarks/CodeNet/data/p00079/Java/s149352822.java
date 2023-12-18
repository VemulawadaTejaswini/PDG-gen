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
		double[]	point   = null;
		MyPolygon	polygon = new MyPolygon();

		while ((point = parsePoint()) != null) {
			polygon.AddEx(point);
		}

		System.out.printf("%.6f\n", polygon.calcSum());
	}

	private static double[] parsePoint() {
		String		line  = null;
		String[]	split = null;
		double[]	point = null;

		if ((line = parseStdin()) != null) {
			if (!line.isEmpty()) {
				split    = line.split(",");
				point    = new double[4];
				point[0] = Double.parseDouble(split[0]);
				point[1] = Double.parseDouble(split[1]);
			}
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

	public void clearEx() {
		clear();
		oPos = null;
	}

	public double calcSum() {
		int			max = size();
		double		z   = 0.0;
		double		sum = 0.0;
		double[][]	tmp = new double[2][];
		double[]	len = new double[3];

		if (max >= 3) {
			for (int n = 1; n < max - 1; n++) {
				tmp[0] = get(n);
				tmp[1] = get(n + 1);
				len[0] = tmp[0][2];
				len[1] = tmp[1][2];
				len[2] = Math.sqrt(Math.pow(tmp[0][1] - tmp[1][1], 2.0) + Math.pow(tmp[0][0] - tmp[1][0], 2.0));
				z      = (len[0] + len[1] + len[2]) / 2.0;
				sum   += Math.sqrt(z*(z - len[0])*(z - len[1])*(z - len[2]));
			}
		}

		return sum;
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