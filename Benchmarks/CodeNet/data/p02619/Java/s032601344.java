import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int N = 26;

		int D = sc.nextInt();
		int[] c = new int[N];
		for(int i=0; i<N; i++)
			c[i] = sc.nextInt();
		
		int[][] s = new int[D][N];
		for(int i=0; i<D; i++)
			for(int j=0; j<N; j++)
				s[i][j] = sc.nextInt();
		
		int[] t = new int[D];
		for(int i=0; i<D; i++)
			t[i] = sc.nextInt()-1;
		
		int score = 0;
		int[] last = new int[N];
		for(int i=0; i<D; i++) {
			score += s[i][t[i]];
			last[t[i]]=i+1;
			for(int j=0; j<N; j++)
				score -= c[j]*(i+1-last[j]);
			System.out.println(score);
		}

		sc.close();
	}
}
