import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static char[][] map;
	public static int w, h;
	public static boolean[][] used;
	public static int[][][] val;
	public static int[][] len;
	public static final int[] dx = {1, 0};
	public static final int[] dy = {0, 1};
//	public static int turn;
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			w = in.nextInt();
			h = in.nextInt();
			if(w == 0) break;
			map = new char[h][w];
			val = new int[h][w][h+w];
			len = new int[h][w];
			used = new boolean[h][w];
			for(int i=0; i<h; i++){
				map[i] = in.next().toCharArray();
				for(int j=0; j<w; j++){
					if(!Character.isDigit(map[i][j])) continue;
					val[i][j][0] = map[i][j]-'0';
					if(val[i][j][0] == 0) continue;
					len[i][j] = 1;
				}
			}
			int[] max = new int[h+w];
			int mlen = 0;
			for(int i=0; i<h; i++){
				for(int j=0; j<w; j++){
					if(!Character.isDigit(map[i][j])) continue;
					for(int k=0; k<2; k++){
						int ny = i+dy[k];
						int nx = j+dx[k];
						if(out(ny, nx)) continue;
						if(!Character.isDigit(map[ny][nx])) continue;
						val[i][j][len[i][j]] = map[ny][nx]-'0';
						len[i][j]++;
						if(larger(val[i][j], len[i][j], val[ny][nx], len[ny][nx])){
							val[ny][nx] = val[i][j].clone();
							len[ny][nx] = len[i][j];
							if(larger(val[i][j], len[i][j], max, mlen)){
								max = val[i][j].clone();
								mlen = len[i][j];
							}
						}
						len[i][j]--;
						val[i][j][len[i][j]] = 0;
					}
				}
			}
			for(int i=0; i<mlen; i++){
				System.out.print(max[i]);
			}
			System.out.println();
		}
	}
	
	public static boolean out(int y, int x){
		return x<0 || x>=w || y<0 || y>=h;
	}
	
	public static boolean larger(int[] s1, int l1, int[] s2, int l2){
		// is 1 larger than 2 ?
		if(l1 > l2) return true;
		if(l1 < l2) return false;
		int length = l1;
		for(int i=0; i<length; i++){
			if(s1[i] == s2[i]) continue;
			if(s1[i] < s2[i]) return false;
			return true;
		}
		return false;
	}
}