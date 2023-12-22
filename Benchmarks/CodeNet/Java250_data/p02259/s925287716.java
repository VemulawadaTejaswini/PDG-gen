import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n, i, j, num[], count = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		num = new int[n];
		for (i = 0; i < n; ++i) {
			num[i] = sc.nextInt();
		}
		sc.close();
		i = 1;
		while (i != 0) {
			i = 0;
			for (j = n - 1; j > 0; --j) {
				if (num[j - 1] > num[j]) {
					int tmp = num[j];
					num[j] = num[j - 1];
					num[j - 1] = tmp;
					i = 1;
					++count;
				}
			}
		}
		for (i = 0; i < n; ++i) {
			System.out.print(num[i]);
			if (i != n - 1) {
				System.out.print(" ");
			}
		}
		System.out.print("\n");
		System.out.println(count);
	}
}

