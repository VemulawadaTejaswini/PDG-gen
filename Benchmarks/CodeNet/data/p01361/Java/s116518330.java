import java.util.Scanner;

//Dungeon Quest II
public class Main{

	void run(){
		Scanner sc = new Scanner(System.in);
		int[][] move = {{-1,0},{0,1},{1,0},{0,-1}};
		while(true){
			int hp = sc.nextInt();
			int hpmax = sc.nextInt();
			if((hp|hpmax)==0)break;
			int r = sc.nextInt();
			int c = sc.nextInt();
			char[][] map = new char[r][c];
			for(int i=0;i<r;i++)map[i]=sc.next().toCharArray();
			int[] trap = new int[26];
			int T = sc.nextInt();
			for(int i=0;i<T;i++){
				trap[sc.next().charAt(0)-'A'] = sc.nextInt();
			}
			int S = sc.nextInt();
			int[] seq = new int[1000];
			int s = 0;
			for(int i=0;i<S;i++){
				char ch = sc.next().charAt(0);
				int dir = ch=='U'?0:ch=='R'?1:ch=='D'?2:3;
				int k = sc.nextInt();
				while(k--!=0)seq[s++]=dir;
			}
			int P = sc.nextInt();
			int[] p = new int[P];
			for(int i=0;i<P;i++)p[i]=sc.nextInt();
			int[][] dp = new int[s+1][1<<P];
			dp[0][(1<<P)-1] = hp;
			int ni = 0;
			int nj = 0;
			for(int i=0;i<s;i++){
				ni += move[seq[i]][0];
				nj += move[seq[i]][1];
				int damage = trap[map[ni][nj]-'A'];
				for(int j=(1<<P)-1;j>=0;j--){
					if(dp[i][j]==0)continue;
					for(int k=0;k<P;k++){
						if((j&(1<<k))==0)continue;
						int h = Math.min(dp[i][j]+p[k], hpmax);
						dp[i][j-(1<<k)] = Math.max(dp[i][j-(1<<k)], h);
					}
					if(dp[i][j]-damage>0)dp[i+1][j] = Math.max(dp[i+1][j], dp[i][j]-damage);
				}
			}
			boolean f = false;
			for(int j=0;j<1<<P;j++)if(dp[s][j]>0)f=true;
			System.out.println(f?"YES":"NO");
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}