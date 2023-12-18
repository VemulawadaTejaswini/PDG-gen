import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}

		for(int j = 0; j < n; j++) {
			System.out.print(A[j]);
			if(j < n - 1) {
				System.out.print(" ");
			} else {
				System.out.println();
			}
		}
		
		for (int i = 1; i < n; i++) {
			int v = A[i];
			int k = i - 1;
			while(k >=0 && A[k] > v) {
				A[k + 1] = A[k];
				k--;
				A[k + 1] = v;
			}
			for(int j = 0; j < n; j++) {
				System.out.print(A[j]);
				if(j < n - 1) {
					System.out.print(" ");
				} else {
					System.out.println();
				}
			}
		}
		sc.close();
	}

}

