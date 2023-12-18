import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int[] w = new int[n];
		w[0] = sc.nextInt();
		for (int i = 1; i < n; i++) {
			w[i] = w[i - 1] + sc.nextInt();
		}
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			min = Math.min(min, Math.abs(w[i] - (w[n - 1] - w[i])));
		}
		System.out.println(min);
	}
}
