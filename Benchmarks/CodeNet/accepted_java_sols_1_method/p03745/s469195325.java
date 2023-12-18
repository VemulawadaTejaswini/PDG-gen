import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String strN = sc.next();
		int N = Integer.parseInt(strN);

		boolean isHigh = false;
		boolean isLow = false;
		boolean isFirst = true;

		int count = 1;
		int b = Integer.parseInt(sc.next());

		for (int i = 1; i < N; i++) {
			int a = Integer.parseInt(sc.next());
			if (b == a) {
				continue;
			}

			if (b < a) {
				b = a;
				if (!isLow) {
					isFirst = false;
					isHigh = true;
					continue;
				}
			} else {
				b = a;
				if (!isHigh) {
					isFirst = false;
					isLow = true;
					continue;
				}
			}
			count++;

			if (!isFirst) {
				isHigh = false;
				isLow = false;
				isFirst = true;
			}

		}
		System.out.println(count);

	}

}
