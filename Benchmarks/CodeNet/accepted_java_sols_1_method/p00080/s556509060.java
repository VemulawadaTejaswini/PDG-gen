import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while (!"-1".equals((line = br.readLine()))) {
			double q = Double.parseDouble(line);
			double xn = q / 2.0;
			double checkVal = xn * xn * xn - q;
			while (Math.abs(checkVal) >= 0.00001 * q) {
				xn = xn - (checkVal) / (xn * xn * 3.0);
				checkVal = xn * xn * xn - q;
			}
			System.out.printf("%f", xn);
			System.out.println();

		}
	}
}