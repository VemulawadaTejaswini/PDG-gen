import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int[][] a = new int[5][2];
		int max = 0, sum = 0;
		for (int i = 0; i < 5; i++) {
			a[i][0] = sc.nextInt();
			if (a[i][0] % 10 == 0) {
				a[i][1] = a[i][0];
			} else {
				a[i][1] = (a[i][0] / 10 + 1) * 10;
			}
			max = Math.max(max, a[i][1] - a[i][0]);
			sum += a[i][1];
		}
		sum = sum - max;
		System.out.println(sum);
	}
}