import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();
			if (n == 0) break;
			long mss = Long.MIN_VALUE, s = 0;
			for (int i = 0; i < n; i++) {
				s += sc.nextInt();
				if (mss < s) mss = s;
				if (s < 0) s = 0;
			}
			System.out.println(mss);
		}

	}

}