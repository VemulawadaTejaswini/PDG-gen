import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] bArr = new int[n];
		int total = 0;
		int prev = Integer.MAX_VALUE;
		for (int i = 1; i < n; i++) {
		    int x = sc.nextInt();
		    total += Math.min(prev, x);
		    prev = x;
		}
		total += prev;
		System.out.println(total);
	}
}
