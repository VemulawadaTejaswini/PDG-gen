import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		long[] a = new long[n];
		long ans = 1;
		long c = 1000000000;
		long b = 1000000000;
		long lim = c * b;
		boolean judge = false;

		for (int i = 0; i < n ;  i++) {
			a[i] = scan.nextLong();
			if(a[i] > lim) {
				judge = true;
			}
			ans *= a[i];
		}
		
		
		if(ans > lim || judge == true) {
			System.out.println("-1");
		}
		else {
			System.out.println(ans);
		}
	}

}
