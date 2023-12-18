import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long V = sc.nextLong();
		long B = sc.nextLong();
		long W = sc.nextLong();
		long T = sc.nextLong();
		sc.close();
		long a = A;
		long b = B;
		if (A < 0) a *= -1;
		if (B < 0) b *= -1;
		if(a > b) {
			long tmp = b;
			b = a;
			a = tmp;
		}
		boolean ok = false;
		for(int i = 1; i < T; i++) {
			long postA = a + (i * V);
			long postB = b + (i * W);
			if(postA == postB) {
				ok = true;
				break;
			}
		}
		prtln(ok ? "YES" : "NO");
	}
	public static <T> void prtln(T t) { System.out.println(t); }
}
