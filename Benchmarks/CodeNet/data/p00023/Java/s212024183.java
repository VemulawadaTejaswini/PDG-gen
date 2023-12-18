import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String line = br.readLine();
			while ((line = br.readLine()) != null) {
				String[] s = line.split(" ");
				double[] a = convetInt(s);
				System.out.println(solve(a));
			}
		}	
	}
	public static double[] convetInt(String[] s) {
		double[] a = new double[s.length];
		Arrays.setAll(a, 
				(i) -> Double.parseDouble(s[i]));
		return a;
	}
	public static int solve(double[] list) {
		double dx = list[3] - list[0];
		double dy = list[4] - list[1];
		double dr = list[5] - list[2];
		double r = list[5] + list[2];
		if ((dx * dx) + (dy * dy) <= (dr * dr)) {
			return (dr >= 0) ? -2 : 2;
		}
		if ((dx * dx) + (dy * dy) <= (r * r)) {
			return 1;
		}
		return 0;
	}
}