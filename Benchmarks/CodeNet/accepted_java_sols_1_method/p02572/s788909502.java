import java.util.Scanner;

//https://atcoder.jp/contests/abc177/tasks/abc177_c

public class Main {
	static long modulo = 1000000000+7;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] nums = new int[N];
		long[] subSum = new long[N];
		for(int i = 0; i <  N; i++) {
			nums[i] = sc.nextInt();
		}
		subSum[N-1] = 0L;
		for(int i = N-2; i >=  0; i--) {
			subSum[i] = (subSum[i+1] + nums[i+1]) % modulo;
			//System.out.print(subSum[i] + " ");
		}
		//System.out.println();
		long res= 0;
		for(int i1 = 0 ; i1 <N-1; i1++) {
			//System.out.println("i1 "+ i1 + " nums[i1]*subSum[i1] " +nums[i1]*subSum[i1]);
			res = (res + (nums[i1]*subSum[i1]) % modulo)%modulo;
		}
		System.out.println(res);
	}
}
