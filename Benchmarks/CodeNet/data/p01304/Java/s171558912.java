import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int gx = sc.nextInt();
			int gy = sc.nextInt();
			int p = sc.nextInt();
			Matatabi[] list = new Matatabi[p];
			for (int j = 0; j < p; j++) {
				list[j] = new Matatabi(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
			}
			
			int[][] dp = new int[gx+1][gy+1];
			for (int j = 0; j <= gx; j++) {
				for (int k = 0; k <= gy; k++) {
					if(j > 0 && k > 0) {
						boolean flag = true;
						for (int l = 0; l < p; l++) {
							if (list[l].exists(j-1, k, j, k)) {
								flag = false;
							}
						}
						if (flag)
							dp[j][k] += dp[j-1][k];
						
						flag = true;
						for (int l = 0; l < p; l++) {
							if (list[l].exists(j, k-1, j, k)) {
								flag = false;
							}
						}
						if (flag)
							dp[j][k] += dp[j][k-1];
						
					} else if (j > 0) {
						boolean flag = true;
						for (int l = 0; l < p; l++) {
							if (list[l].exists(j-1, k, j, k)) {
								flag = false;
							}
						}
						if (flag)
							dp[j][k] += dp[j-1][k];
					} else if (k > 0) {
						boolean flag = true;
						for (int l = 0; l < p; l++) {
							if (list[l].exists(j, k-1, j, k)) {
								flag = false;
							}
						}
						if (flag)
							dp[j][k] += dp[j][k-1];

					} else {
						dp[0][0] = 1;
					}
				}
			}
			if (dp[gx][gy] > 0) {
				System.out.println(dp[gx][gy]);
			} else {
				System.out.println("Miserable Hokusai!");
			}
		}
	}
}

class Matatabi {
	int x1;
	int y1;
	int x2;
	int y2;
	
	public Matatabi(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	public boolean exists(int x1, int y1, int x2, int y2) {
		return (this.x1 == x1 && this.y1 == y1 && this.x2 == x2 && this.y2 == y2) 
			|| (this.x1 == x2 && this.y1 == y2 && this.x2 == x1 && this.y2 == y1);
	}
}