import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			if (n == 0) {
				break;
			}
			int[] dice = new int[n];
			Arrays.fill(dice, 1);
			long sum = 0;
			LOOP: while(true) {
				int bill = 0;
				for(int i=0;i<n;i++) {
					bill += dice[i];
				}
				bill = Math.max(1, bill - k);
				sum += bill;
				
				for(int i=0;i<n;i++) {
					dice[i]++;
					if (dice[i] > m) {
						dice[i] = 1;
						if (i == n - 1) {
							break LOOP;
						}
					}else{
						break;
					}
				}
			}
			double ans = sum * Math.pow(1D / m, n);
			System.out.printf("%.7f\n", ans);
		}
	}

}