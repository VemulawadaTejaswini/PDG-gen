import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = n;
		StringBuilder org = new StringBuilder();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 32; i++) {
		    org.append(a % 2);
		    sb.append((a % 2 + 1) % 2);
		    a /= 2;
		}
		System.out.println(org.reverse());
		System.out.println(sb.reverse());
		sb = new StringBuilder();
		for (int i = 0; i < 32; i++) {
		    sb.append(n % 2);
		    n /= 2;
		}
		sb.append(0);
		sb.reverse();
		sb.append(0);
		System.out.println(sb.substring(2));
		System.out.println(sb.substring(0, 32));
	}
}

