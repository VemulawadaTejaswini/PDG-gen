import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long ans = -100100100100L;
		for(long i = 0 ; i <= n ; i++) {
			if(i * i <= n) {
				ans = Math.max(ans, i * i);
			}
		}
		System.out.println(ans);
	}
}
