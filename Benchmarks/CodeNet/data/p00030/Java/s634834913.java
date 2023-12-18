import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

// AOJ 0030
public class Main {

	static Scanner sc = new Scanner(System.in);
	static int N, S, ans;
	public static void main(String[] args) {
		while (true) {
			N = sc.nextInt(); S = sc.nextInt();
			if (N == 0 && S == 0) break;
			ans = 0;
			rec(0, N, 0);
			System.out.println(ans);
		}
	}
	
	static void rec(int i, int n, int sum) {
		if (n == 0) {
			if (sum == S) ans++;
			return;
		}
		
		if (i > 9) return;
		for (int j = i; j <= 9; j++) {
			rec(j + 1, n - 1, sum + j);
		}
	}
}