import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int M = scan.nextInt();
		int A[];
		int B[];
		int X[];
		Integer Y[];
		Integer count = 0;
		int f = 0;

		A = new int[M];
		B = new int[M];
		X = new int[N];		//その部屋に置く道しるべの値．
		Y = new Integer[N];	//その部屋から部屋1に辿り着くために必要な移動回数．
		Y[0] = 0;

		for(int i = 0; i < M; i++) {
			A[i] = scan.nextInt();
			B[i] = scan.nextInt();
		}

		while(Arrays.asList(Y).contains(null)) {
			for(int i = 0; i < N; i++) {
				if(Y[i] == count) {
					for(int j = 0; j < M; j++) {
						if(A[j] - 1 == i) {
							if(Y[B[j] - 1] != count) {
								X[B[j] - 1] = i + 1;
								Y[B[j] - 1] = count + 1;
							}
							A[j] = 0;
							B[j] = 0;
						}
						if(B[j] - 1 == i) {
							if(Y[A[j] - 1] != count) {
								X[A[j] - 1] = i + 1;
								Y[A[j] - 1] = count + 1;
							}
							A[j] = 0;
							B[j] = 0;
						}
					}
				}
			}
			count++;
			System.out.println(Arrays.toString(X));
			System.out.println(Arrays.toString(Y));
		}

		System.out.println("Yes");
		for(int i = 1; i < N; i++) {
			System.out.println(X[i]);
		}
	}
}
