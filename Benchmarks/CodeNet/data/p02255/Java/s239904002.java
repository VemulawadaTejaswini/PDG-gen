import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int A[] = new int[n];
		for(int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		for(int z = 0; z < n; z++) {
			System.out.print(A[z]);
			if(z < n-1) {
				System.out.print(" ");
			}
		}
		System.out.println("");
		for (int j = 1; j < A.length; j++) {
			int key = A[j];
			int i = j - 1;
			while(i >= 0 && A[i] > key) {
				A[i + 1] = A[i];
				i--;
			}
			A[i + 1] = key;
			for(int z = 0; z < n; z++) {
				System.out.print(A[z]);
				if(z < n-1) {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}

