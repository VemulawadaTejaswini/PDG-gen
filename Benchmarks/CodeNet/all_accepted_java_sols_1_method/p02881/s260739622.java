import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		sc.close();
		long a = 0;
		long b = 0;
		long ans = Long.MAX_VALUE;
		for(int i = 1; i <= Math.sqrt(n); i++) {
			if(n%i == 0) {
				a = i;
				b = n/i;
				ans = Math.min(ans, b+a-2);
				}
			}
		System.out.println(ans);

		}
	}