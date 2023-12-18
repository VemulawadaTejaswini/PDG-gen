import java.util.*;

public class Main {
	public Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new aoj1130().doIt();
	}
	class aoj1130{
		boolean map[][];
		int x[] = {-1,1,0,0};
		int y[] = {0,0,-1,1};
		int H,W;
		int cnt = 0;
		
		void dfs(int h,int w){
			if(map[h][w]){
				cnt++;
				map[h][w] = false;
			}
			for(int i = 0;i < 4;i++){
				if(h + y[i] < H && w + x[i] < W && h + y[i] >= 0 && w + x[i] >= 0){
					if(map[h + y[i]][w + x[i]] == true){
						dfs(h+y[i],w+x[i]);
					}
				}
			}
		}
		
		void doIt() {
			while (true) {
				W = sc.nextInt();
				H = sc.nextInt();
				if(H + W == 0)break;
				map = new boolean[H][W];
				int sh = 0,sw = 0;
				for(int h = 0;h < H;h++){
					String str = sc.next();
					char ctr[] = str.toCharArray();
					for(int w = 0;w < W;w++){
						if(ctr[w] == '.') map[h][w] = true;
						else if(ctr[w] == '@'){
							map[h][w] = true;
							sh = h;
							sw = w;
						}
					}
				}
				dfs(sh,sw);
				System.out.println(cnt);
				cnt = 0;
			}
		}
	}
}