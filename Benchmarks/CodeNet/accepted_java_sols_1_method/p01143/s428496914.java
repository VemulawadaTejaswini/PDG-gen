
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			int p = scan.nextInt();
			int[] x = new int[100];
			int sumMem = 0;
			int sumGold = 0;
			int givingSumGold = 0;
			int givenGold = 0;

			if (n == 0 && m == 0 && p == 0)
				break;

			for (int i = 0; i < n; i++) {
				x[i] = scan.nextInt();
				sumMem += x[i];
			}

			sumGold = sumMem * 100;
			givingSumGold = sumGold * (100 - p);

			if (x[m - 1] != 0) {
				givenGold =  givingSumGold / (x[m - 1]*100);
				System.out.println(givenGold);
			} else {
				System.out.println(0);
			}

		}

		scan.close();
	}
}