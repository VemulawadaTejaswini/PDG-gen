import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		if(Math.abs(n - m) >= 2) {
			System.out.println(0);
		} else if(Math.abs(n - m) >= 1) {
			int max = Math.max(n, m);
			int min = Math.min(n, m);
			long sum = 1;
			for(long i = 1 ; i <= max ; i++) {
				sum = sum * i % 1000000007;
			}
			for(long i = 1 ; i <= min ; i++) {
				sum = sum * i % 1000000007;
			}
			System.out.println(sum);
		} else {
			long sum = 1;
			for(long i = 1 ; i <= n ; i++) {
				sum = sum * i % 1000000007;
			}
			for(long i = 1 ; i <= n ; i++) {
				sum = sum * i % 1000000007;
			}
			sum = sum * 2 % 1000000007;;
			System.out.println(sum);
		}
	}
}
