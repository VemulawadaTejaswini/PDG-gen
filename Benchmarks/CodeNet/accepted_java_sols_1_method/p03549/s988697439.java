import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int one = 1900 * m + 100 * (n - m);
       System.out.println(one * (int)(Math.pow(2, m)));
	}
}
