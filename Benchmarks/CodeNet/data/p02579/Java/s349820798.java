import java.util.*;
import java.io.*;
public class Main{
	static int[][] ma;
	static int h , w;
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		h = Integer.parseInt(sc.next());
		w = Integer.parseInt(sc.next());
		int cx = Integer.parseInt(sc.next()) - 1;
		int cy = Integer.parseInt(sc.next()) - 1;
		int dx = Integer.parseInt(sc.next()) - 1;
		int dy = Integer.parseInt(sc.next()) - 1;
		ma = new int[h][w];
		for(int i = 0 ; i < h ; i++){
			String s = sc.next();
			for(int j = 0 ; j < w ; j++){
				if(s.charAt(j) == '#') ma[i][j] = -1;
				else ma[i][j] = (int)Math.pow(10 , 9);
			}
		}
		ma[cx][cy] = 0;
		dfs(cx , cy , ma);
		if(ma[dx][dy] == Math.pow(10 , 9)) ou.println(-1);
		else ou.println(ma[dx][dy]);
		ou.flush();
	}
	static void dfs(int i , int j , int[][] map){
		if(i - 1 >= 0 && map[i - 1][j] > map[i][j]){
			map[i - 1][j] = map[i][j];
			dfs(i - 1 , j , map);
		}
		if(i + 1 < h && map[i + 1][j] > map[i][j]){
			map[i + 1][j] = map[i][j];
			dfs(i + 1 , j , map);
		}
		if(j - 1 >= 0 && map[i][j - 1] > map[i][j]){
			map[i][j - 1] = map[i][j];
			dfs(i , j - 1 , map);
		}
		if(j + 1 < w && map[i][j + 1] > map[i][j]){
			map[i][j + 1] = map[i][j];
			dfs(i , j + 1 , map);
		}
		for(int ii = i - 2 ; ii <= i + 2 ; ii++){
			if(ii < 0 || ii >= h) continue;
			for(int jj = j - 2 ; jj <= j + 2 ; jj++){
				if(jj < 0 || jj >= w) continue;
				if(map[ii][jj] > map[i][j] + 1){
					map[ii][jj] = map[i][j] + 1;
					dfs(ii , jj , map);
				}
			}
		}
	}
}