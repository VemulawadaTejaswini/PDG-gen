import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


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
		double[][]	point = null;

		while ((point = parsePoint()) != null) {
			System.out.printf("%.6f %.6f\n", point[3][0], point[3][1]);
		}
	}

	private static double[][] parsePoint() {
		String		line  = null;
		String[]	split = null;
		double[][]	point = null;

		if ((line = parseStdin()) != null) {
			if (!line.isEmpty()) {
				split       = line.split(",");
				point       = new double[4][3];
				point[0][0] = Double.parseDouble(split[2]) - Double.parseDouble(split[0]);
				point[0][1] = Double.parseDouble(split[3]) - Double.parseDouble(split[1]);
				point[0][2] = distance(point[0]);
				point[1][0] = Double.parseDouble(split[4]) - Double.parseDouble(split[0]);
				point[1][1] = Double.parseDouble(split[5]) - Double.parseDouble(split[1]);
				point[1][2] = distance(point[1]);
				point[2][0] = product(point[0], point[1]);
				point[2][1] = cross(point[0], point[1]);
				point[2][2] = -Math.atan2(point[2][1], point[2][0]);
				point[3][0] = (point[0][0] * Math.cos(point[2][2]) - point[0][1] * Math.sin(point[2][2]));
				point[3][0] = point[3][0] / point[0][2] * point[1][2];
				point[3][0] = point[3][0] + Double.parseDouble(split[0]);
				point[3][1] = (point[0][0] * Math.sin(point[2][2]) + point[0][1] * Math.cos(point[2][2]));
				point[3][1] = point[3][1] / point[0][2] * point[1][2];
				point[3][1] = point[3][1] + Double.parseDouble(split[1]);
			}
		}

		return point;
	}

	// ベクトルの内積
	private static double product(double[] v1, double[] v2) {
		return (v1[0] * v2[0] + v1[1] * v2[1]);
	}

	// ベクトルの外積
	private static double cross(double[] v1, double[] v2) {
		return v1[0] * v2[1] - v1[1] * v2[0];
	}

	// ベクトル距離
	private static double distance(double[] v) {
		return Math.sqrt(v[0] * v[0] + v[1] * v[1]);
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