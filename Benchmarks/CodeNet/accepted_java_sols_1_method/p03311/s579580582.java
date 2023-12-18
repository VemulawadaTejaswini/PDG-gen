import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N];
		for(int i = 0; i < N; i++) A[i] = sc.nextInt() - i - 1;
		Arrays.sort(A);
		long ans = 0, b = A[N / 2];
		for(int i = 0; i < N; i++) ans += Math.abs(A[i] - b);
		System.out.println(ans);
	}
}