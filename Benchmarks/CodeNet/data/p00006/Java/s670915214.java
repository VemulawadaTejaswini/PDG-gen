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
		char[] cr = sc.nextLine().toCharArray();
		for(int i = cr.length - 1; i > -1; i--) pw.print(cr[i]);
	}
}