import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		long[] A = new long[N];
		long buf,ave = 0,up = 0,down = 0;
		for(int i = 1; i <= N ;i++) {
			buf = scn.nextLong() - i;
			A[i-1] = buf;
			//ave += buf;
		}
		Arrays.sort(A);
		up = A[N/2];
		down = A[(N-1)/2];
		long ans1 = 0,ans2 = 0;
		for(int i = 0;i < N;i++) {
			ans1 += Math.abs(A[i]-up);
			ans2 += Math.abs(A[i]-down);
		}
		System.out.println(Math.min(ans1, ans2));
		scn.close();
	}
}
