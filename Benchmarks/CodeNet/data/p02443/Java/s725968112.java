import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int n = sc.nextInt();
			int[] A = new int[n];
			for(int i=0;i<n;i++){
				A[i] = sc.nextInt();
			}
			int q = sc.nextInt();

            int buf;
			for(int i=0;i<q;i++) {
				int b = sc.nextInt();
				int e = sc.nextInt()-1;
				for(int j=b;j<(b+e+1)/2;j++) {
					buf = A[j];
					A[j] = A[e-j+b];
					A[e-j+b] = buf;
				}
			}
			System.out.print(A[0]);
			for(int i=1;i<A.length;i++) {
				System.out.print(" " + A[i]);
			}
			System.out.println();
		}
	}
}
