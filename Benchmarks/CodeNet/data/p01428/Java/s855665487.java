import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main{
	public static char[] s;
	public static boolean debug = true;
	static final int n = 8;
	public static void main(String[] args) throws IOException{
		Scanner in = debug ? new Scanner(System.in) : new Scanner(new File("L"));
		char[][] s = new char[n][];
		for(int i=0; i<n; i++){
			s[i] = in.next().toCharArray();
		}
		dfs(s, 'o', false);
		output(s);
	}
	
	static void output(char[][] s){
		for(int i=0; i<n; i++){
			System.out.println(String.valueOf(s[i]));
		}
	}
	
//	static int[][] dbg = new int[n][n];
//	static String dump(char[][] s){
//		StringBuilder sb = new StringBuilder();
//		for(int i=0; i<n; i++){
//			for(int j=0; j<n; j++){
//				if(dbg[i][j] != 0) sb.append(dbg[i][j]);
//				else sb.append(s[i][j]);
//			}
//			sb.append('\n');
//		}
//		return sb.toString();
//	}
//	static void clear(){
//		for(int i=0; i<n; i++){
//			for(int j=0; j<n; j++){
//				dbg[i][j] = 0;
//			}
//		}
//	}
	
	static final int[] dx = {-1, 0, 1, -1, 1, -1, 0, 1};
	static final int[] dy = {-1, -1, -1, 0, 0, 1, 1, 1};
	static void dfs(char[][] s, char c, boolean pass){
//		clear();
		
		Pos p = null;
		if(c=='o'){
			for(int i=0; i<n; i++){
				for(int j=0; j<n; j++){
					if(s[i][j] != '.') continue;
					Pos tmp = check(s, c, i, j);
//					dbg[i][j] = tmp.del;
					if(tmp.del > 0 && (p == null || p.del < tmp.del)){
						p = tmp;
					}
				}
			}
		}else{
			for(int i=n-1; i>=0; i--){
				for(int j=n-1; j>=0; j--){
					if(s[i][j] != '.') continue;
					Pos tmp = check(s, c, i, j);
//					dbg[i][j] = tmp.del;
					if(tmp.del > 0 && (p == null || p.del < tmp.del)){
						p = tmp;
					}
				}
			}
		}
//		System.out.println(dump(s));
		if(p == null){
			if(!pass) dfs(s, c=='o'?'x':'o', true);
			return;
		}
//		System.out.println(p);
		s[p.y][p.x] = c;
		for(int i=0; i<8; i++){
			if((p.dir&1<<i)==0) continue;
			int x = p.x + dx[i];
			int y = p.y + dy[i];
			while(s[y][x] != c){
				s[y][x] = c;
				y += dy[i];
				x += dx[i];
			}
		}
		dfs(s, c=='o'?'x':'o', false);
	}
	
	static Pos check(char[][] s, char c, int i, int j){
		char enm = c=='o'?'x':'o';
		int del = 0;
		int dir = 0;
		for(int k=0; k<8; k++){
			int nx = j+dx[k];
			int ny = i+dy[k];
			if(out(nx, ny) || s[ny][nx] != enm) continue;
			while(!out(nx, ny) && s[ny][nx] == enm){
				nx += dx[k];
				ny += dy[k];
			}
			if(out(nx, ny) || s[ny][nx] != c) continue;
			del += Math.max(Math.abs(i-ny), Math.abs(j-nx))-1;
			dir |= 1<<k;
		}
		return new Pos(j, i, dir, del);
	}
	
	static boolean out(int x, int y){
		return x<0 || x>=n || y<0 || y>=n;
	}
}

class Pos{
	int x, y, dir;
	int del;
	Pos(int x, int y, int dir, int del){
		this.x = x;
		this.y = y;
		this.dir = dir;
		this.del = del;
	}
	
	public String toString(){
		return "("+x+","+y+")";
	}
}