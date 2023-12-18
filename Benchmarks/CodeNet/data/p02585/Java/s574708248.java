import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] P = new int[N];
		int[] C = new int[N];
		
		for(int i=0; i<N; i++)
			P[i] = sc.nextInt()-1;
		for(int i=0; i<N; i++)
			C[i] = sc.nextInt();
		
		boolean[] visited = new boolean[N];
		
		long ans = Long.MIN_VALUE;
		for(int i=0; i<N; i++) {
			if(!visited[i]) {
				ArrayList<Integer> list = new ArrayList<>();
				int cur = i;
				while(!visited[cur]) {
					list.add(cur);
					visited[cur] = true;
					cur = P[cur];
				}
				ans = Math.max(ans, solve(list, C, K));
			}
		}
		
		System.out.println(ans);
		sc.close();
	}
	static long solve(ArrayList<Integer> list, int[] C, int K) {
		int L = list.size();
		long[][] score = new long[L][L+1];
		for(int i=0; i<L; i++) {
			for(int j=0; j<L; j++) {
				score[i][j+1] = score[i][j]+C[list.get((i+j)%L)];
			}
		}
		
		long ans = Long.MIN_VALUE;
		for(int i=0; i<L; i++) {
			for(int j=1; j<=((K-1)%L)+1; j++) {
				ans = Math.max(ans, score[i][j]);
			}
		}
		if(score[0][L]>0) {
			ans += score[0][L]*((K-1)/L);
		}
		
		return ans;
	}
}
