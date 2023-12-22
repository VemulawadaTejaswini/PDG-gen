import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double n = scan.nextInt();
		double m = scan.nextInt();
		double d = scan.nextInt();
		scan.close();
		if(d == 0) {
			double ans = (m - 1) / n;
			System.out.printf("%1.6f",ans);
		}else {
			double ans = 2 * (m - 1)*(n -d) / (n * n);
			System.out.printf("%1.6f",ans);
		}

	}
}