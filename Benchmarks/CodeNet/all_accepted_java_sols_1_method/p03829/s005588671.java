import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long a = sc.nextInt();
		long b = sc.nextInt();
		long total = 0;
		int prev = sc.nextInt();
		for (int i = 1; i < n; i++) {
		    int x = sc.nextInt();
		    total += Math.min(b, (x - prev) * a);
		    prev = x;
		}
		System.out.println(total);
   }
}


