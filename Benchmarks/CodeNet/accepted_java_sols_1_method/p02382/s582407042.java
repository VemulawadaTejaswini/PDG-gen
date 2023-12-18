import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		Scanner scan = new java.util.Scanner(System.in);

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt( br.readLine() );
		String[] xVec = br.readLine().split(" ");
		String[] yVec = br.readLine().split(" ");

		double[] x = new double[n];
		double[] y = new double[n];
		for (int i = 0; i < n; i++) {
			x[i] = Double.parseDouble(xVec[i]);
			y[i] = Double.parseDouble(yVec[i]);
		}

		double dxy1 = 0;
		for (int i = 0; i < n; i++ ) {
			dxy1 += Math.abs(x[i] - y[i]);
		}

		double dxy2 = 0;
		for (int i = 0; i < n; i++) {
			dxy2 += (x[i] - y[i]) * (x[i] - y[i]);
		}
		dxy2 = Math.sqrt(dxy2);

		double dxy3 = 0;
		for (int i = 0; i < n; i++) {
			//dxy3 += (x[i] - y[i]) * (x[i] - y[i]) * (x[i] - y[i]);
			dxy3 += Math.pow( Math.abs(x[i] - y[i]), 3 );
		}
		dxy3 = Math.cbrt(dxy3);

		double dxyinf = 0;
		for (int i = 0; i < n; i++) {
			if ( dxyinf < Math.abs(x[i] - y[i]) ) {
				dxyinf = Math.abs(x[i] - y[i]);
			}
		}

		System.out.println(dxy1);
		System.out.println(dxy2);
		System.out.println(dxy3);
		System.out.println(dxyinf);
	}

}