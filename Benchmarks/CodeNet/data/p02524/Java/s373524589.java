import static java.lang.Math.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		String[] in = new BufferedReader(new InputStreamReader(System.in)).readLine().split(" ");
		double a = Double.parseDouble(in[0]), b = Double.parseDouble(in[1]), C = toRadians(Double.parseDouble(in[2]));
		System.out.println((a*b*sin(C))/2); // S = 1/2*a*b*sin(theta)
		System.out.println(a+b+sqrt(pow(a, 2)+pow(b, 2)-(2*a*b*cos(C)))); // L = a+b+sqrt(a^2 + b^2 - 2*a*b*cos(theta))
		System.out.println(b*sin(C)); // h = b*sin(theta)
	}
}