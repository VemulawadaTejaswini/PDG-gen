import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Main{
	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-12;

	HashSet<String> set;

	void run(){
		for(;;){
			int n=sc.nextInt();
			if(n==0){
				break;
			}
			set=new HashSet<String>();
			for(int i=0; i<n; i++){
				set.add(sc.next());
			}
			solve();
		}
	}

	String[] ss;
	int n;

	void solve(){
		for(;;){
			String remove=null;
			for(String s : set){
				for(String t : set){
					if(!t.equals(s)&&t.indexOf(s)>=0){
						remove=s;
					}
				}
			}
			if(remove!=null){
				set.remove(remove);
			}else{
				break;
			}
		}
		ss=set.toArray(new String[0]);
		n=ss.length;
		M=new int[n][n];
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				// ss[i]->ss[j]
				for(int k=0; k<ss[j].length(); k++){
					if(ss[i].endsWith(ss[j].substring(0, k))){
						M[i][j]=k;
					}
				}
				// debug(ss[i], ss[j], M[i][j]);
			}
		}
		ans=null;
		rec("", -1, 0);
		println(ans);
	}

	int[][] M;
	String ans;

	void rec(String now, int last, int used){
		if(used==(1<<n)-1){
			if(ans==null||now.length()<ans.length()
					||(now.length()==ans.length()&&now.compareTo(ans)<0)){
				ans=now;
			}
		}
		for(int i=0; i<n; i++){
			if((used>>i&1)==0){
				if(last==-1){
					rec(ss[i], i, used|(1<<i));
				}else{
					rec(now+ss[i].substring(M[last][i]), i, used|(1<<i));
				}
			}
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
		new Main().run();
	}
}