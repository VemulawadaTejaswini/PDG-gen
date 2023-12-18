import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

public class Main {

	public static void main(String[] args) {
		while (read()) {
			solve();
		}
	}
	
	static Scanner sc = new Scanner(System.in);
	static int A, B;
	static boolean read() {
		A = sc.nextInt();
		B = sc.nextInt();
		return (A != 0 && B != 0) ? true : false; 
	}

	static int[] coin = {1000, 500, 100};
	static void solve() {
		int cur = B - A;
		int[] ret = new int[3];
		for (int i = 0; i < 3; i++) {
			ret[i] = cur / coin[i];
			cur -= ret[i] * coin[i];
		}
		System.out.println(ret[2] + " " + ret[1] + " " + ret[0]);
	}
}