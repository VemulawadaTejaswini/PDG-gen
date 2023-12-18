import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] k = new int[M];
		int[][] s = new int[M][N];
		int[] p = new int[M];
		int ans = 0;
		for(int i = 0; i < M; i++) {
			k[i] = sc.nextInt();
			for(int j = 0; j < k[i]; j++)
				s[i][j] = sc.nextInt();
		}
		for(int i = 0; i < M; i++)
			p[i] = sc.nextInt();
		for(int i = 0; i < 1 << N; i++) {
			int[] sw = new int[N];
			boolean ok = true;
			for(int j = 0; j < N; j++) {
				if((1 & i >> j) == 1)
					sw[j] = 1;
			}
			for(int x = 0; x < M; x++) {
				int row = 0;
				for(int y = 0; y < k[x]; y++)
					row += sw[s[x][y]-1];
				if(row % 2 != p[x])
					ok = false;
			}
			if(ok)
				ans++;
		}
		System.out.println(ans);
	}

}