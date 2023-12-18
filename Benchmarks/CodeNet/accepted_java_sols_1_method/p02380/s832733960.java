import java.io.*;
import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		double a = Double.parseDouble(s.next());
		double b = Double.parseDouble(s.next());
		double c = Double.parseDouble(s.next());

		
		double h = b * Math.sin(Math.toRadians(c));
		double S = a * h / 2;
		double a1 = b * Math.cos(Math.toRadians(c));
		double a2 = a - a1;
		double d = Math.sqrt(Math.pow(a2, 2) + Math.pow(h, 2));
		double L = a + b + d;
		System.out.println(String.format("%.8f", S));
		System.out.println(String.format("%.8f", L));
		System.out.println(String.format("%.8f", h));
	}

}