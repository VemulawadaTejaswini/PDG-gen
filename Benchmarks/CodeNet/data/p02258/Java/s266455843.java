
import java.util.Scanner;

/**
 * 外汇交易赚取汇率差，计算价格差的最大值
 * 	输入：
 * 		第一行输入整数n，接下来n行依次给整数赋值
 * 	输出：
 * 		在单独一行中输出最大值
 * 	限制：
 * 		2 <= n <= 200 000
 * 		1 <= R <= 10^9
 * 
 * @author MZ21G
 */
public class Main {
	
	public static void main(String[] args) {
	
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		int arrR[] = new int [n];
		
		for (int i = 0; i < n; i++) {
			arrR[i] = scanner.nextInt();
		}
		
		int maxv = Integer.MIN_VALUE;
		/**
		 * 使用下列方法复杂度会为n^2,无法再限制时间内完成处理
		 */
//		for (int i = 1; i < n; i++) {
//			for (int j = 0; j < i; j++) {
//				int profit = arrR[i] - arrR[j];
//				if (maxv < profit) {
//					maxv = profit;
//				}
//			}
//		}
		int minv = arrR[0];
		for (int i = 1; i < n; i++) {
			if (maxv < arrR[i] - minv) {
				maxv = arrR[i] - minv;
			}
			if (minv > arrR[i]) {
				minv = arrR[i];
			}
			
		}
		
		
		
		System.out.println(maxv);
		
	}
	
}

