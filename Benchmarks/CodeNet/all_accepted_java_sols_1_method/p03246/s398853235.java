import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		final int L = 100000;
		int[][] cnt = new int[2][L];
		for(int i=0; i<N/2; i++) {
			cnt[0][sc.nextInt()-1]++;
			cnt[1][sc.nextInt()-1]++;
		}
		
		int[] maxIndex = new int[2];
		
		for(int i=0; i<2; i++)
			for(int j=0; j<L; j++)
				if(cnt[i][j] > cnt[i][maxIndex[i]])
					maxIndex[i] = j;
		if(maxIndex[0]==maxIndex[1]) {
			Arrays.sort(cnt[0]);
			Arrays.sort(cnt[1]);
			System.out.println(Math.min(N - cnt[0][L-1] - cnt[1][L-2], N - cnt[0][L-2] - cnt[1][L-1]));
		} else {
			System.out.println(N - cnt[0][maxIndex[0]]-cnt[1][maxIndex[1]]);
		}
		
		sc.close();
	}
}
