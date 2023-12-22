import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String[] set1 = br.readLine().split(" ");
		String[] set2 = br.readLine().split(" ");
		double[] x = new double[n];
		double[] y = new double[n];

		for (int i = 0; i < n; i++) {
			x[i] = Double.parseDouble(set1[i]);
			y[i] = Double.parseDouble(set2[i]);
		}

		double D1 = 0d, D2 = 0d, D3 = 0d;
		double Dmax = Math.abs(x[0] - y[0]);
		double abs;
		for (int i = 0; i < n; i++) {
			abs = Math.abs(x[i] - y[i]);
			D1 += abs;
			D2 += Math.pow(abs, 2);
			D3 += Math.pow(abs, 3);
			if (abs > Dmax) {
				Dmax = abs;
			}
		}

		System.out.println(D1 + "\n" + Math.pow(D2, 1d / 2d) + "\n" + Math.pow(D3, 1d / 3d) + "\n" + Dmax);
	}
}