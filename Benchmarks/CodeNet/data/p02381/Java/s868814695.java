import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			int n = scan.nextInt();
			if(n == 0) {
				break;
			}
			long[] d = new long[n];
			long sum = 0;
			for(int i = 0; i < n; i++) {
				long k = scan.nextInt();
				d[i] = k;
				sum += k;
			}
			long g = 0;
			for(int i = 0; i < n; i++) {
				g += (n * d[i] - sum) * (n * d[i] - sum);
			}
			double ans = (double) g / (n * n * n);
			ans = Math.sqrt(ans);
			System.out.println(ans);
		}
		scan.close();
	}
}
