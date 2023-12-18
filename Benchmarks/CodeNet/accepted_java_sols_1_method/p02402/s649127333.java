import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n];

		for (int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
		}

		int max = num[0];
		int min = num[0];
		long sum = 0;

		for (int a : num) {
			if (a > max) {
				max = a;
			}
			if (a < min) {
				min = a;
			}
			sum += a;
		}
		System.out.println(min + " " + max + " " + sum);
		}

}

