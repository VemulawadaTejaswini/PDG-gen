import java.util.*;

public class Main {
    static long total = 0;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		long count = 0;
		int prev = sc.nextInt();
		if (prev > x) {
		    count += prev - x;
		    prev = x;
		}
		for (int i = 1; i < n; i++) {
		    int a = sc.nextInt();
		    if (prev + a > x) {
		        int sub = prev + a - x;
		        count += sub;
		        a -= sub;
		    }
		    prev = a;
		}
		System.out.println(count);
	}
}
