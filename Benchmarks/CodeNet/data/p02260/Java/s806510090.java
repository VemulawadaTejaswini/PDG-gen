import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		int n, i, num[];
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		num = new int[n];
		for (i = 0; i < n; ++i) {
			num[i] = sc.nextInt();
		}
		sc.close();
		for (i = 0; i < n; ++i) {
			for (int k = i + 1; k < n; ++k) {
				if (num[i] > num[k]) {
					int tmp = num[i];
					num[i] = num[k];
					num[k] = tmp;
				}
			}
		}
		for (i = 0; i < n; ++i) {
			System.out.print(num[i] + " ");
		}
		System.out.print("\n");
	}
}

