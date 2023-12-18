import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] x = new int[n];
		int[] ax = new int[n];
		int num;
		for(int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			ax[i] = Math.abs(x[i]);
		}
		int min = Integer.MAX_VALUE;
		for(int i = 0; i <= n - k; i++) {
			num = Math.abs(x[i] - x[i + k - 1]) + Math.min(ax[i], ax[i + k - 1]);
			if(min > num) {
				min = num;
			}
		}
		System.out.println(min);
	}

}