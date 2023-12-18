import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null) {
			
			double[][] p = new double[4][2];

			int i = 0;
			for (String s : line.split(",")) {
				switch (i) {
				case 0:
					p[0][0] = Double.parseDouble(s);
					break;
				case 1:
					p[0][1] = Double.parseDouble(s);
					break;
				case 2:
					p[1][0] = Double.parseDouble(s);
					break;
				case 3:
					p[1][1] = Double.parseDouble(s);
					break;
				case 4:
					p[2][0] = Double.parseDouble(s);
					break;
				case 5:
					p[2][1] = Double.parseDouble(s);
					break;
				case 6:
					p[3][0] = Double.parseDouble(s);
					break;
				case 7:
					p[3][1] = Double.parseDouble(s);
					break;
				}
				i++;
			}
			boolean isConvex = true;
			for (int j = 0; j < 4; j++) {
				// line1: 隣接する座標との線分を合成した線分の長さの 1/2
				// line2: 隣接しない座標との線分の長さ
				double line1, line2;
				switch (j) {
				case 0:
					line1 = (getLenght(p[0], p[1]) + getLenght(p[0], p[3])) / 2;
					line2 = getLenght(p[0], p[2]);
					isConvex &= (line2 > line1 ? true : false);
					break;
				case 1:
					line1 = (getLenght(p[1], p[2]) + getLenght(p[1], p[0])) / 2;
					line2 = getLenght(p[1], p[3]);
					isConvex &= (line2 > line1 ? true : false);
					break;
				case 2:
					line1 = (getLenght(p[2], p[3]) + getLenght(p[2], p[1])) / 2;
					line2 = getLenght(p[2], p[0]);
					isConvex &= (line2 > line1 ? true : false);
					break;
				case 3:
					line1 = (getLenght(p[3], p[0]) + getLenght(p[3], p[2])) / 2;
					line2 = getLenght(p[3], p[1]);
					isConvex &= (line2 > line1 ? true : false);
					break;
				}
			}
			if (isConvex)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

	public static double getLenght(double[] p1, double[] p2) {
		return Math.sqrt(Math.pow(p1[0] - p2[0], 2)
				+ Math.pow(p1[1] - p2[1], 2));
	}
}