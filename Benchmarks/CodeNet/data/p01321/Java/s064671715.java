import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

public class Main {
	
	public static void main(String[] args) {
		while (read()) {
			solve();
		}
	}
	
	static int N;
	static int[] ss;
	static Scanner sc = new Scanner(System.in);
	static boolean read() {
		N = sc.nextInt();
		if (N == 0) return false;
		
		ss = new int[N];
		fill(ss, 0);
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 5; j++) {
				ss[i] += sc.nextInt();
			}
		}
		return true;
	}
	
	static void solve() {
		sort(ss);
		System.out.println(ss[N - 1] + " " + ss[0]);
	}
	

}