
import java.util.*;

class Main {
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		//整数nと整数mを受け取る
		String s1 = sc.next();
		int n = Integer.parseInt(s1);
		String s2 = sc.next();
		int m = Integer.parseInt(s2);
		
		//配列Aにはn*mの行列の値を格納
		int A[][] = new int[n][m];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				String s3 = sc.next();
				int a = Integer.parseInt(s3);
				A[i][j] = a;
			}
		}
		
		//配列bにはm*1の行列の値を格納
		int b[] = new int[m];
		for(int i = 0; i < m; i++){
			String s4 = sc.next();
			int b1 = Integer.parseInt(s4);
			b[i] = b1;
		}
		
		//配列cにはn*1行列をAとbの行列から与えられた条件通りに計算したものを格納し、cの要素を表示する
		int c[] = new int[n];
		for(int i = 0; i < n; i++){
			int sum = 0;
			for(int j = 0; j < m; j++){
				sum += A[i][j] * b[j];
			}
			c[i] = sum;
			System.out.println(c[i]);
		}
	}
}