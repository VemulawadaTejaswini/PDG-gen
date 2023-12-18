import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main{

	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-9;

	int s, g;
	int n;

	void run(){
		n=sc.nextInt();
		for(int i=0; i<n; i++){
			s=sc.nextInt();
			g=sc.nextInt();
			solve();
		}
	}

	void solve(){
		// s<g
		LinkedList<Integer> list=new LinkedList<Integer>();
		if(s<g){
			for(int i=s; i<=g; i++){
				list.add(i);
			}
		}else{
			if(s<=5){
				for(int i=s; i>=g; i--){
					list.add(i);
				}
			}else{
				// s>5
				int i=s;
				boolean f=false;
				for(; i<=9; i++){
					list.add(i);
					if(i==g){
						f=true;
						break;
					}
				}
				if(!f){
					for(i=5; i>=0; i--){
						list.add(i);
						if(i==g){
							f=true;
							break;
						}
					}
				}
				if(!f){
					for(i=1; i<=g; i++){
						list.add(i);
						if(i==g){
							f=true;
							break;
						}
					}
				}
			}
		}
		for(int i=0; i<list.size(); i++){
			print(list.get(i)+(i==list.size()-1?"\n":" "));
		}
	}

	void debug(Object... os){
		System.err.println(Arrays.deepToString(os));
	}

	void print(String s){
		System.out.print(s);
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		// System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
		new Main().run();
	}
}