

import java.util.Scanner;

public class Main{
	
	
	static int H,W,res=0;
	static char[][] map;
	static boolean[][] flag;
	static int[] dx = {0,1,0,-1};
	static int[] dy = {1,0,-1,0};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			res = 0;
			W = sc.nextInt();
			H = sc.nextInt();
			if(W==0&&H==0) break;
			sc.nextLine();
			String temp;
			map = new char[H][];
			flag = new boolean[H][];
			for (int i = 0; i < H; i++) {
				map[i] = new char[W];
				flag[i] = new boolean[W];
				temp = sc.nextLine();
				for (int j = 0; j < W; j++) {
					map[i][j] = temp.charAt(j);
					flag[i][j] = false;
				}
			}
			
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					if(!flag[i][j]) {
						dfs(j,i,map[i][j]);
						res++;
					}
				}
			}
			
			System.out.println(res);
		}
	}
	
	public static void dfs(int x,int y,char c) {
		
		flag[y][x] = true;
		for (int i = 0; i < dx.length; i++) {
			for (int j = 0; j < dy.length; j++) {
				int nx = x+dx[i];
				int ny = y + dy[i];
				if(0<=nx&&nx<W&&0<=ny&&ny<H&&map[ny][nx]==c&&!flag[ny][nx]) {
					dfs(nx,ny,c);
				}
			}
		}
		
	}

}

