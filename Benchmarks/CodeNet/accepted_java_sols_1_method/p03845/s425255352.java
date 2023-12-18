import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] t = new int[sc.nextInt()];

		for (int i = 0; i < t.length; i++) {
			t[i] = sc.nextInt();
		}

		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
			int p = sc.nextInt(), x = sc.nextInt();
			int sum = 0;
			for (int j = 0; j < t.length; j++) {
				sum += j == p - 1 ? x : t[j];
			}
			System.out.println(sum);
		}
		sc.close();
	}
}