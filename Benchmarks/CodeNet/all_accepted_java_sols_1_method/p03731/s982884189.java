import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long t = sc.nextLong();
		long total = 0;
		long prev = sc.nextLong();
		
		for (int i = 1; i < n; i++) {
			long tmp = sc.nextLong();
			total += Math.min(t, tmp - prev);
			prev = tmp;
		}
		total += t;
		System.out.println(total);
	}
}
