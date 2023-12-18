import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String S = scan.next();
		int ans = 0;

		for (int i = 0; i < 1000; i++) {

			String PIN;

			if (i < 10) {
				String T = String.valueOf(i);
				PIN = String.valueOf("00").concat(T);
			} else if (i < 100) {
				String T = String.valueOf(i);
				PIN = String.valueOf("0").concat(T);
			} else {
				PIN = String.valueOf(i);
			}

			int j = 0;

			while (PIN.charAt(0) != S.charAt(j)) {
				j++;

				if (j == N) {
					break;
				}
			}

			if (j >= N-1 || PIN.charAt(0) != S.charAt(j)) {
				continue;
			}

			j++;

			while (PIN.charAt(1) != S.charAt(j)) {
				j++;

				if (j == N) {
					break;
				}

			}

			if ( j >= N-1 || PIN.charAt(1) != S.charAt(j)) {
				continue;
			}

			j++;

			while (PIN.charAt(2) != S.charAt(j)) {
				j++;

				if (j == N) {
					break;
				}

			}

			if ( j == N || PIN.charAt(2) != S.charAt(j)) {
				continue;
			} else {
				ans += 1;
			}

		}

		System.out.println(ans);

		scan.close();

	}
}
