import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			int[] s = new int[n];
			int sum = 0;
			for(int i=0;i<n;i++) {
				s[i] = sc.nextInt();
				sum += s[i];
			}
			double m = (double) sum / n;
			double squareSum = 0;
			for(int i=0;i<n;i++) {
				squareSum += (s[i] - m) * (s[i] - m);
			}
			double sigma = Math.sqrt(squareSum/n);
			System.out.println(sigma);
		}
	}

}