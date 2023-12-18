import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long max = 0;
		for (int i = 0; i < 5; i++) {
		    long x = sc.nextLong();
		    max = Math.max(max, (n + x - 1) / x);
		}
		System.out.println(max + 4);
   }
}
