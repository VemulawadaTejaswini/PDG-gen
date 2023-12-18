import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int min = Integer.MAX_VALUE;
		int total = 0;
		for (int i = 1; i <= n; i++) {
		    total += sc.nextInt();
		    min = Math.min(min, total / i);
		}
		System.out.println(min);
	}
}

