import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		double sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += (Math.pow(0.5, count(i, k)) / n);
		}
		System.out.println(sum);
	}


	private static int count(int i, int k) {
		int countDouble = 0;
		while(i < k) {
			i *= 2;
			countDouble++;
		}
		return countDouble;
	}
}
