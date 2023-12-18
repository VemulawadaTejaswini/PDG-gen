import java.util.Scanner;

class Main {
	public static int sum = 0;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[] S = new int[n];
		
		for(int i = 0; i < n; i++) {
			S[i] = scan.nextInt();
		}
		
		margeSort(S, 0, n);

		for(int i = 0; i < n; i++) {
			System.out.print(S[i]);
			
			if(i < n - 1) System.out.print(" ");
		}

		System.out.println();
		System.out.println(sum);
		
		scan.close();
	}
	
	static void marge(int[] A, int left, int mid, int right) {
		int n1 = mid - left;
		int n2 = right - mid;

		int L[] = new int[n1 + 1];
		int R[] = new int[n2 + 1];
		
		for(int i = 0; i < n1; i++) {
			L[i] = A[left + i];
		}
		
		for(int i = 0; i < n2; i++) {
			R[i] = A[mid + i];
		}
		
		L[n1] = Integer.MAX_VALUE;
		R[n2] = Integer.MAX_VALUE;
		
		int i = 0;
		int j = 0;
		
		for(int k = left; k < right; k++) {
			sum++;
			if(L[i] <= R[j]) {
				A[k] = L[i];
				i++;
				
			} else {
				A[k] = R[j];
				j++;
			}
		}
	}
	
	 static void margeSort(int[] A, int left, int right) {
		if(left + 1 < right) {
			int mid = (left + right) / 2;
			
			margeSort(A, left, mid);
			margeSort(A, mid, right);
			marge(A, left, mid, right);
		}
	}
}