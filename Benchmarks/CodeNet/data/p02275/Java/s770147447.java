import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) throws Exception {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//int n = Integer.parseInt(br.readLine());
		 Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
		// 1オリジンの配列を用いる
		int []A = new int[n + 1];
		int []B = new int[n + 1];
		int max = 0;
		//Arrays.fill(A, 0);
		//String s = br.readLine();


		for(int i = 1; i <= n; i++) {
			int k = scan.nextInt();
			A[i] = k;
			max = Math.max(max, k);
		}
		scan.close();
		//br.close();
//		String []A1 = s.split(" ");
//		for(int i = 0; i < n; i++) {
//			//int k = Integer.parseInt(A1[i]);
//			int k = new Integer(A1[i]).intValue();
//			A[i + 1] = k;
////			if(max < k) {
////				max = k;
////			}
//			max = Math.max(max, k);
//		}

		CountingSort(A, B, max, n);
		StringBuilder sb = new StringBuilder();
		sb.append(B[1]);
		for(int i = 2; i <= n; i++) {
			sb.append(' ').append(B[i]);
		}
		System.out.println(sb);
	}
	public static void CountingSort(int[] A, int[] B, int k, int n) {
		int []C = new int[k + 1];
		Arrays.fill(C, 0);
		for(int j = 1; j <= n; j++) {
			C[A[j]] ++;
		}
		for(int i = 1; i <= k; i++) {
			C[i] = C[i] + C[i - 1];
		}
		for(int j = n; j >= 1; j--) {
			B[C[A[j]]] = A[j];
			C[A[j]] --;
		}
	}
}
