import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int a[][] = new int[n][7];
		int answer = 0;
		if (s.charAt(0) == 'J') {
			a[0][0] = 0;
			a[0][1] = 0;
			a[0][2] = 0;
			a[0][3] = 1;
			a[0][4] = 1;
			a[0][5] = 1;
			a[0][6] = 1;
		} else if (s.charAt(0) == 'O') {
			a[0][0] = 0;
			a[0][1] = 0;
			a[0][2] = 0;
			a[0][3] = 0;
			a[0][4] = 0;
			a[0][5] = 1;
			a[0][6] = 1;

		} else if (s.charAt(0) == 'I') {
			a[0][0] = 0;
			a[0][1] = 0;
			a[0][2] = 0;
			a[0][3] = 0;
			a[0][4] = 1;
			a[0][5] = 0;
			a[0][6] = 1;
		}
		for (int i = 1; i < n; i++) {
			if (s.charAt(i) == 'J') {
				a[i][3] += a[i - 1][3] + a[i - 1][4] + a[i - 1][5]
						+ a[i - 1][6];
				a[i][4] += a[i - 1][0] + a[i - 1][2] + a[i - 1][3]
						+ a[i - 1][4] + a[i - 1][5] + a[i - 1][6];
				a[i][5] += a[i - 1][1] + a[i - 1][2] + a[i - 1][3]
						+ a[i - 1][4] + a[i - 1][5] + a[i - 1][6];
				a[i][6] += a[i - 1][0] + a[i - 1][1] + a[i - 1][2]
						+ a[i - 1][3] + a[i - 1][4] + a[i - 1][5] + a[i - 1][6];
			} else if (s.charAt(i) == 'I') {
				a[i][0] += a[i - 1][0] + a[i - 1][2] + a[i - 1][4]
						+ a[i - 1][6];
				a[i][2] += a[i - 1][0] + a[i - 1][1] + a[i - 1][2]
						+ a[i - 1][4] + a[i - 1][5] + a[i - 1][6];
				a[i][4] += a[i - 1][0] + a[i - 1][2] + a[i - 1][3]
						+ a[i - 1][4] + a[i - 1][5] + a[i - 1][6];
				a[i][6] += a[i - 1][0] + a[i - 1][1] + a[i - 1][2]
						+ a[i - 1][3] + a[i - 1][4] + a[i - 1][5] + a[i - 1][6];
			} else if (s.charAt(i) == 'O') {
				a[i][1] += a[i - 1][1] + a[i - 1][2] + a[i - 1][5]
						+ a[i - 1][6];
				a[i][2] += a[i - 1][0] + a[i - 1][1] + a[i - 1][2]
						+ a[i - 1][4] + a[i - 1][5] + a[i - 1][6];
				a[i][5] += a[i - 1][1] + a[i - 1][2] + a[i - 1][3]
						+ a[i - 1][4] + a[i - 1][5] + a[i - 1][6];
				a[i][6] += a[i - 1][0] + a[i - 1][1] + a[i - 1][2]
						+ a[i - 1][3] + a[i - 1][4] + a[i - 1][5] + a[i - 1][6];
			}
			for (int j = 0; j < 7; j++) {
				a[i][j] = a[i][j] % 10007;
			}
		}
		for (int i = 0; i < 7; i++) {
			answer += a[n - 1][i];
		} answer = answer%10007;

		System.out.println(answer);
	}
}