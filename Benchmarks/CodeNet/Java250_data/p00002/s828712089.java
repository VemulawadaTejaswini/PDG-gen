import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;
public class Main {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		while (read()) {
			solve();
		}
	}
	
	static int a, b;
	static boolean read() {
		if (!sc.hasNextInt()) return false;
		a = sc.nextInt(); b = sc.nextInt();
		return true;
	}
	
	static void solve() {
		int sum = a + b, res = 0;
		while (sum > 0) {
			sum /= 10;
			res++;
		}
		System.out.println(res);
	}
}