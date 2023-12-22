
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		int[] l = new int[q];
		int[] r = new int[q];
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < q; i++) {
			int ltmp = sc.nextInt();
			int rtmp = sc.nextInt();
			max = Math.max(rtmp, max);
			l[i] = ltmp;
			r[i] = rtmp;
		}
		int[] sum = new int[max + 1];
		boolean[] pri = new boolean[max + 1];
		pri[2] = true;
		for(int i = 0; i < max + 1; i++) {
			sum[i] = 0;
		}
		for(int i = 3; i < max + 1; i = i + 2) {
			boolean flag = true;
			for(int j = 3; j < i / 2; j = j + 2) {
				if(i % j == 0) {
					flag = false;
					break;
				}
			}
			if(flag)
				pri[i] = true;
			if(flag && pri[(i + 1) / 2]) {
				sum[i]++;
			}
			sum[i] += sum[i - 2];
		}
		for(int i = 0; i < q; i++) {
			int ans = 0;
			if(l[i] == 1) {
				ans += sum[r[i]] - sum[l[i]];
			} else {
				ans += sum[r[i]] - sum[l[i] - 2];
			}
			System.out.println(ans);
		}
	}

}
