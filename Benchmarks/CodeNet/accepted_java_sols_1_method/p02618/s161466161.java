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
		
		int[] last = new int[N];
		for(int i=0; i<D; i++) {
			int bestIndex = -1;
			int bestScore = 0;
			for(int j=0; j<N; j++) {
				int score = s[i][j] + c[j]*(i+1-last[j]);
				if(bestIndex < 0 || score > bestScore) {
					bestIndex = j;
					bestScore = score;
				}
			}
			System.out.println(bestIndex+1);
			last[bestIndex]=i+1;
		}

		sc.close();
	}
}
