import java.util.Scanner;


public class Main {
		public static void main (String args[]) throws Exception{
		Scanner scan = new Scanner(System.in);
		int  n = scan.nextInt();
		long ans = 1;
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
		
		for(int i = 0; i < n; i++) {
			try {
				ans = ans *  a[i];
			} catch(Exception e) {
				ans = -1;
				break;
			}
			if(max < ans || ans < 0) {
				ans = -1;
				break;
			}
		}
		System.out.println(ans);
	}
}