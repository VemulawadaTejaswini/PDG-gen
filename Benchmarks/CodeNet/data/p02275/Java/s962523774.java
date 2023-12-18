import java.io.IOException;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws IOException {
		int max = 0; // 各要素におけるMAX値(k)
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); // 要素の個数
		 StringBuilder sb = new StringBuilder();
		int[] num = new int[n]; // 個数のリスト
		int[] B = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = scan.nextInt();
			max = Math.max(max,num[i]);
		}
		
		
		/*	if (max < num[i]) {
				max = num[i];
			}
			*/
		
		scan.close();
		 CountingSort(num, B,max);
		 
		 sb.append(B[0]);
	        for (int i = 1; i<n ; i++ ) {
	            sb.append(" ").append(B[i]);
	        }
	  
	        System.out.println(sb);

		 
		 
/*		 System.out.print(B[0]);
		for (int i = 1; i < n; i++) {
		
				System.out.print(" "+B[i]);
		
		}
		System.out.println();
		*/
	}

	/**
	 * 計数ソート
	 * 
	 * @param A
	 *            入力リスト
	 * @param k
	 *            リスト要素の最大値
	 * @param n
	 *            リストの個数
	 * @return ソート後のリスト
	 */
	public  static void CountingSort(int[] A, int[] B ,int k) {
		int n = A.length;
		//int[] B = new int[n];
		int[] C = new int[k+1];
	/*	for (int i = 0; i < k; i++) { // initialize
			C[i] = 0;
		}
		*/

		for (int j = 0; j <= n - 1; j++) {
			C[A[j]]++;
		}
		for (int i = 1; i <= k; i++) {
			C[i] = C[i] + C[i - 1];
		}
		for (int j = n - 1; j >= 0; j--) {
			
			B[C[A[j]]-1] = A[j];
			C[A[j]]--;
		}

	//	return B;
	}
}

