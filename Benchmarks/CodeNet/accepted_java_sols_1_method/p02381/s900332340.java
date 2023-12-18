import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while(true) {
			int n = in.nextInt();
			if(n==0) return;
			int sum = 0;
			int[] darr = new int[n];
			for (int i = 0; i < n; i++) {
				darr[i] = in.nextInt();
				sum += darr[i];
			}
			double m = (double)sum / n;
			double bunsan = 0.0;
			for(int i=0;i<n;i++) {
				bunsan += Math.pow(darr[i] - m, 2.0);
			}
			bunsan /= n;
			System.out.println(Math.sqrt(bunsan));
		}
	}
}