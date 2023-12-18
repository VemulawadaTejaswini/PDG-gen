package sample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

class Main {
	public static void main(String[] arg) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		ArrayList<Integer> ls = new ArrayList<Integer>();
		while (line != null) {
			String[] sl = line.split(" ");
			double a = Double.parseDouble(sl[0]);
			double b = Double.parseDouble(sl[1]);
			int gcd = getGCD(a, b, ls);
			getLCM(a, b, gcd);
			line = br.readLine();
		}
	}

	private static void getLCM(double a, double b, int gcd) {
		double tmp = a / gcd * b;
		int tmp2 = (int) tmp;
		System.out.println(tmp2);
	}

	private static int getGCD(double a, double b, ArrayList<Integer> ls) {
		int gcd = 0;
		for (int i = 1; i < a; i++) {
			if ((a % i) == 0)
				ls.add(i);
		}
		for (int i = 0; i < ls.size(); i++) {
			if ((b % ls.get(i)) == 0)
				gcd = ls.get(i);
		}
		System.out.println(gcd);
		ls.clear();
		return gcd;
	}
}