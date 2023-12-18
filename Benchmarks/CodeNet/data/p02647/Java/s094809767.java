import java.io.PrintWriter;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] A = new int[N];
		
		for(int i=0; i<N; i++)
			A[i] = sc.nextInt();

		int[] d = new int[N+1];
		
		for(int i=0; i<K; i++) {
			Arrays.fill(d, 0);
			for(int j=0; j<N; j++) {
				d[Math.max(j-A[j], 0)]++;
				d[Math.min(j+A[j]+1, N)]--;
			}
			int cur = 0;
			for(int j=0; j<N; j++) {
				cur += d[j];
				A[j] = cur;
			}
			if(d[0]==N && d[N]==-N)
				break;
		}
		
		for(int i=0; i<N; i++)
			pw.print(A[i] + (i==N-1 ? "\n" : " "));
		
		sc.close();
		pw.close();
	}
}
