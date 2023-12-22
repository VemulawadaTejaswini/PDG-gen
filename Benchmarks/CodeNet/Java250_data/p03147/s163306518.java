import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int prev = 0;
		long count = 0;
		for (int i = 1; i <= n; i++) {
		    int x = sc.nextInt();
		    count += Math.max(x - prev, 0);
		    prev = x;
		}
		System.out.println(count);
   }
}
