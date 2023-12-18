import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long K = sc.nextLong();
		sc.close();
		int N = 50;
		long ans[] = new long[N];  
		Arrays.fill(ans, 49);
		long quo = K/N;
		long rem = K%N;
		for(int i=0;i<N;i++)ans[i]+=quo;
		for(int i=0;i<rem;i++) {
			ans[i]+=rem;
			for(int j=0;j<N;j++) {
				if(j==i)continue;
				ans[j]--;
			}
		}
		System.out.println(N);
		for(long t:ans) {
			System.out.print(t+ " ");
		}
		System.out.println();
			
	}
}