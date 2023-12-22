import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if (x <= 3) {
			System.out.println(1);
			sc.close();
			return;
		}

		int sqrt = (int) Math.sqrt(x);
		int maxp = 2;
		double maxans = 1;
		while (true) {
			if (Math.pow(2, maxp) < x) {
				maxp++;
			} else {
				maxp--;
				maxans = Math.pow(2, maxp);
				break;
			}
		}
		for (int i = 3; i <= sqrt; i++) {
			while (Math.pow(i, maxp) > x) {
				maxp--;
			}
			if (Math.pow(i, maxp) > maxans) {
				maxans = Math.pow(i, maxp);
			}
		}
		System.out.println((int) maxans);

		sc.close();
	}
}