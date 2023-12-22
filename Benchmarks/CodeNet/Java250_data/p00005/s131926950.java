import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class Main {
	public static void main(String... args) {
		Main m = new Main();
		m.solve();
		m.close();
	}

	Scanner sc;
	PrintWriter pw;
	public Main() {
		sc = new Scanner(System.in);
		pw = new PrintWriter(System.out);
	}
	private void close() {
		pw.flush();
		pw.close();
	}
	private void solve() {
		while(sc.hasNextLong()) {
			BigInteger a = BigInteger.valueOf(sc.nextLong());
			BigInteger b = BigInteger.valueOf(sc.nextLong());
			pw.printf("%d %d\n",gcd(a,b),lcm(a,b));
		}
	}
	// 最大公約数
	public BigInteger gcd(BigInteger l, BigInteger r){
		return l.gcd(r);
	}
	// 最小公倍数
	public BigInteger lcm(BigInteger l, BigInteger r){
		return l.multiply(r).divide(l.gcd(r));
	}
}