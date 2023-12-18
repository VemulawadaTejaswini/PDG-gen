import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int flag = 0;

		for (int i = 1; i <= n; ++i) {
			if (i % 3 == 0) {
				System.out.print(" " + i);
			} else {
				char[] c = String.valueOf(i).toCharArray();
				for (int j = 0; j < c.length; j++) {
					if (c[j] == '3') {
						flag = 1;
					}
				}
				if (flag == 1) {
					System.out.print(" " + i);
					flag = 0;
				}
			}
		}
		System.out.println();
		sc.close();
	}
}

