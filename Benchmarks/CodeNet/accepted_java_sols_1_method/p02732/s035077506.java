import java.io.PrintWriter;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] cnt = new int[N];
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt()-1;
			cnt[A[i]]++;
		}
		
		long total = 0;
		for(int i=0; i<N; i++) {
			if(cnt[i]>=2) {
				total += (long)cnt[i]*(cnt[i]-1)/2;
			}
		}
		
		for(int i=0; i<N; i++) {
			long ans = total - (cnt[A[i]]>=2 ? cnt[A[i]]-1 : 0);
			pw.println(ans);
		}
		
		pw.close();
		sc.close();
	}
}
