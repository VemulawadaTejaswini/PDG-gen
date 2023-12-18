import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[]x = new int[n];
			for(int j = 0; j < n; j++) {
				x[j] = sc.nextInt();
			}
			if(k >= n) {
				sb.append(0).append("\n");
			}else {
				int []l = new int[n - 1];
				int sum = 0;
				for(int j = 0; j < n - 1; j++) {
					l[j] = x[j + 1] - x[j];
					sum += l[j];
				}
				Arrays.sort(l);
				for(int j = 0; j < k - 1; j++) {
					sum -= l[n - 2 - j];
				}
				sb.append(sum).append("\n");
			}
		}
		sc.close();
		System.out.print(sb.toString());
	}
}
