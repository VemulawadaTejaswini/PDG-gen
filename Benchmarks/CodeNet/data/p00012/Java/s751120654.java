import java.util.Scanner;


public class Main {
	private	static	Scanner		m_stdin = null;
	private	static	double[]	m_point = null;
	private	static	double[]	m_dist  = null;

	static {
		m_stdin = new Scanner(System.in);
		m_dist  = new double[2];
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][]	aMatrix = null;

		while ((aMatrix = parseMatrix()) != null) {
			calc(aMatrix);
		}
	}

	private static double[][] parseMatrix() {
		double[][]	aMatrix = null;
		String		line    = m_stdin.nextLine();

		if (line != null) {
			if (!line.isEmpty()) {
				String[]	lines = line.split(" ");
				double	dx1 = Double.parseDouble(lines[0]);
				double	dy1 = Double.parseDouble(lines[1]);
				double	dx2 = Double.parseDouble(lines[2]);
				double	dy2 = Double.parseDouble(lines[3]);
				double	dx3 = Double.parseDouble(lines[4]);
				double	dy3 = Double.parseDouble(lines[5]);

				aMatrix = new double[3][3];

				aMatrix[0][0] = (dx2 - dx1) * 2.0;
				aMatrix[0][1] = (dy2 - dy1) * 2.0;
				aMatrix[0][2] = (dx2 * dx2) - (dx1 * dx1) + (dy2 * dy2) - (dy1 * dy1);

				aMatrix[1][0] = (dx3 - dx2) * 2.0;
				aMatrix[1][1] = (dy3 - dy2) * 2.0;
				aMatrix[1][2] = (dx3 * dx3) - (dx2 * dx2) + (dy3 * dy3) - (dy2 * dy2);

				aMatrix[2][0] = (dx1 - dx3) * 2.0;
				aMatrix[2][1] = (dy1 - dy3) * 2.0;
				aMatrix[2][2] = (dx1 * dx1) - (dx3 * dx3) + (dy1 * dy1) - (dy3 * dy3);

				m_point    = new double[2];
				m_point[0] = dx1;
				m_point[1] = dy1;
				m_dist[0]  = Double.parseDouble(lines[6]);
				m_dist[1]  = Double.parseDouble(lines[7]);
			}
		}

		return aMatrix;
	}

	private static void calc(double[][] aMatrix) {
		int nFinRow = 0;
		int nActRow = -1;

		for(int nCols = 0; nCols < aMatrix[0].length - 1; nCols++) {
			nActRow = -1;

			// 全ての行のnCols番目の列の要素が1になるように行の要素を除算する
			for(int nRols = 0; nRols < aMatrix.length; nRols++) {
				if ((nFinRow & 1 << nRols) != 0) {
					continue;
				}

				if (aMatrix[nRols][nCols] != 0.0) {
					if (nActRow == -1) {
						nActRow = nRols;
						nFinRow = nFinRow | 1 << nRols;
					}

					for(int nLoop = aMatrix[0].length - 1; nLoop >= nCols; nLoop--) {
						aMatrix[nRols][nLoop] /= aMatrix[nRols][nCols];
					}
				}
			}

			// 全ての列の要素から最初に要素を1にした列の要素を減算する
			for(int nRols = 0; nRols < aMatrix.length; nRols++) {
				if (aMatrix[nRols][nCols] != 0.0 && nRols != nActRow) {
					for(int nLoop = aMatrix[0].length - 1; nLoop >= nCols; nLoop--) {
						double	dWork = aMatrix[nRols][nCols] * aMatrix[nActRow][nLoop];
						aMatrix[nRols][nLoop] -= dWork;
					}
				}
			}
		}

		{
			double da = 0.0;
			double db = 0.0;
			double dr = 0.0;
			double dd = 0.0;

			for(int nRols = 0; nRols < aMatrix.length; nRols++) {
				if (aMatrix[nRols][0] == 1.0) {
					da = aMatrix[nRols][2];
				}
				if (aMatrix[nRols][1] == 1.0) {
					db = aMatrix[nRols][2];
				}
			}

			dr = Math.sqrt(((m_point[0] - da) * (m_point[0] - da)) + ((m_point[1] - db) * (m_point[1] - db)));
			dd = Math.sqrt(((da - m_dist[0]) * (da - m_dist[0])) + ((db - m_dist[1]) * (db - m_dist[1])));

			if (dd < dr) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}
}