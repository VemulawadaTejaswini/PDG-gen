import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int A[] = new int[n];
		int B[] = new int[n];
		int k=0;
		for(int i=0; i<n; i++){
			A[i] = sc.nextInt();
			if(k < A[i]) k = A[i];
		}
		countingSort(A, B, k);
		StringBuilder sb = new StringBuilder();
		sb.append(B[0]);
		for(int i=1; i<n; i++){
			sb.append(" "+B[i]);
		}
		System.out.println(sb.toString());
	}
	static void countingSort(int A[], int B[], int k){
		int C[] = new int[k+1];
		for(int i=0; i<k+1; i++){
			C[i] = 0;
		}
		for(int j=0; j<A.length; j++){
			C[A[j]]++;
		}
		for(int i=1; i<k+1; i++){
			C[i] += C[i-1];
		}
		for(int j=A.length-1; j>=0; j--){
			B[C[A[j]]-1] = A[j];
			C[A[j]]--;
		}
	}
}