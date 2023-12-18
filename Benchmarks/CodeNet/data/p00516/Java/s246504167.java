import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int M = sc.nextInt();

		int[] A = new int[N];

		int[] B = new int[M];

		int[] C = new int[N];

		for(int i=0;i<N;i++) {

			A[i] = sc.nextInt();
		}

		for(int i=0;i<M;i++) {

			B[i] = sc.nextInt();
		}

		Arrays.fill(C, 0);

		int a,b;

		for(int i=0;i<M;i++) {

			b = B[i];

			for(int j=0;j<N;j++) {

				a = A[j];

				if(a<=b) {

					C[j]++;

					break;
				}
			}
		}

		int r = 0;

		int ans = 0;

		for(int i=0;i<N;i++) {

			if(C[i]>r) {

				r = C[i];

				ans = i;
			}
		}

		System.out.println(ans+1);
	}

}

