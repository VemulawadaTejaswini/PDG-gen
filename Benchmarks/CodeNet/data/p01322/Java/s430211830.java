import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;
public class Main {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		while (read())
			solve();
	}
	
	static int n, m;
	static int[] M = new int[100];
	static String[] N = new String[100], B = new String[1000];
	static boolean read() {
		n = sc.nextInt(); m = sc.nextInt();
		if (n == 0 && m == 0) return false;
		for (int i = 0; i < n; i++) {
			N[i] = sc.next();
			M[i] = sc.nextInt();
		}
	
		for (int i = 0; i < m; i++) {
			B[i] = sc.next();
		}
		
		return true;
	}
	
	static void solve() {
		int res = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				boolean ok = true;
				for (int k = 7; k >= 0; k--) {
					char a = N[i].charAt(k), b = B[j].charAt(k);
					if (a == '*') break;
					else if (a != b) ok = false;
				}
				if (ok) {
					res += M[i];
				}
			}
		}
		System.out.println(res);
	}
}