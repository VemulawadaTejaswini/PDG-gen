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

	int r, c, q;
	int[] a, b, order;

	void run(){
		for(;;){
			r=sc.nextInt();
			c=sc.nextInt();
			q=sc.nextInt();
			if((r|c|q)==0){
				return;
			}
			a=new int[q];
			b=new int[q];
			order=new int[q];
			for(int i=0; i<q; i++){
				a[i]=sc.nextInt();
				b[i]=sc.nextInt();
				order[i]=sc.nextInt();
			}
			solve();
		}
	}

	void solve(){
		boolean[] row=new boolean[r]; // mèµ½?
		boolean[] col=new boolean[c];
		int nRow=0, nCol=0; // mèµ½
		int win=0, lose=0;
		for(int j=q-1; j>=0; j--){
			if(a[j]==0){
				// r
				if(row[b[j]]){
					continue;
				}
				row[b[j]]=true;
				if(order[j]==0){
					lose+=c-nCol;
				}else{
					win+=c-nCol;
				}
				nRow++;
			}else{
				// c
				if(col[b[j]]){
					continue;
				}
				col[b[j]]=true;
				if(order[j]==0){
					lose+=r-nRow;
				}else{
					win+=r-nRow;
				}
				nCol++;
			}
		}
		println(win+"");
		debug(win, lose);
	}

	void debug(Object... os){
		// System.err.println(Arrays.deepToString(os));
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