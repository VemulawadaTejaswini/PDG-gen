import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int C = sc.nextInt();
		int[][] D = new int[C][C];
		for(int i = 0; i < C; i++)
			Arrays.setAll(D[i], j -> sc.nextInt());
		int[][] ls = new int[3][C];
		for(int i = 0; i < N; i++)
			for(int j = 0; j < N; j++) {
				int c = sc.nextInt() - 1;
				ls[(i + j) % 3][c]++;
			}
		int ans = Integer.MAX_VALUE;
		for(int i = 0; i < C; i++) {
			int t1 = 0;
			for(int l = 0; l < C; l++)
				t1 += D[l][i] * ls[0][l];
			for(int j = 0; j < C; j++) {
				if(i == j)
					continue;
				int t2 = t1;
				for(int l = 0; l < C; l++)
					t2 += D[l][j] * ls[1][l];
				for(int k = 0; k < C; k++) {
					if(j == k || k == i)
						continue;
					int t3 = t2;
					for(int l = 0; l < C; l++)
						t3 += D[l][k] * ls[2][l];
					ans = Math.min(ans, t3);
				}
			}
		}
		System.out.println(ans);
	}

}
