import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}
		int sum = 0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < n; j++) {
				sum += (x[j]-i)*(x[j]-i);
			}
			min = Math.min(min,sum);
			sum = 0;
		}
		System.out.println(min);
		sc.close();
	}
}