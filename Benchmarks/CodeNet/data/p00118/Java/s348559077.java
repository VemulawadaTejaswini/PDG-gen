import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	int map[][];
	int dx[] = {0,-1,0,1};
	int dy[] = {1,0,-1,0};
	void dfs(int x,int y,int cost,int H,int W){
		map[y][x] = 0;
		if(cost > 0){
			for(int i = 0;i < 4;i++){
				int ax = x + dx[i];
				int ay = y + dy[i];
				if(ax >= 0 && ax < W && ay >= 0 && ay < H){
					if(map[ay][ax] == cost){
						dfs(ax,ay,map[ay][ax],H,W);
					}
				}
			}
		}
	}
	void doIt() { 
		while(true){
			int H = sc.nextInt();
			int W = sc.nextInt();
			if(H + W == 0)break;
			map = new int[H][W];
			for(int i = 0;i < H;i++){
				String str = sc.next();
				char ctr[] = str.toCharArray();
				for(int j = 0;j < W;j++){
					if(ctr[j] == '#'){
						map[i][j] = 1;
					}else if(ctr[j] == '*'){
						map[i][j] = 2;
					}else if(ctr[j] == '@'){
						map[i][j] = 3;
					}
				}
			}
			int cnt = 0;
			for(int i = 0;i < H;i++){
				for(int j = 0;j < W;j++){
					if(map[i][j] > 0){
						cnt++;
						dfs(j,i,map[i][j],H,W);
					}
				}
			}
			System.out.println(cnt);
		}
     }
    public static void main(String[] args) {
    	new Main().doIt();
    }
}