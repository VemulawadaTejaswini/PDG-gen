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

	void run(){
		sc=new Scanner(System.in);
		for(;;){
			int h=sc.nextInt();
			int w=sc.nextInt();
			sc.nextLine();
			if(w==0&&h==0)
				break;
			String[] map=new String[h];
			for(int i=0; i<h; i++)
				map[i]=sc.nextLine();
			int x=0, y=0;
			boolean[][] visited=new boolean[h][w];
			boolean f=false;
			for(;;){
				if(visited[y][x]){
					f=true;
					break;
				}
				visited[y][x]=true;
				if(map[y].charAt(x)=='.')
					break;
				switch(map[y].charAt(x)){
				case '^':
					y--;
					break;
				case 'v':
					y++;
					break;
				case '<':
					x--;
					break;
				case '>':
					x++;
					break;
				}
			}
			if(f)
				println("LOOP");
			else
				println(x+" "+y);
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