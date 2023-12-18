import java.math.*;
import java.util.*;
  
  

public class Main {

	static int n,m,k,sx,sy,gx,gy,res;
	static char map[][];
	static class pair{
		int x,y;
		pair(int a,int b){
			this.x=a;
			this.y=b;
			
		}
	}
	static class edge{
		int x,y,sum;
		edge(int a,int b,int sum){
			this.x=a;
			this.y=b;
			this.sum=sum;
		}
	}
	static int d[][],dx[]= {-1,0,1,0},dy[]= {0,1,0,-1};
	static Vector<edge> find;
	static Comparator<edge> cmp=new Comparator<Main.edge>() {
		
		@Override
		public int compare(edge o1, edge o2) {
			
			return o1.sum-o2.sum;
		}
	};
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
        	n=scan.nextInt();
        	m=scan.nextInt();
        	k=scan.nextInt();
        	scan.nextLine();
        	find=new Vector<edge>();
        	map=new char[n][m];
        	d=new int[n][m];
        	for(int i=0;i<n;i++) {
        		String s=scan.nextLine();
        		for(int j=0;j<m;j++) {
        			map[i][j]=s.charAt(j);
        			if(map[i][j]=='S') {
        				sx=i;
        				sy=j;
        			}
        			if(map[i][j]>='1'&&map[i][j]<='9') {
        				find.add(new edge(i,j,map[i][j]));
        			}
        			
				}
        	}
        	Collections.sort(find,cmp);
        	gx=find.get(0).x;
        	gy=find.get(0).y;
        	res=0;
        	bfs();
        	System.out.println(res);
        	
        }
        
        
        
        
	}
	public static void bfs() {
		if(map[sx][sy]=='0'+k)return;
		Queue<pair> que=new LinkedList<Main.pair>();
		for(int i=0;i<n;i++)Arrays.fill(d[i], Integer.MAX_VALUE);
		que.add(new pair(sx,sy));
		d[sx][sy]=0;
		while(que.size()>0) {
			pair p=que.poll();
			if(p.x==gx&&p.y==gy)break;
			for(int i=0;i<4;i++) {
				int nx=p.x+dx[i],ny=p.y+dy[i];
				if(nx>=0&&nx<n&&ny>=0&&ny<m&&map[nx][ny]!='X'&&d[nx][ny]==Integer.MAX_VALUE) {
					que.add(new pair(nx,ny));
					d[nx][ny]=d[p.x][p.y]+1;
				}
			}
			
		}
		res+=d[gx][gy];
		sx=gx;
		sy=gy;
		que.clear();
		
		boolean flag=false;
		for(edge i:find) {
			if(flag) {
				gx=i.x;
				gy=i.y;
				break;
			}
			if(i.x==gx&&i.y==gy)flag=true;
			
		}
		bfs();
		
	}
	
	
	
	
	
}
