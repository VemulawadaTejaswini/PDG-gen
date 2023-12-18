import java.util.*;

public class Main {
	int [][] sumdata;
	int sum,c;
	int [][][][] group, y;
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int h = sc.nextInt();
			int w = sc.nextInt();
			c = sc.nextInt();
			if(h == 0 && w == 0 && c == 0) break;
			int [][]data = new int[h][w];
			sumdata = new int[h+2][w+2];
			group = new int[h][w][h][w];
			y = new int[h][w][h][w];
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					data[i][j] = sc.nextInt();
					sumdata[i+1][j+1] = data[i][j] + sumdata[i][j+1] + sumdata[i+1][j] - sumdata[i][j];
				}
			}
			sum = sumdata[h][w];
			//System.out.println(sum);
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					group[i][j][i][j] = 1;
					y[i][j][i][j] = getY(data[i][j]);
				}
			}
//			for(int i=0; i < h; i++){
//				for(int j = 0; j < w; j++){
//					System.out.printf("%2d ",y[i][j][i][j]);
//				}
//				System.out.println();
//			}

			int [] res = dfs(0,0,w-1,h-1);
			//System.out.print("ANS=");
			System.out.println(res[0] + " " + res[1]);
		}
	}
	private int[] dfs(int sx, int sy, int ex, int ey) {
		int [] res = new int[2];
		if(group [sy][sx][ey][ex] > 0){
			res[0] = group[sy][sx][ey][ex];
			res[1] = y [sy][sx][ey][ex];
			return res;
		}
		res[0] = 1;
		res[1] = getY(getSeg(sx+1,sy+1,ex+1,ey+1));
		for(int i=sy; i < ey; i++){
			//System.out.println("pass2");
			int [] temp = dfs(sx,sy,ex,i);
			int [] temp2 = dfs(sx,i+1,ex,ey);
			if(temp[1] < 0 || temp2[1] < 0) continue;
			int gsum = temp[0] + temp2[0];
			int ysum = Math.min(temp[1],temp2[1]);
			//System.out.println("ygsum= "+gsum + " " + ysum);
			if(res[0] < gsum){
				res[0] = gsum;
				res[1] = ysum;
			}
			else if(res[0] == gsum && res[1] < ysum ){
				res[0] = gsum;
				res[1] = ysum;
			}
		}
		
		for(int i=sx; i < ex; i++){
			//System.out.println("pass1 = " + sx + " " + sy + " " + ex + " " + ey + " i= " + i);
			int [] temp = dfs(sx,sy,i,ey);
			int [] temp2 = dfs(i+1,sy,ex,ey);
			if(temp[1] < 0 || temp2[1] < 0) continue;
			int gsum = temp[0] + temp2[0];
			int ysum = Math.min(temp[1],temp2[1]);
			if(res[0] < gsum){
				res[0] = gsum;
				res[1] = ysum;
			}
			else if(res[0] == gsum && res[1] < ysum ){
				res[0] = gsum;
				res[1] = ysum;
			}
		}
		group[sy][sx][ey][ex] = res[0];
		y[sy][sx][ey][ex] = res[1];
		//System.out.println(res[0] + " " + res[1]);
		return res;
	}
	private int getY(int a) {
		int res = c - (sum - a);
		return res;
	}
	private int getSeg(int sx, int sy, int ex, int ey) {
		int res = sumdata[ey][ex] - sumdata[ey][sx-1] - sumdata[sy-1][ex] + sumdata[sy-1][sx-1];
		return res;
	}
	
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}