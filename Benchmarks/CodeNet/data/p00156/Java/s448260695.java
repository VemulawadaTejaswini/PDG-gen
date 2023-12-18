import java.util.Scanner;

class P{
	int x;
	int y;
	int d;
	P(int x,int y,int d){
		this.x=x;
		this.y=y;
		this.d=d;
	}
}

public class Main {
	
	int n,m;
	char map[][];
	int mx[]={-1,0,1,0};
    int my[]={0,-1,0,1};
	
	public static void main(String[] args) {
		// TODO ティツ?ェテ・ツ仰陛ァツ板淌ヲツ按静」ツ?陛」ツつ古」ツ?淌」ツδ。テ」ツつステ」ツδε」ツδ嘉」ツδサテ」ツつケテ」ツつソテ」ツδ?
		new Main().run();
	}
	void run(){
		Scanner sc=new Scanner(System.in);
		while(true){
			n=sc.nextInt();//x
			m=sc.nextInt();//y
			if(n+m==0) break;
			map=new char[m][n];
			for(int i=0;i<m;i++){
				map[i]=sc.next().toCharArray();
			}
			int sx=-1,sy=-1;
			for(int i=0;i<m;i++){
				for(int j=0; j<n; j++){
					if(map[i][j]=='&'){
						sx=j;
						sy=i;
					}
				}
			}
//			int ans=bfs(new P(sx, sy, 0));
			int ans=dijkstra(sx,sy);
			System.out.println(ans);
		}
	}
	int dijkstra(int sx,int sy){
		int y,x,ans;
		ans=2<<15;
		boolean use[][]=new boolean[m][n];
		int cost[][]=new int[m][n];
		for(int a=0; a<m; a++){
			for(int b=0; b<n; b++){
				use[a][b]=false;
				cost[a][b]=2<<15;
			}
		}
		cost[sy][sx]=0;
		while(true){
			x=y=-1;
			//テ」ツ?セテ」ツ??、ツスツソテ」ツ?」テ」ツ?ヲテ」ツ?ェテ」ツ??」ツつ?」ツ?、テ」ツ?ァテ」ツ??
			for(int a=0; a<m; a++){
				for(int b=0; b<n; b++){
					if(!use[a][b] && 
							(x==-1 || cost[a][b]<cost[y][x])){
						y=a;x=b;
					}
				}
			}

			if(x==-1) break;
			//System.out.println(y+" "+x);
			use[y][x]=true;

			//テ、ツサツ甘・ツ崢榲」ツ?ョテァツァツサテ・ツ仰陛」ツ?ッ4テヲツ鳴ケテ・ツ青?
			//テ」ツ?敕」ツつ古」ツ?ォテ」ツ?づ」ツつ湘」ツ?崚」ツ?ヲテ」ツ?ョテ」ツつオテ」ツつ、テ」ツつウテ」ツδュテ」ツ?ョテァツ崢ョテ」ツ?ョテ・ツ、ツ嘉・ツ個姪」ツ?ォテ」ツ?づ」ツつ湘」ツ?崚」ツ?ヲティツィツ暗ァツョツ?
			for(int i=0;i<4;i++){
				//テァツァツサテ・ツ仰陛」ツ?ァテ」ツ?催」ツつ凝」ツ?凝」ツ?ゥテ」ツ??」ツ?凝」ツ?ョテ」ツδ?」ツつァテ」ツδε」ツつッ テ・ツ」ツ?」ツδ?」ツつァテ」ツδε」ツつッ
				if(y+my[i]<0 || x+mx[i]<0 || m<=y+my[i] || n<=x+mx[i]){
					if(map[y][x]=='#'){
						ans=Math.min(ans,cost[y][x]+1);
					}
					else{
						ans=Math.min(ans,cost[y][x]);
					}
					continue;
				}
				if(map[y][x]=='#' && map[y+my[i]][x+mx[i]]=='.'){
					cost[y+my[i]][x+mx[i]]=Math.min(cost[y+my[i]][x+mx[i]], cost[y][x]+1);
				}
				else{
					cost[y+my[i]][x+mx[i]]=cost[y][x];
				}
			}
		}
		
		return ans;
	}
//	int bfs(P sp){
//		Queue<P> q=new LinkedList<P>();
//		q.offer(sp);//テ」ツつケテ」ツつソテ」ツδシテ」ツδ暗」ツ?ョsテ」ツつ津」ツつュテ」ツδ・テ」ツδシテ」ツ?ォテ」ツ??」ツつ古」ツ?ヲテ」ツ??
//	
//		while(!q.isEmpty()){//テ」ツつュテ」ツδ・テ」ツδシテ」ツ?古ァツゥツコテ」ツ?ォテ」ツ?ェテ」ツつ凝」ツ?セテ」ツ?ァテ」ツつ?」ツつ?
//			P now=q.poll();//テ」ツつュテ」ツδ・テ」ツδシテ」ツ?ョテ・ツ?暗ゥツ?ュテ」ツつ津・ツ渉姪」ツつ甘・ツ?コテ」ツ??
//			int nx=now.x;
//			int ny=now.y;
//			if(nx < 0 || n <= nx || ny < 0 || m <= ny){
//				return now.d;
//			}
//			map[nx][ny]='@';
//			//テ」ツ?禿」ツ?禿」ツ?凝」ツつ嘉ゥツ?キテァツァツサテ・ツ?暗」ツつ津」ツつュテ」ツδ・テ」ツδシテ」ツ?ォテ・ツ?・テ」ツつ古」ツ?ヲテ」ツ??」ツ??
//			for(int i=0; i<4; i++){
//				if(nx+mx[i] < 0 || n <= nx+mx[i] || ny+my[i] < 0 || m <= ny+my[i]){
//					return now.d;
//				}
//				if(map[ny+my[i]][nx+mx[i]]=='@'){
//					continue;
//				}
//				if(map[ny][nx]!=map[ny+my[i]][nx+mx[i]]){
//					q.offer(new P(nx+mx[i],ny+my[i],now.d+1));
//				}
//				else{
//					q.offer(new P(nx+mx[i],ny+my[i],now.d));
//				}
//			}
//		}
//		return -1;
//	}
}