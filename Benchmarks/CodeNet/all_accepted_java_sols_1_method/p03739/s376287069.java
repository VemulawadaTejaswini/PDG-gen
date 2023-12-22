import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) a[i] = sc.nextInt();
		long sum = 0, cnt = 0;
		for(int i = 0 ; i < n ; i++) {
			sum += a[i];
			if(i % 2 == 0 && sum <= 0) {
				// 正に変える
				cnt += Math.abs(sum) + 1;
				sum = 1;
			} else if(i % 2 == 1 && sum >= 0) {
				// 負に変える
				cnt += sum + 1;
				sum = -1;
			}
		}
		long sum1 = 0, cnt1 = 0;
		for(int i = 0 ; i < n ; i++) {
			sum1 += a[i];
			if(i % 2 == 0 && sum1 >= 0) {
				// 負に変える
				cnt1 += sum1 + 1;
				sum1 = -1;
			} else if(i % 2 == 1 && sum1 <= 0) {
				// 正に変える
				cnt1 += Math.abs(sum1) + 1;
				sum1 = 1;
			}
		}
		System.out.println(Math.min(cnt, cnt1));
	}
}