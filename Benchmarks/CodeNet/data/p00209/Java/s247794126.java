import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new AOJ0209();
	}

	class AOJ0209{
		int[][] window;
		int[][] pic,pic2,pic3,pic4,memo;
		int n,m,cnt;
		boolean flg[][];
		boolean bfs(int wx,int wy,int px,int py,int[][] p,int cost){
//			System.out.println(wx+" "+wy+" "+px+" "+py+" "+cost);
//			System.out.println(p[py][px]+" "+window[wy][wx]);
			boolean sw = false;
			if(flg[py][px])return false;
			flg[py][px]=true;
			if(p[py][px]!=window[wy][wx]&&p[py][px]!=-1)return false;
			if(cost==cnt)return true;
			int[] sx = {1,0,-1,0};
			int[] sy = {0,1,0,-1};
			for(int i=0;i<4;i++){
				int nx = px+sx[i];
				int ny = py+sy[i];
				int wnx = wx+sx[i];
				int wny = wy+sy[i];
				if(nx<0||nx>=m||ny<0||ny>=m||wnx<0||wnx>=n||wny<0||wny>=n)continue;
				sw = bfs(wnx,wny,nx,ny,p,cost+1);
				if(sw)return true;
			}
			return false;
		}
		
		void doIt(){
			int x=-1,y=-1;
			boolean result = false;
			for(int i=0;i<n;i++){
				for(int s=0;s<n;s++)if(!result){
					flg = new boolean[m][m];
					result=bfs(s,i,0,0,pic,1);
					if(result){
						x=i+memo[0][0];y=s+memo[0][1];
						break;
					}
					flg = new boolean[m][m];
					if(!result)result=bfs(s,i,0,0,pic2,1);
					if(result){
						x=i+memo[1][0];y=s+memo[1][1];
						break;
					}
					flg = new boolean[m][m];
					if(!result)result=bfs(s,i,0,0,pic3,1);
					if(result){
						x=i+memo[2][0];y=s+memo[2][1];
						break;
					}
					flg = new boolean[m][m];
					if(!result)result=bfs(s,i,0,0,pic4,1);
					if(result){
						System.out.println(s+" "+i);
						x=i+memo[3][0];y=s+memo[3][1];
						break;
					}
				}
				if(result)break;
			}
			System.out.println(result? (x+1)+" "+(y+1):"NA");
		}
		
		void setting(){
			cnt = 0;
			for(int i=m-1;i>=0;i--)for(int s=0;s<m;s++){
				pic2[cnt/m][cnt%m] = pic[s][i];
				cnt++;
			}
			cnt = 0;
			for(int i=m-1;i>=0;i--)for(int s=0;s<m;s++){
				pic3[cnt/m][cnt%m] = pic2[s][i];
				cnt++;
			}
			cnt = 0;
			for(int i=m-1;i>=0;i--)for(int s=0;s<m;s++){
				pic4[cnt/m][cnt%m] = pic3[s][i];
				cnt++;
			}
			cnt=m*m;
			for(int i=0;i<m;i++){
				boolean sw = false;
				for(int s=0;s<m;s++){
					if(pic[i][s]!=-1){
						memo[0][0]=s;memo[0][1]=i;
						sw =true;
						break;
					}
				}
				if(sw)break;
			}
			for(int i=0;i<m;i++){
				boolean sw = false;
				for(int s=0;s<m;s++){
					if(pic2[i][s]!=-1){
						memo[1][0]=s;memo[1][1]=i;
						sw =true;
						break;
					}
				}
				if(sw)break;
			}
			for(int i=0;i<m;i++){
				boolean sw = false;
				for(int s=0;s<m;s++){
					if(pic3[i][s]!=-1){
						memo[2][0]=s;memo[2][1]=i;
						sw =true;
						break;
					}
				}
				if(sw)break;
			}
			for(int i=0;i<m;i++){
				boolean sw = false;
				for(int s=0;s<m;s++){
					if(pic4[i][s]!=-1){
						memo[3][0]=s;memo[3][1]=i;
						sw =true;
						break;
					}
				}
				if(sw)break;
			}
			
		}

		public AOJ0209() {
			while(true){
				n = in.nextInt();
				m = in.nextInt();
				if(n==0&&m==0)break;
				window = new int[n][n];
				memo = new int[4][2];
				for(int i=0;i<n;i++)for(int s=0;s<n;s++)window[i][s] = in.nextInt();
				pic = new int[m][m];pic2 = new int[m][m];pic3 = new int[m][m];pic4 = new int[m][m];
				for(int i=0;i<m;i++)for(int s=0;s<m;s++)pic[i][s] = in.nextInt();
				setting();
				doIt();
			}
		}
	}

}