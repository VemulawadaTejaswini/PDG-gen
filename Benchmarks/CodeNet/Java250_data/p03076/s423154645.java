import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 5;
		int[] a = new int[n];
		int min = 10;
		int minIndex = -1;
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sc.next());
			if (a[i] % 10 != 0 && min > a[i] % 10) {
				min = a[i] % 10;
				minIndex = i;
			}
		}
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += kiriage(a[i]);
		}
		if (minIndex != -1) {
			sum -= kiriage(a[minIndex]);
			sum += a[minIndex];
		}
		System.out.println(sum);
	}

	static int kiriage(int num) {
		if (num % 10 == 0) {
			return num;
		}
		return num / 10 * 10 + 10;
	}

}
