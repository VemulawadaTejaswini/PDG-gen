import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int sum = 0;
		for (int i = 0; i < n - 1; i++) {
			sum += a[i];
		}
		if (a[n - 1] < sum) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
