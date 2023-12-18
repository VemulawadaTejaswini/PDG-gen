import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

class Main
{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static Scanner sc = new Scanner(new InputStreamReader(System.in));

	public static void main (String[] args) throws java.lang.Exception {
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] A = new int[n];
		for (int i=0; i<n; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}

		int q = Integer.parseInt(br.readLine());
		int[] w = new int[q];
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<q; i++) {
			w[i] = Integer.parseInt(st.nextToken());
		}

		solve(n, A, q, w);
	}

	public static void solve(int n, int[] A, int q, int[] w) {
		for (int i=0; i<q; i++) {
			boolean result = recursive(n, A, 0, w[i]);
			String ans = result ? "yes" : "no";
			System.out.println(ans);
		}
	}

	public static boolean recursive(int n, int[] A, int indicator, int remain) {
		if (remain == 0) return true;
		if (indicator == n || remain < 0) return false;

		return recursive(n, A, indicator+1, remain) || recursive(n, A, indicator+1, remain - A[indicator]);
	}
}