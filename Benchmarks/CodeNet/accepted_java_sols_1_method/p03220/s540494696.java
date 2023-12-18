import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		int t =scan.nextInt();
		int a =scan.nextInt();
		int h[] = new int[n];
		for (int i = 0; i < n; i++) {
			h[i] = scan.nextInt();
		}

		double temp = Math.abs(a - (t - h[0] * 0.006));
		int ans = 0;
		for ( int i = 1; i < n; i++) {
			if (Math.abs(a - (t - h[i] * 0.006)) < temp) {
				temp = Math.abs(a - (t - h[i] * 0.006));
				ans = i;
			}
		}

		System.out.println(ans + 1);
	}
}