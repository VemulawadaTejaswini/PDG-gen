import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			int array[];
			if (n == 0 && x == 0) {
				break;
			}
			int count = 0;
			//?????¶:i>j>k??§???????????????
			for (int i = 1; i < n + 1; i++) {
				for (int j = 1; j < i; j++) {
					for (int k = 1; k < j; k++) {
						if (i + j + k == x) {
							count++;
						}
					}
				}
			}
			System.out.printf("%d\n", count);
		}

	}

}