import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {
		for (;;) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			int d = sc.nextInt();

			if ((m | n | d) == 0) {
				break;
			}

			int init[][] = new int[n][m];

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					init[i][j] = sc.nextInt();
				}
			}

			int push[][][][] = new int[n][m][n][m];

			int dx[] = { 1, 1, -1, -1 };
			int dy[] = { -1, 1, 1, -1 };

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {

					push[i][j][i][j] = 1;

					for (int z = 0; z < 4; z++) {
						for (int k = 0; k <= d; k++) {
							int ni = dx[z] * k + i;
							int nj = dy[z] * (d - k) + j;

							if (ni < n && ni >= 0) {
								if (nj < m && nj >= 0) {
									push[i][j][ni][nj] = 1;
								}
							}
						}
					}
				}
			}
		

			boolean ng = false;

			boolean used[][] = new boolean[n][m];

			for (int i = 0; i < n && !ng; i++) {
				for (int j = 0; j < m && !ng; j++) {
					int y = 0;
					int x = 0;
					boolean kkks = false;
					for (y=0; y < n; y++) {
						for (x=0; x < m; x++) {
							if (used[y][x]) {
								continue;
							}
							if (push[y][x][i][j] == 1) {
								kkks = true;
								break;
							}
						}
						if (kkks) {
							break;
						}
					}

					
					if (y == n) {
						if (init[i][j] == 1) {
					//		System.out.println(i +" " + j + " fjsaoi");
							ng = true;
							break;
						} else {
							continue;
						}
					}
					

					used[y][x] = true;

					for (int zi = 0; zi < n; zi++) {
						for (int zj = 0; zj < m; zj++) {
							if(used[zi][zj]){
								continue;
							}
							if (push[zi][zj][i][j] == 1) {
								for (int z1 = 0; z1 < n; z1++) {
									for (int z2 = 0; z2 < m; z2++) {
										push[zi][zj][z1][z2] = push[y][x][z1][z2]
												^ push[zi][zj][z1][z2];
									}
								}
							}
						}
					}

					if (init[i][j] == 1) {
						for (int z1 = 0; z1 < n; z1++) {
							for (int z2 = 0; z2 < m; z2++) {
								init[z1][z2] = init[z1][z2]
										^ push[y][x][z1][z2];
							}
						}
					}

				}
			}
/*			
			for(int i =0; i < n ; i++){
				for(int j = 0; j < m ; j++){
					System.out.println("-----------\n"+i+" "+j);
					for(int k = 0; k < n ; k++){
						for(int l = 0 ; l < m ; l++){
							System.out.print(push[i][j][k][l]+" ");
						}	
						System.out.println();
						
						
					}
				}
						
			}
		*/	
			
			if (ng) {
				System.out.println(0);
			} else {
				System.out.println(1);
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}