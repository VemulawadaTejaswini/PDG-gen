import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		long[] a = new long[n];

		for (int i = 0; i < n ;  i++) {
			a[i] = scan.nextLong();
			if(a[i] == 0) {				//入力された数値が0なら"0"を出力
				System.out.print(0);
				return;					//プログラム終了
			}
		}
		
		long ans = a[0];
		for(int i = 1; i < n; i++) {
			if(a[i] <= (1000000000000000000L / ans)) {
				ans *= a[i];
			}
			else {
				System.out.print(-1);
				return;
			}
		}
		
		System.out.print(ans);
		
	}

}
