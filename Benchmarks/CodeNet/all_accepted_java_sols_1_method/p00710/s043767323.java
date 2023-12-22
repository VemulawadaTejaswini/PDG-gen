import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int n = sc.nextInt();/* 山の枚数 */
			int r = sc.nextInt();/* 切る回数 */
			if(n == 0) break;
			
			int[] yama = new int[n];
			for(int i = 0; i < n; i++) {
				yama[i] = i + 1;
			}
			
			for(int i = 0; i < r; i++) {
				int p = sc.nextInt();/* c枚の開始点 */
				int c = sc.nextInt();/* 切る枚数 */
				
				int mid = n - (p - 1), min = mid - c;
				int[] cut = new int[c];/* シャッフルの一時保存先 */
				System.arraycopy(yama, min, cut, 0, c);/* コピー */
				
				System.arraycopy(yama, mid, yama, min, p - 1);/* ずらし */				
				System.arraycopy(cut, 0, yama, n-c, c);/* コピーの戻し */
			}
			System.out.println(yama[n-1]);
		}
	}

}

