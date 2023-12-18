import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

// Integral Rectangles
// 2013/08/13
public class Main{
	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-12;

	String line;

	void run(){
		for(int T=sc.nextInt(); T>0; T--){
			line=sc.next();
			solve();
		}
	}

	void solve(){
		println(dfs(0, line.length())+"");
	}

	int dfs(int s, int t){
		// debug("s", s, "t", t);
		if(line.charAt(s+1)!='['){
			// debug(line.substring(s+1, t));
			return Integer.parseInt(line.substring(s+1, t))/2+1;
		}
		int stack=0;
		int left=0;
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=s+1; i<=t-1; i++){
			// debug(i);
			if(line.charAt(i)=='['){
				if(stack++==0){
					left=i;
				}
				// stack++;
			}else if(line.charAt(i)==']'){
				stack--;
			}
			if(stack==0){
				int right=i;
				// left,right [, ]
				list.add(dfs(left, right));
			}
		}
		// debug(list);
		sort(list);
		int res=0;
		for(int i=0; i<list.size()/2+1; i++){
			res+=list.get(i);
		}
		// debug("s", s, "t", t,res);
		return res;
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
		new Main().run();
	}
}