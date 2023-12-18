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

	int n;
	boolean[] bs;

	void run(){
		for(;;){
			n=sc.nextInt();
			if(n==0){
				break;
			}
			bs=new boolean[2*n+1];
			for(int i=0; i<n; i++){
				bs[sc.nextInt()]=true;
			}
			solve();
		}
	}

	void solve(){
		int ba=0;
		@SuppressWarnings("unchecked")
		LinkedList<Integer>[] a=new LinkedList[2];
		a[0]=new LinkedList<Integer>();
		a[1]=new LinkedList<Integer>();
		for(int i=1; i<=2*n; i++){
			if(bs[i]){
				a[0].addLast(i);
			}else{
				a[1].addLast(i);
			}
		}

		for(;;){
			for(int i=0; i<2; i++){
				int k=0;
				for(int e : a[i]){
					if(e>ba){
						k=e;
						break;
					}
				}
				if(k>0){
					ba=k;
					a[i].remove((Integer)k);
				}else{
					ba=0;
				}
				if(a[i].size()==0){
					break;
				}
			}
			if(a[0].size()==0||a[1].size()==0){
				break;
			}
		}
		println(a[1].size()+"");
		println(a[0].size()+"");
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