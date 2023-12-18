import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

// AOJ 0057
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while (sc.hasNextInt()) {
			int n = sc.nextInt();
			System.out.println((1 + n * (n + 1) / 2));
		}
	}
}