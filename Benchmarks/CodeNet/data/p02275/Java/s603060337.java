import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main {
  	
	final static int k = 10000;
	
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] A = new int[n];
		int[] B = new int[n];
		
		String[] str = br.readLine().split(" ");
		for(int i = 0; i < n; i++){
			A[i] = Integer.parseInt(str[i]);
		}
		
		CountingSort(A, B, n);
		for(int i = 0; i < n; i++){
			if(i != n - 1){
				System.out.print(B[i] + " ");
			}else{
				System.out.println(B[i]);
			}
		}
	}
	
	public static void CountingSort(int[] A, int[] B, int n){
		int[] C = new int[10001];
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