import java.util.*;
import java.io.*;

class Main {
	static PrintStream out = System.out;
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		Main main = new Main();
		main.solv();
	}
	private void solv() {
		int n = in.nextInt();
		int[] a = new int[n];
		int max = 0;
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
			max = Math.max(max, a[i]);
		}
		Ft ft = new Ft(max+1);
		long cnt = 0; 
		for (int i = 1; i <= n; i++) {
			int v = a[i-1];
			cnt += i - ft.sum(v+1) - 1;
			ft.add(v+1, 1);
		}
		out.println(cnt);
	}

	private static class Ft {
		int n;
		int[] bit;
		Ft(int n) {
			this.n = n;
			this.bit = new int[n+1];
		}
		public void add(int a, int w) {
			for (int x = a; x <= n; x += x & -x) {
				bit[x] += w;
			}
		}
		public int sum(int a) {
			int ret = 0;
			for (int x = a; x > 0; x -= x & -x) {
				ret += bit[x];
			}
			return ret;
		}
	}
}