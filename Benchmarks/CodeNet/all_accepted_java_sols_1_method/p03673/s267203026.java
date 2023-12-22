import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		long[] A = new long[N];
		for(int i =0 ;i < N;i++) {
			A[i] = scn.nextLong();
		}

		long[] B = new long[N];
		int a = 0,b = N-1;
		int n = N-1;
		while(a<=b) {
			B[a] = A[n];
			n--;
			if(n!=-1) {
				B[b] = A[n];
			}
			n--;
			a++;
			b--;
		}
		for(int i = 0;i < N;i++) {
			System.out.print(B[i] + " ");
		}
	}

}
