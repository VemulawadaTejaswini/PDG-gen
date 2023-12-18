import java.io.*;
import java.util.*;

public class Main {
	public static void main(String arg[]) {
		Scanner in = new Scanner(System.in);
		double r = in.nextDouble();
		double pi = Math.acos(-1);
		System.out.println(String.format("%.12f", r * r * pi) + " " + 2 * r * pi);
	}
}