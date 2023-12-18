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

	int n, m;
	String[] ss;

	void run(){
		n=sc.nextInt();
		m=sc.nextInt();
		ss=new String[n];
		for(int i=0; i<n; i++){
			ss[i]=sc.next();
		}
		solve();
	}

	void solve(){
		V[] vs=new V[m*2];
		for(int i=0; i<m*2; i++){
			vs[i]=new V();
		}
		for(int i=0; i<m; i++){
			vs[i].not=vs[m+i];
			vs[m+i].not=vs[i];
		}
		ArrayList<String> list=new ArrayList<String>();
		for(String s : ss){
			E exp=conv(s);
//			debug(exp.s1, exp.s2, exp.not1, exp.not2, exp.op);
			if(exp.s1!=null&&!list.contains(exp.s1)){
				list.add(exp.s1);
			}
			if(exp.s2!=null&&!list.contains(exp.s2)){
				list.add(exp.s2);
			}
		}
		// debug("list", list);
		for(String s : ss){
			E exp=conv(s);
			if(exp.s2==null){
				// 単項
				V v=vs[list.indexOf(exp.s1)];
				if(exp.not1){
					v=v.not;
				}
				or(v, v);
			}else{
				V v1=vs[list.indexOf(exp.s1)], v2=vs[list.indexOf(exp.s2)];
				if(exp.not1){
					v1=v1.not;
				}
				if(exp.not2){
					v2=v2.not;
				}
				if(exp.op==0){
					// or
					or(v1, v2);
				}else{
					or(v1, v1);
					or(v2, v2);
				}
			}
		}
		scc(vs);
		boolean ok=true;
		for(int i=0; i<m; i++){
			ok&=vs[i].comp!=vs[i].not.comp;
		}
		// debug(ok);
		println(ok?"accept":"reject");
	}

	void or(V u, V v){
		u.not.connect(v);
		v.not.connect(u);
	}

	E conv(String s){
		s=s.substring(0, s.length()-1);
		int k=max(s.indexOf('&'), s.indexOf('|'));
		if(k==-1){
			// 単項
			boolean not=(s.length()-s.replaceAll("~", "").length())%2==1;
			String name=s.replaceAll("\\(|\\)|~", "");
			// debug(not, name);
			return new E(name, null, not, false, -1);
		}else{
			int op=s.charAt(k)=='&'?1:0;
			String s1=s.substring(0, k), s2=s.substring(k+1, s.length());
			String name1=s1.replaceAll("\\(|\\)|~", "");
			String name2=s2.replaceAll("\\(|\\)|~", "");
			boolean not=false, not1=false, not2;
			not2=(s2.length()-s2.replaceAll("~", "").length())%2==1;
			int left=0, right=count(s2, ')')-count(s2, '(');
//			debug(right);
			for(int i=k-1; i>=0; i--){
				if(s1.charAt(i)=='~'){
					if(right==0||right-left>0){
						not1=!not1;
					}else{
						not=!not;
					}
				}else if(s1.charAt(i)=='('){
					left++;
				}else if(s1.charAt(i)==')'){
					left--;
				}
			}
			if(not){
				not1=!not1;
				not2=!not2;
				op=1-op;
			}
			// debug("name1", name1, "name2", name2);
			// debug("not", not, "not1", not1, "not2", not2, "op", op);
			return new E(name1, name2, not1, not2, op);
		}
	}

	class E{
		String s1, s2;
		boolean not1, not2;
		int op; // 0:\/, 1:/\

		E(String s1, String s2, boolean not1, boolean not2, int op){
			this.s1=s1;
			this.s2=s2;
			this.not1=not1;
			this.not2=not2;
			this.op=op;
		}
	}

	LinkedList<V> list;

	int scc(V[] vs){
		list=new LinkedList<V>();
		for(V v : vs)
			dfs(v);
		for(V v : vs)
			v.visit=false;
		int k=0;
		for(V u : list)
			if(!u.visit)
				revdfs(u, k++);
		return k;
	}

	void dfs(V v){
		if(v.visit)
			return;
		v.visit=true;
		for(V u : v.es)
			dfs(u);
		list.addFirst(v);
	}

	void revdfs(V v, int k){
		if(v.visit)
			return;
		v.visit=true;
		v.comp=k;
		for(V u : v.rs)
			revdfs(u, k);
	}

	class V{
		ArrayList<V> es=new ArrayList<V>(), rs=new ArrayList<V>();
		boolean visit;
		int comp;
		V not;

		void connect(V v){
			es.add(v);
			v.rs.add(this);
		}

	}

	int count(String s, char c){
		return s.length()-s.replaceAll("\\"+c, "").length();
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