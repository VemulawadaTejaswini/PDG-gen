import java.util.Scanner;
public class Main {
	
	static int count, H, W;
	static int[][] move = {{1,0}, {-1,0}, {0,1}, {0,-1}};
	static char[][] r;
	
	static void dfs(int i, int j) {
		for(int k=0; k<4; k++) {
			int ni = i + move[k][0];
			int nj = j + move[k][1];
			if(0<=ni && ni<H && 0<=nj && nj<W && r[ni][nj] != '#') {
				r[ni][nj] = '#';
				count++;
				dfs(ni, nj);
			}
		}
	}
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			while(sc.hasNext()) {
				W = sc.nextInt();
				H = sc.nextInt();
				if(W+H == 0) break;
				
				r = new char[H][W];
				int si = 0;
				int sj = 0;
				
				for(int i=0; i<H; i++) {
					char[] s = sc.next().toCharArray();
					for(int j=0; j<W; j++) {
						r[i][j] = s[j];
						if(s[j] == '@') {
							si = i;
							sj = j;
						}
					}
				}
				count = 1;
				r[si][sj] = '#';
				dfs(si, sj);
				System.out.println(count);
			}
		}
	}
}

