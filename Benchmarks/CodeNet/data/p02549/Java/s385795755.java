import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int dp[] = new int[N+1];
		int root[] = new int[N+1];
		Range ran[] = new Range[K];
		Main main = new Main();
		for (int i=0;i<K;i++) {
			Range r= main.new Range();
			r.start= sc.nextInt();
			r.end= sc.nextInt();
			ran[i] = r;
		}
		Arrays.sort(ran);
		dp[1]=1;
		for (int i=1;i<N;i++) {
			if (dp[i]==0) {
				continue;
			}
			for (int j=0;j<K;j++) {
				for (int k=ran[j].start;k<=ran[j].end;k++) {
					if (i+k>N) {
						break;
					}
					dp[i+k] = (dp[i+k]+dp[i])%998244353;
				}
			}
		}
		System.out.println(dp[N]);
	}

	public class Range implements Comparable{
		int start ;
		int end;
		@Override
		public int compareTo(Object o) {
			Range ran  = (Range)o;
			if (this.start<ran.start) {
				return -1;
			}
			return 1;
		}
	}
}