import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int q = sc.nextInt();
		int[] a = new int[q + 1];
		for (int i = 1; i < q + 1; i++)
			a[i] = sc.nextInt();
		sc.close();

		int[] score = new int[n + 1];
		for (int i = 1; i < n + 1; i++)
			score[i] = k;

		for (int i = 1; i < q + 1; i++)
			score[a[i]]++;

		for (int i = 1; i < n + 1; i++)
			System.out.println(score[i] - q > 0 ? "Yes" : "No");

	}
}
