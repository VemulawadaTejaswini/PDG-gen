import java.util.*;


public class Main {
	final int INF = 1 << 24;
	int [] xdis = {0,1,0,-1};
	int [] ydis = {1,0,-1,0};
	class C{
		int x,y,s;

		public C(int x, int y, int s) {
			this.x = x;	this.y = y;	this.s = s;
		}
		
	}

	private void doit() {
		Scanner sc = new Scanner(System.in);
		while(true){
			int w = sc.nextInt();
			int h = sc.nextInt();
			if(w == 0 && h == 0) break;
			char [][] data = new char[w][h];
			int sy=-1,sx=-1;
			ArrayList<Integer> dxlist = new ArrayList<Integer>();
			ArrayList<Integer> dylist = new ArrayList<Integer>();
			//input
			for(int y=0; y < h; y++){
				String line = sc.next();
				for(int x=0; x < w; x++){
					data[x][y] = line.charAt(x);
					if(data[x][y] == 'o'){
						sx = x;
						sy = y;
					}
					else if(data[x][y] == '*'){
						dxlist.add(x);
						dylist.add(y);
					}
				}
			}
			int len = dxlist.size() + 1;
			int [][] pass = new int[len][len];
			boolean flg = false;
			for(int i = -1; i < len-1; i++){
				int ssy,ssx;
				if(i == -1){
					ssx = sx;
					ssy = sy;
				}
				else{
					ssx = dxlist.get(i);
					ssy = dylist.get(i);
				}
				for(int j =i + 1; j < len -1; j++){
					int gx = dxlist.get(j), gy = dylist.get(j);
					
					LinkedList<C> open = new LinkedList<C>();
					boolean [][] close = new boolean[w][h];
					open.add(new C(ssx, ssy,0));
					close[ssx][ssy] = true;
					int ans = INF;
					while(! open.isEmpty()){
						C now = open.removeFirst();
						if(now.x == gx && now.y ==gy){
							ans = now.s;
							break;
						}
						for(int k=0; k < 4; k++){
							int xx = now.x + xdis[k], yy = now.y + ydis[k];
							if(! (0<= xx && xx < w && 0<= yy && yy < h))
								continue;
							if(data[xx][yy] == 'x') continue;
							if(close[xx][yy]) continue;
							open.add(new C(xx,yy,now.s + 1));
							close[xx][yy] = true;
						}
					}
					if(ans == INF){
						flg = true;
						break;
					}
					pass[i+1][j+1] = ans;
					pass[j+1][i+1] = ans;
					
				}
				if(flg)
					break;
			}//end i
			if(flg){
				System.out.println(-1);
				continue;
			}
			
			//dp
			int len2 = len - 1;
			int [][] dp = new int[len2][1 << len2];
			for(int i=1; i < len; i++){
				dp[i-1][1<< (i -1)] = pass[0][i];
			}
			for(int i=1;i < (1 << len2) ; i++){
				for(int j= 0; j < len2; j++){
					if(dp[j][i] == 0) continue;
					for(int k = 0; k < len2; k++){
						if((i & (1 << k)) == 1) continue;
						int ind = i | (1 << k);
						if(dp[k][ind] == 0){
							dp[k][ind] = dp[j][i] + pass[j+1][k+1];
						}
						else{
							dp[k][ind] = Math.min(dp[k][ind], dp[j][i] + pass[j+1][k+1]);
						}
					}
				}
			}
			
			int res = INF;
			for(int i=0; i < len2;i++){
				res = Math.min(res, dp[i][(1 << len2) - 1]) ;
			}
			
			//System.out.print("ANS=");
			System.out.println(res);
			
			//debug
//			for(int i=0; i < len; i++){
//				for(int j =0; j < len;j++){
//					if(pass[i][j] == INF){
//						System.out.print("**" );
//					}
//					else{
//						System.out.print(pass[i][j] + " " );
//					}
//					
//				}
//				System.out.println();
//			}
//			for(int i = 0; i < (1 << len2); i++){
//				System.out.print(i + " ");
//			}
//			System.out.println();
//			for(int i = 0; i < len2; i++){
//				for(int j = 0; j < (1 << len2);j++){
//					System.out.print(dp[i][j] + " ");
//				}
//				System.out.println("");
//			}
//			System.out.println("");
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}