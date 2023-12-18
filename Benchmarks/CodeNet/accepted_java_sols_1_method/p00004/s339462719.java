import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("0.000");
		String str = br.readLine();
		while (str != null) {
			String[] datasetstr = str.split(" ", 6);
			int a = Integer.parseInt(datasetstr[0]);
			int b = Integer.parseInt(datasetstr[1]);
			int c = Integer.parseInt(datasetstr[2]);
			int d = Integer.parseInt(datasetstr[3]);
			int e = Integer.parseInt(datasetstr[4]);
			int f = Integer.parseInt(datasetstr[5]);
			double x = (double) (e * c - b * f) / (a * e - b * d);
			double y = (double) (a * f - c * d) / (a * e - b * d);
			Double X = new Double(x);
			Double Y = new Double(y);
			Boolean isNegativezeroX = X.equals(-0.0);
			Boolean isNegativezeroY = Y.equals(-0.0);
			if (isNegativezeroX) {
				x = -x;
			}
			if (isNegativezeroY) {
				y = -y;
			}
			System.out.println(df.format(x) + " " + df.format(y));
			str = br.readLine();
		}
	}
}