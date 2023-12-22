import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}

		boolean flg = true;

		int count = 0;
		while (flg) {
			flg = false;
			for (int j=N-1; j>0; j--) {
				if (A[j]<A[j-1]) {
					int tmp = A[j];
					A[j] = A[j-1];
					A[j-1] = tmp;
					count++;
					flg = true;
				}
			}
		}
		for (int i=0; i<N; i++) {
			if (i!=0) {
				System.out.print(" ");
			}
			System.out.print(A[i]);
		}
		System.out.println();
		System.out.println(count);

		sc.close();
	}

}