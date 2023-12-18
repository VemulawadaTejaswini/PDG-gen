import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long k = sc.nextLong();
		long d = sc.nextLong();
		long ax = Math.abs(x);
		long num = ax/d;
		if(ax==d&&k%2==0) {
			System.out.println(ax);
			return;
		}
		if(num >= k) {
			System.out.println(ax-(k*d));
		}
		else if(num < k) {
			ax -= num*d;
			for(int i = 0; i < k-num;i++) {
				ax = Math.abs(ax-d);
			}
			System.out.println(ax);
		}
	}
}