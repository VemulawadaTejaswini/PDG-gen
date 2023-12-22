import java.util.*;
 
public class Main {
	static int count = 0;
 
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
 
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] K = new int[N];
		int[][] A = new int[N][100];
		for (int i=0; i<N; i++) {
			K[i] = sc.nextInt();
			for (int j=0; j<K[i]; j++) {
				A[i][j] = sc.nextInt();
			}
		}
 
		int[][] matrix = new int[N][M];
		for (int i=0; i<N; i++) {
			for (int j=0; j<K[i]; j++) {
				matrix[i][A[i][j]-1] = 1;
			}
		}
		
		int[] check = new int[M];
		for (int i=0; i<M; i++) {
			for (int j=0; j<N; j++) {
				check[i] += matrix[j][i];
			}
			
			if(check[i]==N) {
				count++;
			}
		}
		
		System.out.println(count);
 
	}
 
}