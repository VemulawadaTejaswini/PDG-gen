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
	int w, h;
	boolean[][] visited;

	void run(){
		sc=new Scanner(System.in);
		for(;;){
			h=sc.nextInt();
			w=sc.nextInt();
			sc.nextLine();
			if(h==0&&w==0)
				break;
			map=new int[h][w];
			visited=new boolean[h][w];
			for(int j=0; j<h; j++){
				String s=sc.next();
				for(int i=0; i<w; i++){
					switch(s.charAt(i)){
					case '@':
						map[j][i]=0;
						break;
					case '#':
						map[j][i]=1;
						break;
					case '*':
						map[j][i]=2;
						break;
					}
				}
			}
			int ans=0;
			for(int j=0; j<h; j++){
				for(int i=0; i<w; i++){
					if(!visited[j][i]){
						ans++;
						rec(i, j, map[j][i]);
					}
				}
			}
			println(ans+"");
		}
	}

	void rec(int x, int y, int fruit){
		if(x<0||x>=w||y<0||y>=h)
			return;
		if(visited[y][x])
			return;
		if(map[y][x]!=fruit)
			return;
		visited[y][x]=true;
		rec(x, y-1, fruit);
		rec(x, y+1, fruit);
		rec(x-1, y, fruit);
		rec(x+1, y, fruit);
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