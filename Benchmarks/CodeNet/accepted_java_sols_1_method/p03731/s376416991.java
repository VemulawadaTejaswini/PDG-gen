import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int prev = sc.nextInt();
		long len = t;
		for (int i = 1; i < n; i++) {
		    int x = sc.nextInt();
		    len += Math.min(x - prev, t);
		    prev = x;
		}
		System.out.println(len);
	}
}
