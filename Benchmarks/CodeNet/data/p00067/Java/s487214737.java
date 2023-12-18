import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main{

	Scanner sc;

	static final int INF=1<<28;
	static final double EPS=1e-9;

	int[][] map;
	boolean[][] visited;
	int n=12;

	void rec(int x, int y){
		if(x<0||x>=n||y<0||y>=n)
			return;
		if(visited[y][x])
			return;
		if(map[y][x]==0)
			return;
		visited[y][x]=true;
		rec(x, y-1);
		rec(x, y+1);
		rec(x-1, y);
		rec(x+1, y);
	}

	void run(){
		map=new int[n][n];
		sc=new Scanner(System.in);
		for(; sc.hasNext();){
			for(int j=0; j<n; j++){
				String s=sc.next();
				for(int i=0; i<n; i++)
					map[j][i]=s.charAt(i)=='0'?0:1;
			}
			visited=new boolean[n][n];
			int ans=0;
			for(int j=0; j<n; j++){
				for(int i=0; i<n; i++){
					if(map[j][i]==1&&!visited[j][i]){
						ans++;
						rec(i, j);
					}
				}
			}
			println(ans+"");
		}
		sc.close();
	}

	void print(String s){
		System.out.print(s);
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();
	}
}