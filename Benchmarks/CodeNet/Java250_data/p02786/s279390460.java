import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long H = sc.nextLong();
		long t = 1;
		long ans = 0;
		
		while (H >= t) {
			ans += t;
			t *= 2;
		}
		System.out.println(ans);
	}
}