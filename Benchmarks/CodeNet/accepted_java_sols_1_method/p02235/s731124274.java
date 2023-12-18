import java.util.Scanner;


public class Main {

	private static int[] cache;
	private static char[] x;
	private static char[] y;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		int set = sc.nextInt();

		for (int k = 0; k < set; k++) {
			x = sc.next().toCharArray();
			y = sc.next().toCharArray();
			if (y.length > x.length) {
				char[] temp = x;
				x = y;
				y = temp;
			}
			int m = x.length;
			int n = y.length;
			
			// ボトムアップ型、メモリ節約２
			cache = new int[n + 1];
			// 初期化不要(0)

			for (int i = 1; i <= m; i++) {
				int temp_1 = 0;
				int temp = 0;
				for (int j = 1; j <= n; j++) {
					if (x[i - 1] == y[j - 1]) {
						temp = cache[j - 1] + 1;
					} else {
						temp = Math.max(cache[j], temp_1);
					}
					cache[j - 1] = temp_1;
					temp_1 = temp;
				}
				cache[n] = temp;
			}
			
			System.out.println(cache[n]);
		}
		
         sc.close();
	}
}