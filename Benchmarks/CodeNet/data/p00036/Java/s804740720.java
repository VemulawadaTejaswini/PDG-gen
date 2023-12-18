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

	class B{
		int[][] a;
		String name;

		B(int[][] a, String name){
			this.a=a;
			this.name=name;
		}
	}

	int[][] A={{1, 1}, {1, 1}};
	int[][] B={{1}, {1}, {1}, {1}};
	int[][] C={{1, 1, 1, 1}};
	int[][] D={{0, 1}, {1, 1}, {1, 0}};
	int[][] E={{1, 1, 0}, {0, 1, 1}};
	int[][] F={{1, 0}, {1, 1}, {0, 1}};
	int[][] G={{0, 1, 1}, {1, 1, 0}};

	int[][] field;

	int n=8;

	void run(){
		LinkedList<B> blocks=new LinkedList<B>();
		blocks.add(new B(A, "A"));
		blocks.add(new B(B, "B"));
		blocks.add(new B(C, "C"));
		blocks.add(new B(D, "D"));
		blocks.add(new B(E, "E"));
		blocks.add(new B(F, "F"));
		blocks.add(new B(G, "G"));

		sc=new Scanner(System.in);
		for(;;){
			field=new int[n][n];
			for(int j=0; j<n; j++){
				String s=sc.nextLine();
				for(int i=0; i<n; i++){
					if(s.charAt(i)=='1')
						field[j][i]=1;
				}
			}
			boolean f=false;
			for(int j=0; j<n; j++){
				for(int i=0; i<n; i++){
					for(B b : blocks){
						if(match(b, i, j)){
							println(b.name);
							f=true;
							break;
						}
					}
					if(f)
						break;
				}
				if(f)
					break;
			}
			if(!sc.hasNextLine())
				break;
			sc.nextLine();
		}
		sc.close();
	}

	boolean match(B b, int x, int y){
		int[][] a=b.a;
		for(int j=0; j<a.length; j++){
			for(int i=0; i<a[0].length; i++){
				int x2=x+i;
				int y2=y+j;
				if(x2<0||x2>=n||y2<0||y2>=n)
					return false;
				if(a[j][i]==1&&field[y2][x2]==0)
					return false;
			}
		}
		return true;
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