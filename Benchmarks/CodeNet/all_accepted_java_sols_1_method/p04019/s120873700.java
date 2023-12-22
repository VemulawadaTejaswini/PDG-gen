import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	final static PrintStream so = System.out;
	final static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String str = sc.next();
		boolean n = str.contains("N");
		boolean s = str.contains("S");
		boolean e = str.contains("E");
		boolean w = str.contains("W");
		
		so.println(n^s || e^w ? "No" : "Yes");
	}
}
