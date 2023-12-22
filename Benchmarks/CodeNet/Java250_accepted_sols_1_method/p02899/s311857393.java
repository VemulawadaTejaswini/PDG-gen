import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n + 1];

		for (int i = 0; i < n; i++) {
			a[sc.nextInt()] = i + 1;
		}

		for (int i = 0; i < n; i++) {
			System.out.print(a[i + 1] + " ");
		}

	}
}