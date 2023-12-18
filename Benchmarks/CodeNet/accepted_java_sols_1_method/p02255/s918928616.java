import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] A = new int[n];

		for(int i=0; i<n; i++) {
			A[i] = scan.nextInt();
			if(i==n-1) {
				System.out.println(A[i]);
			} else {
				System.out.print(A[i]+" ");
			}
		}
		scan.close();
		for(int i=1; i<=n-1; i++) {
			int v = A[i];
			int j = i - 1;
			while(j>=0 && A[j] > v) {
				A[j+1] = A[j];
				j--;
			}
			A[j+1] = v;
			for(int k=0; k<n; k++) {
				if(k==n-1) {
					System.out.println(A[k]);
				} else {
					System.out.print(A[k]+" ");
				}
			}
		}
	}

}

