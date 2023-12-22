import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, x;
		int sum = 0;
		int[] count = new int[300];
		int index;
		for (index = 0; true; index++) {
			n = sc.nextInt();
			x = sc.nextInt();
			if (n == 0 && x == 0) {
				break;
			}
			for (int i = 1; i < n; i++) {
				sum += i;
				for (int j = i + 1; j <= n; j++) {
					sum += j;
					for (int k = j + 1; k <= n; k++) {
						sum += k;
						if (sum == x) {
							count[index]++;
						}
						sum -= k;
					}
					sum -= j;
				}
				sum -= i;
			}
		}
		for (int i = 0; i < index; i++) {
			System.out.println(count[i]);
		}
		sc.close();
	}
}
