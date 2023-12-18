import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double distance1 = 0;
		double distance2 = 0;
		double distance3 = 0;
		double distance4 = 0;

		int n = Integer.parseInt(br.readLine());
		String[] x = null;
		String[] y = null;
		 x = br.readLine().split(" ");
		 y = br.readLine().split(" ");

		for (int i = 0; i < n; i++) {
			double xi = Double.parseDouble(x[i]);
			double yi = Double.parseDouble(y[i]);
			distance1 += Math.abs(xi - yi);
			distance2 += Math.pow(xi - yi, 2.0);
			distance3 += Math.pow(Math.abs(xi - yi), 3.0);
			double work = Math.abs(xi - yi);
			if (work > distance4) {
				distance4 = work;
			}
		}

		System.out.println(distance1);
		System.out.println(Math.sqrt(distance2));
		System.out.println(Math.cbrt(distance3));
		System.out.println(distance4);
	}
}