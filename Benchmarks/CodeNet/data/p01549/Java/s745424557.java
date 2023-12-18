import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

// Zero Division Checker
// 2012/09/20
public class Main{
	Scanner sc=new Scanner(System.in);

	int m;
	HashMap<String, Integer> lbMap, ubMap;
	int n;
	String[] es;

	void run(){
		m=sc.nextInt();
		lbMap=new HashMap<String, Integer>();
		ubMap=new HashMap<String, Integer>();
		for(int i=0; i<m; i++){
			String name=sc.next();
			int lb=sc.nextInt();
			int ub=sc.nextInt();
			lbMap.put(name, lb);
			ubMap.put(name, ub);
		}
		n=sc.nextInt();
		es=new String[n];
		for(int i=0; i<n; i++){
			es[i]=sc.next();
		}
		solve();
	}

	void solve(){
		int M=256;
		LinkedList<int[]> stack=new LinkedList<int[]>();
		boolean correct=true;
		for(int k=0; k<n; k++){
			char c=es[k].charAt(0);
			if(Character.isDigit(c)){
				int[] a=new int[M];
				a[Integer.parseInt(es[k])]=1;
				stack.push(a);
			}else if(Character.isLetter(c)){
				int[] a=new int[M];
				int lb=lbMap.get(es[k]);
				int ub=ubMap.get(es[k]);
				for(int i=lb; i<=ub; i++){
					a[i]=1;
				}
				stack.push(a);
			}else{
				int[] b=stack.pop();
				int[] a=stack.pop();
				int[] r=new int[M];
				for(int j=0; j<M; j++){
					for(int i=0; i<M; i++){
						if(a[i]==0||b[j]==0){
							continue;
						}
						int res;
						if(c=='+'){
							res=(i+j)%256;
						}else if(c=='-'){
							res=(i-j+256)%256;
						}else if(c=='*'){
							res=(i*j)%256;
						}else{
							if(j==0){
								correct=false;
								res=0;
							}else{
								res=(i/j)%256;
							}
						}
						r[res]=1;
					}
				}
				stack.push(r);
			}
		}
		println(correct?"correct":"error");
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();
	}
}