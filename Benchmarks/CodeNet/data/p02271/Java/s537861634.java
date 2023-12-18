
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		s = br.readLine().split(" ");
		check(0, 0);
		int q = Integer.parseInt(br.readLine());
		String[] m = br.readLine().split(" ");
		for (int i = 0; i < q; i++) {
			System.out.println(makable[Integer.parseInt(m[i])] ? "yes" : "no");
		}
	}
	public static void check(int i, int sum) {
		if (sum >= max) return;
		makable[sum] = true;
		if (i == n) return;
		check(i + 1, sum);
		check(i + 1, sum + Integer.parseInt(s[i]));
	}
	public static int n;
	public static String[] s;
	public static int max = 2001;
	public static boolean[] makable = new boolean[max];
}