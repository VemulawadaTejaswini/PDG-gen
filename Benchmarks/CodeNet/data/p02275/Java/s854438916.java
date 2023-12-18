//API???????????????
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main {
  	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] A = new int[n];
		int[] B = new int[n];
		int k = 0;
		
		String[] str = br.readLine().split(" ");
		for(int i = 0; i < n; i++){
			A[i] = Integer.parseInt(str[i]);
			k = Math.max(k, A[i]);
		}
		
		CountingSort(A, B, n, k);
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++){
			if(i != n - 1){
				sb.append(B[i] + " ");
			}else{
				sb.append(B[i]);
			}
		}
		System.out.println(sb);
	}
	
	public static void CountingSort(int[] A, int[] B, int n, int k){
		int[] C = new int[k + 1];
		int i;
		
		for(i = 0; i < n; i++){
			C[A[i]]++;
		}
		for(i = 1; i <= k; i++){
			C[i] += C[i - 1];
		}
		for(i = n - 1; i >= 0; i--){
			B[C[A[i]] - 1] = A[i];
			C[A[i]]--;
		}
	}
} 