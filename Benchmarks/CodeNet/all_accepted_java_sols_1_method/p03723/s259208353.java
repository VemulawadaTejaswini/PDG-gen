import java.util.*;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		long a = sc.nextInt();
		long b = sc.nextInt();
		long c = sc.nextInt();
		int ret = 0;
		for (int i = 0;i < 100000000;i++) {
			if (a%2!=0||b%2!=0||c%2!=0) {
				System.out.println(ret);
				return;
			}
			long ta = a/2;
			long tb = b/2;
			long tc = c/2;
			a = tb + tc;
			b = ta + tc;
			c = ta + tb;
			ret++;
		}
		System.out.println(-1);
	}
}
