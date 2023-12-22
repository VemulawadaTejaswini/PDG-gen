import java.util.*;
import java.io.*;
public class Main {
	Scanner sc;
	PrintWriter pw;
	public static void main(String... args) {
		Main m = new Main();
		m.solve();
		m.close();
	}
	public Main() {
		sc = new Scanner(System.in);
		pw = new PrintWriter(System.out);
	}
	private void close() {
		pw.flush();
		pw.close();
	}
	private void solve() {
		int n = sc.nextInt();
		int m = 100000;
		for(int i = 0; i < n; i++) {
			m*=1.05f;
			int x = m%1000;
			m = x != 0 ? 1000-x+m : m;
		}
		pw.println(m);
	}
}