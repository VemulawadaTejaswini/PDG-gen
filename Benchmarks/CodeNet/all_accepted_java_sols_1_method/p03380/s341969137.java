import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long []a = new long[n];
		for(int i = 0; i < n; i++) {
			a[i] = scan.nextLong();
		}
		scan.close();
		Arrays.sort(a);
		long max = a[n - 1];
		long median1 = 0;
		long median2 = 0;
		long ans2 = 0;
		if(max % 2 == 0) {
			median1 = max / 2;
			long min = (median1 - a[0]) * (median1 - a[0]);
			ans2 = a[0];
			for(int i = 1; i < n - 1; i++) {
				long k = (median1 - a[i]) * (median1 - a[i]);
				if(min > k) {
					min = k;
					ans2 = a[i];
				}
			}
		}else {
			median1 = max / 2 ;
			median2 = max / 2 + 1;
//			System.out.prlongln(median1);
//			System.out.prlongln(median2);
			long k1 = (median1 - a[0]) * (median1 - a[0]);
			long k2 = (median2 - a[0]) * (median2 - a[0]);
			long min = 0;
			if(k1 < k2) {
				min = k1;
			}else {
				min = k2;
			}
			ans2 = a[0];
			for(int i = 1; i < n - 1; i++) {
				long min1 = (median1 - a[i]) * (median1 - a[i]);
				long min2 = (median2 - a[i]) * (median2 - a[i]);
				long k;
				if(min1 > min2) {
					k = min2;
				}else {
					k = min1;
				}
//				System.out.prlongln(min1);
//				System.out.prlongln(min2);
				if(k < min) {
					min = k;
					ans2 = a[i];
				}
			}
		}
		System.out.println(max + " " + ans2);
	}
}