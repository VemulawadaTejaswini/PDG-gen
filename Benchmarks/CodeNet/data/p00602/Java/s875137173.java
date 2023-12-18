import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int V, d, N;
	static int[] fib = new int[1001];
	
	public static void main(String[] args) {
		N = 1001;
		fib[0] = 1; fib[1] = 2;
		for (int i = 2; i < 1001; i++)
			fib[i] = (fib[i - 1] + fib[i - 2]) % N;
		
		while (read()) {
			solve();
		}
	}
	
	static boolean read() {
		if (!sc.hasNextInt()) return false;
		V = sc.nextInt();
		d = sc.nextInt();
		return true;
	}
	
	static void solve() {
		UF uf = new UF(V + 1);
		for (int i = 1; i <= V; i++) {
			for (int j = i + 1; j <= V; j++) {
				if (abs(fib[i] - fib[j]) < d) {
					uf.merge(i, j);
				}
			}
		}
		
		int res = 0;
		for (int i = 1; i <= V; i++) {
			if (i == uf.find(i))
				res++;
		}
		System.out.println(res);
	}	
}

class UF {
	int[] p, r;
	
	UF(int n) {
		p = new int[n];
		r = new int[n];
		for (int i = 0; i < n; i++) {
			p[i] = i;
			r[i] = 0;
		}
	}
	
	int find(int x) {
		if (x == p[x]) return p[x];
		else return p[x] = find(p[x]);
	}
	
	void merge(int x, int y) {
		x = find(x);
		y = find(y);
		if (x == y) return;
		
		if (r[x] < r[y]) p[x] = y;
		else {
			p[y] = x;
			if (r[x] == r[y]) r[x]++; 
		}
	}
}