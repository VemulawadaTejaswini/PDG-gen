import java.util.*;
public class AOJ0071 {
	public static char[][] map = new char[8][8];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max_roop = sc.nextInt();
		int playcount =1;
		while(max_roop>=playcount){ 
			for(int i = 0;i < 8;i++){
				String tmp = sc.next();
				for(int j = 0;j < 8;j++){
					map[i][j] = tmp.charAt(j);
				}
			}
			int m = sc.nextInt();
			m--;
			int n = sc.nextInt();
			n--;
			dfs(n,m);
			System.out.println("Data "+playcount+":");
			for(int i = 0; i <8;i++){
				for(int j= 0;j < 8;j++){
					System.out.print(map[i][j]);
				}
				System.out.println();
			}
			playcount++;
		}
	}
	public static void dfs(int x,int y){
		map[x][y]='0';
		for(int dx = -3;dx <=3;dx++){
			for(int dy = -3; dy <= 3 ; dy++){
				if(dx == 0 || dy ==0){
					int nx = x + dx;
					int ny = y + dy;
					if(0<=nx&&nx<8&&0<=ny&&ny<8&&map[nx][ny]=='1')dfs(nx,ny);
				}
			}
		}
		return;
	}
}