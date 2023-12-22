import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/**
		 * お札を定義します
		 */
		
		int a = 10000;
		int b = 5000;
		int c  = 1000;
		
		/**
		 *入力を取得します 
		 */
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int y = sc.nextInt();
		
		/**
		 * 計算部分
		 */
		
		int bol = 0;
		int total;
		cal : for (int i = 0 ; i <= n ; i++) {
			for (int j = 0 ; j <= n - i ; j++) {
				total = a * i + b * j + c * (n - i - j);
				if (total == y) {
					bol = 1;
					System.out.println(i + " " + j + " " + (n - i - j));
					break cal;
				} 

			}
			
		}
		if (bol != 1) {
			System.out.println("-1 -1 -1");
		}

		
	}

}
