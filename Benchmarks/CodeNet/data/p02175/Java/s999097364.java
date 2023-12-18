import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
		    String s = sc.next();
		    if ("nobiro".equals(s)) {
		        x = Math.max(0, x + a);
		    } else if ("tidime".equals(s)) {
		        x = Math.max(0, x + b);
		    } else if ("karero".equals(s)) {
		        x = 0;
		    }
		}
		System.out.println(x);
	}
}

