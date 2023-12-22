import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		int sum = 0;
		int min = 200;
		int min2 = 200;
		if (l >= 0) {
			for (int i = 2; i <= n; i++) {
				sum += l + i - 1;
			}
		} else {
			for (int i = 1; i <= n; i++) {
				sum += l + i - 1;
				if (min2 > Math.abs(l + i - 1)) {
					min = l + i - 1;
					min2 = Math.abs(l + i - 1);
				}
			}
			sum = sum - min;
		}
		System.out.println(sum);
	}
}