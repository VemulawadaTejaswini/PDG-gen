import java.util.*;

public class Main{
	static int cmps = 0;

	static void merge(int[] A, int left, int mid, int right){
		int n1 = mid - left;
		int n2 = right - mid;
		int[] L = new int[n1+1];
		int[] R = new int[n2+1];
		for(int i = 0; i < n1; i++) L[i] = A[left + i];
		for(int i = 0; i < n2; i++) R[i] = A[mid + i];
		L[n1] = Integer.MAX_VALUE;
		R[n2] = Integer.MAX_VALUE;
		int i = 0;
		int j = 0;
		for(int k = left; k < right; k++){
			if(L[i] < R[j]){
				A[k] = L[i];
				i++;
				cmps++;
			}else{
				A[k] = R[j];
				j++;
				cmps++;
			}
		}
	}

	static void mergeSort(int[] A, int left, int right){
		if(left+1 < right){
			int mid = (left + right) / 2;
			mergeSort(A, left, mid);
			mergeSort(A, mid, right);
			merge(A, left, mid, right);
		}
	}

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in).useDelimiter("[\\s]+");
		int n = scan.nextInt();
		int[] S = new int[n];
		for(int i = 0; i < n; i++){
			S[i] = scan.nextInt();
		}
		mergeSort(S, 0, n);
		System.out.print(S[0]);
		for(int i = 1; i < n-1; i++)
			System.out.print(" "+ S[i]);
		System.out.println("");
		System.out.printf("%d\n", cmps);
	}
}