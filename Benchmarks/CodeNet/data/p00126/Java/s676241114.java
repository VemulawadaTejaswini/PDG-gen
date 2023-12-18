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

	int n=9;
	int[][] map;
	boolean[][] check;

	void run(){
		sc=new Scanner(System.in);
		int T=sc.nextInt();

		for(int t=0; t<T; t++){
			map=new int[n][n];
			check=new boolean[n][n];
			for(int j=0; j<n; j++)
				for(int i=0; i<n; i++)
					map[j][i]=sc.nextInt();
			row();
			column();
			g();
			for(int j=0; j<n; j++){
				for(int i=0; i<n; i++){
					print(check[j][i]?"*":" ");
					print(map[j][i]+"");
				}
				println("");
			}
			if(t!=T-1)
				println("");
		}
		sc.close();
	}

	void row(){
		for(int j=0; j<n; j++){
			int[] count=new int[n+1];
			for(int i=0; i<n; i++)
				count[map[j][i]]++;
			for(int i=0; i<n; i++)
				if(count[map[j][i]]>1)
					check[j][i]=true;
		}
	}

	void column(){
		for(int i=0; i<n; i++){
			int[] count=new int[n+1];
			for(int j=0; j<n; j++)
				count[map[j][i]]++;
			for(int j=0; j<n; j++)
				if(count[map[j][i]]>1)
					check[j][i]=true;
		}
	}

	void g(){
		for(int q=0; q<n; q+=3){
			for(int p=0; p<n; p+=3){
				int[] count=new int[n+1];
				for(int j=0; j<3; j++)
					for(int i=0; i<3; i++)
						count[map[q+j][p+i]]++;
				for(int j=0; j<3; j++)
					for(int i=0; i<3; i++)
						if(count[map[q+j][p+i]]>1)
							check[q+j][p+i]=true;
			}
		}
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