import java.util.*;

public class Main {
	int w, h, xs, ys, xg, yg, n, c, d, x, y;
	int[][] map;
	int[][] visit;
	boolean flag = false;
	
	void loop(int p, int q, int r){
		if(p==yg && q==xg) flag = true;
		visit[p][q] = 1;
		
		if(visit[p][q+1]==0 && map[p][q+1]==r) loop(p,q+1,r);
		if(visit[p+1][q]==0 && map[p+1][q]==r) loop(p+1,q,r);
		if(visit[p][q-1]==0 && map[p][q-1]==r) loop(p,q-1,r);
		if(visit[p-1][q]==0 && map[p-1][q]==r) loop(p-1,q,r);
	}
	
	void solve(){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			w = sc.nextInt();
			h = sc.nextInt();
			if(w==0 && h==0) return;
			xs = sc.nextInt();
			ys = sc.nextInt();
			xg = sc.nextInt();
			yg = sc.nextInt();
			n = sc.nextInt();
			flag = false;
			map = new int[h+2][w+2];
			visit = new int[h+2][w+2];
			for(int i=0;i<n;i++){
				c = sc.nextInt();
				d = sc.nextInt();
				x = sc.nextInt();
				y = sc.nextInt();
				if(d==0){
					for(int j=0;j<4;j++) map[y][x+j]=c;
					for(int j=0;j<4;j++) map[y+1][x+j]=c;
				}else{
					for(int j=0;j<4;j++) map[y+j][x]=c;
					for(int j=0;j<4;j++) map[y+j][x+1]=c;
				}
			}
			if(map[ys][xs]==0) flag = false;
			else loop(xs, ys, map[ys][xs]);
			if(flag==true) System.out.println("OK");
			else System.out.println("NG");
		}
	}

	
	public static void main(String[] args) {
		new Main().solve();
	}	
}