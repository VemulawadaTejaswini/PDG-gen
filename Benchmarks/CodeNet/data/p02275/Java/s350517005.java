import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		short A[] = new short[n];
		short B[] = new short[n];
		short k=0;
		for(int i=0; i<n; i++){
			A[i] = (short)sc.nextInt();
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
	static void countingSort(short A[], short B[], short k){
		short C[] = new short[k+1];
		for(int i=0; i<A.length; i++){
			C[A[i]]++;
		}
		for(int i=1; i<k+1; i++){
			C[i] += C[i-1];
		}
		for(int i=A.length-1; i>=0; i--){
			B[C[A[i]]-1] = A[i];
			C[A[i]]--;
		}
	}
}