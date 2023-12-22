import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long k = sc.nextLong();
		long d = sc.nextLong();
		long ax = Math.abs(x);
		if(ax/d > k) {
			System.out.println(ax-k*d);
		}
		else {
			k -= ax/d;
			ax = ax - d*(ax/d);
			if(k%2==0) {
				System.out.println(ax);
			}
			else {
				System.out.println(Math.abs(ax-d));
			}
		}
	}
}