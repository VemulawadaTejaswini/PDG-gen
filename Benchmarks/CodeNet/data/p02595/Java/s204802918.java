package atcoder174;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		int[] X = new int[N];
		int[] Y = new int[N];
		for(int i = 0;i < N;i++) {
			X[i] = sc.nextInt();
			Y[i] = sc.nextInt();
		}
		sc.close();

		int result=0;
		for(int i = 0;i < N;i++) {
			if(D*D>=X[i]*X[i]+Y[i]*Y[i]) {
				result++;
			}
		}
		System.out.println(result);
	}

}
