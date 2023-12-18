import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}
		sc.close();
		long ret = 0L;
		long kijun = a[0];
		for(int i = 1; i < n; i++) {
			if(kijun > a[i]) {
				ret += kijun - a[i];
			} else {
				kijun = a[i];
			}
		}
		prtln(ret);
	}
	public static <T> void prtln(T t) { System.out.println(t); }
}
