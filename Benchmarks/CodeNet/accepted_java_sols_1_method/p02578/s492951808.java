public class Main {
	public static void main(String[] args) {
		var sc = new java.util.Scanner(System.in);
		var n = sc.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}
		long cnt = 0;
		long tmpMax = a[0];
		for (int i = 1; i < n; i++) {
			if (tmpMax > a[i]) {
				cnt += tmpMax - a[i];
			} else {
				tmpMax = a[i];
			}
		}
		System.out.println(cnt);
	}
}
