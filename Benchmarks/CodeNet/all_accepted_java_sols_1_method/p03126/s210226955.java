import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int N;
		N = sc.nextInt();
		int M;
		M = sc.nextInt();
		long[] A=new long[M];
		long ans=0;

	for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			for (int j = 0; j < x; j++) {
				int X = sc.nextInt();
			A[X-1]++;
			}
	}

	for (int i = 0; i < M; i++) {
		if(A[i]==N)ans++;
	}
			

					System.out.print(ans); 	

	}
}


