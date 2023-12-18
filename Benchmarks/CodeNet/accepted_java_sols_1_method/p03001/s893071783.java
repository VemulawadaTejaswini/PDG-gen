import java.util.*;

public class Main {
    static final int MOD = 1000000007;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		double w = sc.nextInt();
		double h = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int result = 0;
		if (x * 2 == w && y * 2 == h) {
		    result++;
		}
		System.out.println((w * h / 2.0) + " " + result);
   }
}
