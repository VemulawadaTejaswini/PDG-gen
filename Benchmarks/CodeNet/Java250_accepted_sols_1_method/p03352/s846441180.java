import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		double ans = 0;
		int max = 1;

		if (x==1) {
			System.out.println(x);
			return;
		}

		for (int i=2;i<=x;i++) {
			for (int j=2;j<=10;j++) {
				ans = Math.pow(i, j);
				if ((ans <= x) && (ans > max)) {
						max = (int)ans;
				}
			}
		}

		System.out.println(max);

		scan.close();

	}

}
