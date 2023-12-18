import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int a = sc.nextInt();
			if (a == 0) {
				sc.close();
				break;
			}

			int b = sc.nextInt();
			int d = sc.nextInt();

			int[] ans = new int[2];
			int x = 0;
			int y = 0;
			int minNum = Integer.MAX_VALUE;
			int minWeight = Integer.MAX_VALUE;
			for (int i = 0; i < 50000; i++) {
				x = i;
				if (d - a * i > 0 && (d - a * i) % b == 0) {
					y = (d - a * i) / b;
					if (minNum >= x + y && minWeight >= a * x + b * y) {
						minNum = x + y;
						minWeight = a * x + b * y;
						ans[0] = x;
						ans[1] = y;
					}
				} else if (a * i - d >= 0 && (a * i - d) % b == 0) {
					y = (a * i - d) / b;
					if (minNum >= x + y && minWeight >= a * x + b * y) {
						minNum = x + y;
						minWeight = a * x + b * y;
						ans[0] = x;
						ans[1] = y;
					}

				} else if ((d + a * i) % b == 0) {
					y = (d + a * i) / b;
					if (minNum >= x + y && minWeight >= a * x + b * y) {
						minNum = x + y;
						minWeight = a * x + b * y;
						ans[0] = x;
						ans[1] = y;
					}
				}
			}

			System.out.println(ans[0] + " " + ans[1]);
		}
	}
}