import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long m = sc.nextInt();
		long ans;
		if (n >= 2 && m >= 2) {
			ans = (n - 2) * (m - 2);
		} else if (n == 1 && m == 1) {
			ans = 1;
		} else{
			ans = n * m - 2;
		}
		System.out.println(ans);
	}
}
