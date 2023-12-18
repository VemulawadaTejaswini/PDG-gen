import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		int a[];
		int b[];
		int maxNumber;
		boolean flag;

		n = sc.nextInt();
		a = new int[10];
		b = new int[10];
		for (int i = 0; i < n; i++) {
			maxNumber = -1;
			flag = true;
			for (int j = 0; j < 10; j++) {
				a[j] = sc.nextInt();
				b[j] = 0;
				if (maxNumber < a[j]) {
					maxNumber = a[j];
					b[j] = 1;
				}
			}
			maxNumber = -1;
			for (int j = 0; j < 10 && flag; j++) {
				if (b[j] == 0) {
					if (maxNumber < a[j]) {
						maxNumber = a[j];
					} else {
						flag = false;
					}
				}
			}
			if (flag) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}