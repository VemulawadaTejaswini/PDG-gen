import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;
import java.util.*;

public class Main {
	int w, h, cnt, k;
	char[][] map;
	Point2D.Double[][] p;
	boolean check;
	boolean[] f;
	
	
	Point2D.Double dfs(int n){
		f[n] = true;
		boolean flag;
		LinkedList<Point2D.Double> list = new LinkedList<Point2D.Double>();
		double minx = Integer.MAX_VALUE;
		double maxx = 0;
		
		if(n==0){
			for(int i=0;i<4;i++){
				if(p[n][i].y==0){
					minx = Math.min(minx, p[n][i].x);
					maxx = Math.max(maxx, p[n][i].x);
				}
			}
		}else{
			for(int i=0;i<4;i++){
				for(int s=0;s<cnt;s++){
					if(s!=n){
						for(int t=0;t<4;t++){
							if(p[n][i].x==p[s][t].x && p[n][i].y-1==p[s][t].y){
								minx = Math.min(minx, p[n][i].x);
								maxx = Math.max(maxx, p[n][i].x);
							}
						}
					}
				}
			}
		}
	
		for(int i=0;i<4;i++){
			flag = false;
			for(int j=0;j<4;j++) if(p[n][i].x==p[n][j].x && p[n][i].y+1==p[n][j].y) flag=true;
			if(flag==false){
				for(int s=0;s<cnt;s++){
					for(int t=0;t<4;t++){
						if(f[s]==false && p[n][i].x==p[s][t].x && p[n][i].y+1==p[s][t].y){
							list.add(dfs(s));
							s = cnt;
							t = 4;
						}
					}
				}
			}
		}
		
		double sumw = 4;
		double sumx = 0;
		for(int i=0;i<list.size();i++){
			sumx += list.get(i).x * list.get(i).y;
			sumw += list.get(i).y;
		}
		for(int i=0;i<4;i++) sumx += p[n][i].x;
		sumx/=sumw;
		if(minx-0.5>=sumx || maxx+0.5<=sumx) check = false;
		
		return new Point2D.Double(sumx,sumw);
	}
	
	void search(int y, int x, char c){
		k++;
		p[cnt][k] = new Point2D.Double(x,y);
		map[y][x] = '.';
		if(y!=h-1 && map[y+1][x]==c) search(y+1,x,c);
		if(x!=w-1 && map[y][x+1]==c) search(y,x+1,c);
		if(x!=0 && map[y][x-1]==c) search(y,x-1,c);
	}
	
	void setP(){
		cnt = 0;
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				if(map[i][j]!='.'){
					k = -1;
					search(i,j,map[i][j]);
					cnt++;
				}
			}
		}
	}
	
	void solve(){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			w = sc.nextInt();
			h = sc.nextInt();
			if(w==0 && h==0) break;
			
			map = new char[h][w];
			p = new Point2D.Double[(w*h)/4][4];
			for(int i=h-1;i>=0;i--) map[i] = sc.next().toCharArray();
			setP();
			check = true;
			f = new boolean[cnt];
			dfs(0);
			if(check==true) System.out.println("STABLE");
			else System.out.println("UNSTABLE");
		}	
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}	
}