import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
/**
 *それぞれ b: 4棟, f: 3階, r: 10部屋
 *三次元配列で表す。
 * 
 */
		int[][][] A = new int[4][3][10];
		for(int i = 0; i < n; i++) {
			int b = sc.nextInt() - 1;
			int f = sc.nextInt() - 1;
			int r = sc.nextInt() - 1;
			int v = sc.nextInt();
			A[b][f][r] += v;
		}
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 3; j++) {
				for(int k = 0; k < 10; k++) {
					System.out.print(" " + A[i][j][k]);
				}
				System.out.println("");
			}
			if(i == 3) {
			
				break;
			}
			System.out.println("####################");
		}
		
		sc.close();
	}
}

