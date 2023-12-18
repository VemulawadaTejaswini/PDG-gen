import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			if(N + M == 0) break;
			
			int[] h = new int[N+1];
			int[] w = new int[M+1];
			for(int i=1; i<=N; i++) {
				h[i] = sc.nextInt();
			}
			for(int i=1; i<=M; i++) {
				w[i] = sc.nextInt();
			}
			
			int[] hs = new int[1000001];
			int[] ws = new int[1000001];
			
			int cnt = 0;
			for(int i=1; i<=N; i++) {
				cnt = 0;
				for(int j=1; j<=N; j++) {
					cnt += h[j];
					hs[cnt]++;
				}
			}
			for(int i=1; i<=M; i++) {
				cnt = 0;
				for(int j=1; j<=M; j++) {
					cnt += w[j];
					ws[cnt]++;
				}
			}
			cnt = 0;
			for(int i=1; i<=1000000; i++) {
				cnt += hs[i] * ws[i];
			}
			System.out.println(cnt);
		}
	}
}
