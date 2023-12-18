import java.util.Scanner;

class Main {
	public static void bubble(int[] A) {
		int N = A.length;
        for(int k=0;k<N;k++) {
            System.out.print(String.format("%d%s", A[k], (k==N-1 ? "" : " ")));
        }
		System.out.println("");
		for(int i=1;i<N;i++) {
			int v = A[i];
			int j = i - 1;
			while (j >= 0 && A[j] > v) {
				A[j+1] = A[j];
				j--;
			}
			A[j+1] = v;
			for(int k=0;k<N;k++) {
				System.out.print(String.format("%d%s", A[k], (k==N-1 ? "" : " ")));
			}
			System.out.println("");
		}
	}
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int A[] = new int[n];
		in.nextLine();
		String[] A_str = in.nextLine().split(" ");
		for(int i=0;i<n;i++) A[i] = Integer.parseInt(A_str[i]);

		bubble(A);
	}
}