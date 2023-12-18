import java.util.Scanner;

/**
 * https://abc047.contest.atcoder.jp/tasks/arc063_b
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long T = sc.nextLong();
		long[] a = new long[N];
		for(int i=0; i<N; i++) a[i] = sc.nextLong();
		sc.close();
		long[] maxDp = new long[N];
		maxDp[N-1] = a[N-1];
		for(int i=N-2; i>=0; i--){
			maxDp[i] = Math.max(a[i], maxDp[i+1]);
		}
		
		long max = Long.MIN_VALUE;
		int count = 0;
		for(int i=0; i<N-1; i++){
			long s = maxDp[i+1]-a[i];
			if(s==max){
				count++;
			}else if(s>max){
				max = s;
				count = 1;
			}
		}
		//long ans = max<=0 ? 0 : Math.min(count, T/2);
		System.out.println(count);

	}

}