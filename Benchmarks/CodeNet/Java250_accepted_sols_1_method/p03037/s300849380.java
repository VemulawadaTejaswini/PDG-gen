import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] L = new int[M];
		int[] R = new int[M];
		for(int i = 0; i < M; i++) {
			L[i] = sc.nextInt();
			R[i] = sc.nextInt();
		}
		int Lmax = L[0];
		int Rmax = R[0];
		int Lmin = L[0];
		int Rmin = R[0];
		for(int i = 0; i < M; i++) {
			if(Lmax < L[i]) Lmax = L[i];
			if(Lmin > L[i]) Lmin = L[i];
			if(Rmax < R[i]) Rmax = R[i];
			if(Rmin > R[i]) Rmin = R[i];

		}
		int ok = 0;

		for(int i =1; i<=N; i++) {
			if(Lmax<=i && i<=Rmin) ok++;


		}

		System.out.println(ok);


	}

}