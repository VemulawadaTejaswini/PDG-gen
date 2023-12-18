import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.util.Scanner;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		double a, b, C;
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		a = Double.parseDouble(str.split(" ")[0]);
		b = Double.parseDouble(str.split(" ")[1]);
		C = Double.parseDouble(str.split(" ")[2]);
		double sin = Math.sin(Math.toRadians(C));
		double cos = Math.cos(Math.toRadians(C));
		Double S = a * b * sin / 2;
		Double y = a * a + b * b - 2 * a * b * cos;
		Double x = Math.sqrt(y);
		// Double x = 2 * S - a - b;
		// Double y = -(S * S / (x * (x - a) * (x - b))) + x;
		System.out.println(S);
		System.out.println(x + a + b);
		System.out.println(sin * b);
	}
}

