import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] A = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = scan.nextInt();
		}
		for (int i = 0; i <= A.length - 1; i++) {
			int v = A[i];
			int j = i - 1;
			while (j >= 0 && A[j] > v) {
				A[j + 1] = A[j];
				j--;
			}
			A[j + 1] = v;
			for (int k = 0; k < A.length; k++) {
				System.out.print(A[k]);
				if(k<A.length-1){
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}