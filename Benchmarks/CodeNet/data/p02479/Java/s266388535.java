import java.io.*;
import java.util.*;

public class Main {
	public static void main(String arg[]) {
		Scanner in = new Scanner(System.in);
		double r = in.nextFloat();
		double pi = Math.acos(-1);
		System.out.println(r * r * pi + " " + 2 * r * pi);
	}
}