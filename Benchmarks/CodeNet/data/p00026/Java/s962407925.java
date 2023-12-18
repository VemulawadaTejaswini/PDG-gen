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
	int n=10;

	void run(){
		sc=new Scanner(System.in);
		map=new int[n][n];
		int[][] small={{0, 1, 0}, {1, 1, 1}, {0, 1, 0}};
		int[][] middle={{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
		int[][] large={{0, 0, 1, 0, 0}, {0, 1, 1, 1, 0}, {1, 1, 1, 1, 1},
				{0, 1, 1, 1, 0}, {0, 0, 1, 0, 0}};

		for(; sc.hasNext();){
//		for(int t=0; t<6; t++){
			String[] ss=sc.nextLine().split(",");
			int x=Integer.parseInt(ss[0]);
			int y=Integer.parseInt(ss[1]);
			int s=Integer.parseInt(ss[2]);
			int[][] d;
			if(s==1)
				d=small;
			else if(s==2)
				d=middle;
			else
				d=large;

			int m=d.length/2;
			for(int j=-m; j<=m; j++)
				for(int i=-m; i<=m; i++)
					if(d[j+m][i+m]==1)
						drop(x+i, y+j);
		}
		int max=0;
		int cnt=0;
		for(int j=0; j<n; j++){
			for(int i=0; i<n; i++){
				max=max(max, map[j][i]);
				if(map[j][i]==0)
					cnt++;
			}
		}
		println(cnt+"");
		println(max+"");
		sc.close();
	}

	void drop(int x, int y){
		if(x<0||x>=n||y<0||y>=n)
			return;
		map[y][x]++;
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