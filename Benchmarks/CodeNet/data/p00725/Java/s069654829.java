import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		solve();
	}

	private static void solve() {
		Scanner sc = new Scanner(System.in);
		PrintWriter pr = new PrintWriter(System.out);
		while(true){
			int w = sc.nextInt();
			int h = sc.nextInt();
			if(w==0&&h==0) break;
			int[][] map = new int[h+2][w+2];
			for(int s=0;s<h+2;s++){
				for(int t=0;t<w+2;t++){
					map[s][t] = -1;
				}
			}
			for(int s=1;s<h+1;s++){
				for(int t=1;t<w+1;t++){
					map[s][t] = sc.nextInt();
				}
			}
			pr.println(curl(1,map,h,w));
		}
		pr.flush();
		sc.close();
	}

	private static int curl(int i, int[][] map,int h, int w) {
		if(i==11) return -1;
		int[] dx = new int[]{-1,0,0,1};
		int[] dy = new int[]{0,-1,1,0};
		boolean[] flag = new boolean[]{false,false,false,false};
		int[][][] maptmp = new int[4][h+2][w+2];
		int startx=0;
		int starty=0;
		for(int s=1;s<h+1;s++){
			for(int t=1;t<w+1;t++){
				if(map[s][t]==2){
					startx = s;
					starty = t;
				}
			}
		}
		for(int r=0;r<4;r++){
			for(int s=0;s<h+2;s++){
				for(int t=0;t<w+2;t++){
					maptmp[r][s][t] = map[s][t];
				}
			}
		}
		for(int k=0;k<4;k++){
			int x = startx;
			int y = starty;
			maptmp[k][x][y]=0;
			if(maptmp[k][x+dx[k]][y+dy[k]]!=1&& maptmp[k][x+dx[k]][y+dy[k]]!=-1){
				while(maptmp[k][x][y]==0){
					x+=dx[k];
					y+=dy[k];
				}
				if(maptmp[k][x][y]==3){
					return i;
				}
				if(maptmp[k][x][y]==1){
					maptmp[k][x][y]=0;
					maptmp[k][x-dx[k]][y-dy[k]]=2;
					flag[k]=true;
				}
			}
		}
		if(flag[0]!=false&&flag[1]!=false&&flag[2]!=false&&flag[3]!=false){
			return -1;
		}
		int min=11;
		for(int k=0;k<4;k++){
			if(flag[k]){
				int[][] map1 = new int[h+2][w+2];
				for(int s=0;s<h+2;s++){
					for(int t=0;t<w+2;t++){
						map1[s][t] = maptmp[k][s][t];
					}
				}
				int z = curl(i+1,map1,h,w);
				if(min>z){
					min = z;
				}
			}
		}
		return min;
	}
}