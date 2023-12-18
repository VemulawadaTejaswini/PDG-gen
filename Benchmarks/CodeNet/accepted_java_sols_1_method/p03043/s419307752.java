import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		double ans = 0;
		for(int i = 1; i <= a; i++) {
			double tmp = 1.0 / a;
			int now = i;
			while(now < b) {
				now *= 2;
				tmp /= 2;
			}
			ans += tmp;
		}
		System.out.println((double)ans);
	}
}