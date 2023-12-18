import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		long[][] in = new long[n][3];
		for (int i = 0; i < n; i++) {
			in[i][0] = sc.nextLong();
			in[i][1] = sc.nextLong();
			in[i][2] = sc.nextLong();
		}
		long[] a = new long[n];
		long max = 0, sum = 0;
		for(int e: new int[] {-1,1}) {
			for(int f: new int[] {-1,1}) {
				for(int g: new int[] {-1,1}) {
					for (int j = 0; j < n; j++) a[j] = e*in[j][0]+f*in[j][1]+g*in[j][2];
					Arrays.parallelSort(a);
					for (int j = 0; j < m; j++) sum += a[n-j-1];
					max = Math.max(max,sum);
					sum = 0;
				}
			}
		}
		System.out.println(max);
		sc.close();
	}
}
