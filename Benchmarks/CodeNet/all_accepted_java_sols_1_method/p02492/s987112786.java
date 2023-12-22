import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i = 0;
		int j = 0;
		int a[] = new int[100];
		int b[] = new int[100];
		int ans[] = new int[100];
		char op[] = new char[100];

		while (true) {
			a[i] = sc.nextInt();
			op[i] = sc.next().charAt(0);
			b[i] = sc.nextInt();

			if (op[i] == '?') {
				break;
			} else {
				switch (op[i]) {
				case '+':
					ans[i] = a[i] + b[i];
					break;

				case '-':
					ans[i] = a[i] - b[i];
					break;

				case '*':
					ans[i] = a[i] * b[i];
					break;

				case '/':
					ans[i] = a[i] / b[i];
					break;
				}
			}
			i++;
			if (i >= 99)
				break;
		}

		while (j < i) {
			// System.out.printf("%d %c %d = %f\n", a[j], op[j], b[j], ans[j]);
			System.out.printf("%d\n", ans[j]);
			j++;
		}
	}
}