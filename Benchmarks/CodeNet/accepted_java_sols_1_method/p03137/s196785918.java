import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] X = new int[M];
		for (int i=0;i<M;i++) {
			X[i] = sc.nextInt();
		}

		Arrays.sort(X);
		int[] Y = new int[M-1];
		for (int i=0;i<M-1;i++) {
			Y[i] = Math.abs(X[i+1]-X[i]);
		}
		Arrays.sort(Y);
		if (N>=M) {
			for (int i=0;i<M-1;i++) {
				Y[i] = 0;
			}
		}else if(M != 1) {
			for (int i=M-2;i>(M-2)-(N-1);i--) {
				Y[i] = 0;
			}
		}
		int sum = 0;
		for (int i=0;i<M-1;i++) {
			sum += Y[i];
		}
		System.out.println(sum);
	}
}