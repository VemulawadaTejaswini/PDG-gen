import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	static PrintStream o = System.out;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		if (sc.nextInt() == 0) {
			o.println(1);
		} else {
			o.println(0);
		}
	}
}