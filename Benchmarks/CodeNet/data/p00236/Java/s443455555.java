import java.util.*;
class Main{

	public static int[][] map;
	static int W,H,sh = 0,sw = 0;
	static boolean res = false;
	static boolean first = true;
	static int[][] d = {{0,1,0,-1},{1,0,-1,0}};
	public static void main(String[] args) {
		// TODO ツ篠ゥツ督ョツ青カツ青ャツつウツづェツつスツδソツッツドツ・ツスツタツブ
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			W = sc.nextInt();
			H = sc.nextInt();
			sc.nextLine();
			if(W == 0 && H == 0)break;
			map = new int[H][W];
			res = false;
			for(int i =0;i<H;i++){
				for(int j = 0;j<W;j++){
					map[i][j] = sc.nextInt();
				}
			}
			boolean invalid = true;
			loop:for(int i = 0;i<H;i++){
				for(int j = 0;j<W;j++){
					if(map[i][j] == 0){
						sh = i;
						sw = j;
						invalid = false;
						break loop;
					}
				}
			}
			if(invalid) break;
			solve(sh,sw);
			out:System.out.println(res ? "Yes" : "No");
		}
	}
	public static void solve(int h,int w){
		map[h][w] = 1;
		if(res == true) return;
		if(isInNear(sh,sw,h,w)){
			if(filled()){
				res = true;
				return;
			}
		}
		if(isSeparate(h,w)){map[h][w] = 0;return;}
		for(int s = 0;s<4;s++){
			int nh,nw;
			nh = h + d[0][s];nw = w + d[1][s];
			if(0<=nh && nh<H && 0 <= nw && nw < W){
				if(map[nh][nw] == 0){
					solve(nh,nw);
				}
			}
		}
		map[h][w] = 0;

	}
	public static boolean filled(){
		boolean ans = true;
		loop:for(int i = 0;i<H;i++){
			for(int j = 0;j<W;j++){
				if(map[i][j] == 0){
					ans = false;
					break loop;
				}
			}
		}
		return ans;
	}
	public static boolean isInNear(int sx,int sy, int tx, int ty){
		for(int s = 0;s<4;s++){
			int nx = sx,ny = sy;
			nx += d[0][s];ny += d[1][s];
			if(nx == tx && ny == ty) return true;
		}
		return false;
	}
	public static boolean isSeparate(int h,int w){
		if((h == 0 && w == 0) || (h == H - 1 && w == 0) || (h == 0 && w == W - 1)||(h == H -1 && w == W-1)){
			return false;
		}
		if(h == 0){
			if(map[0][w-1] == 0 && map[0][w + 1] == 0){
				return true;
			}
		} else if(h == H -1){
			if(map[H-1][w-1] == 0 && map[H-1][w+1] ==0){
				return true;
			}
		}else if(w == 0){
			if(map[h-1][0] == 0 && map[h + 1][0] == 0){
				return true;
			}
		}else if(w == W-1){
			if(map[h-1][W-1] == 0 && map[h + 1][W-1] == 0){
				return true;
			}
		}
		return false;
	}

}