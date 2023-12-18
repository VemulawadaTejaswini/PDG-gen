import java.util.Scanner;


public class Main {

	private static int[][] cache;
	private static char[] x;
	private static char[] y;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		int set = sc.nextInt();

		for (int k = 0; k < set; k++) {
			x = sc.next().toCharArray();
			y = sc.next().toCharArray();
			int m = x.length;
			int n = y.length;
			
			// ボトムアップ型
			cache = new int[m + 1][n + 1];
			// 初期化不要(0)

			for (int i = 1; i <= m; i++) {
				for (int j = 1; j <= n; j++) {
					if (x[i - 1] == y[j - 1]) {
						cache[i][j] = cache[i - 1][j - 1] + 1;
					} else {
						cache[i][j] = Math.max(cache[i - 1][j], cache[i][j - 1]);
					}
				}
			}
			
			System.out.println(cache[m][n]);
		}
		
         sc.close();
	}
}