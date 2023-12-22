import java.util.Scanner;


public class Main {
		public static void main (String args[]) throws Exception{
		Scanner scan = new Scanner(System.in);
		int  n = scan.nextInt();
		long a[] = new long[n];
		Long max = Long.parseLong("1000000000000000000");
		// 0が含まれる場合
		for(int i = 0; i < n; i++) {
			a[i] = scan.nextLong();
			if(a[i] == 0) {
				System.out.println(0);
				return;
			}
		}
		long ans = a[0];
		for(int i = 1; i < n; i++) {
			if(ans > max / a[i]) {
				ans = -1;
				break;
			} else {
				ans = ans * a[i];
			}
		}
		System.out.println(ans);
	}
}