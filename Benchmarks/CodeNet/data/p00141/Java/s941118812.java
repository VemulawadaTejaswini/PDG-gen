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

	int m;

	void run(){
		for(int n=sc.nextInt(); n>0; n--){
			m=sc.nextInt();
			solve();
		}
	}

	void solve(){
		char[][] cs=new char[m][m];
		for(int k=0; k<m; k++){
			Arrays.fill(cs[k], ' ');
		}

		int i=-1, j=m-1;
		int a;
		for(int k=0;;){
			// up
			for(i++, a=0; j-k>=0; j--, a++)
				cs[j][i]='#';
			if(a<3)
				break;
			// right
			for(j++, a=0; i+k<m; i++, a++)
				cs[j][i]='#';
			if(a<3)
				break;
			// down
			for(i--, a=0; j+k<m; j++, a++)
				cs[j][i]='#';
			if(a<3)
				break;
			k+=2;
			// left
			for(j--, a=0; i-k>=0; i--, a++)
				cs[j][i]='#';
			if(a<3)
				break;
		}
		for(int k=0; k<m; k++){
			println(new String(cs[k]));
		}
		println("");
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