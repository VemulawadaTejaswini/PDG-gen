import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long k = sc.nextLong();
		long d = sc.nextLong();
		long ax = Math.abs(x);
		long num = ax/d;
		if(num >= k) {
			System.out.println(ax-k*d);
			return;
		}
		else {
			long temp = ax;
			ax -= d*num;
			for(int i = 0; i < k-num; i++) {
				ax = Math.abs(ax-d);
				if(ax==temp) {
					System.out.println(ax);
					return;
				}
				else {
					temp = ax;
				}
			}
			System.out.println(ax);
		}
	}
}