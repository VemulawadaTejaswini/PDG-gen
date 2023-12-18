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

	int n, m;
	HashMap<String, String> parent;
	HashMap<String, LinkedList<String>> children;

	void run(){
		for(;;){
			n=sc.nextInt();
			m=sc.nextInt();
			if((n|m)==0){
				break;
			}
			parent=new HashMap<String, String>();
			children=new HashMap<String, LinkedList<String>>();
			sc.nextLine();
			String p="", r=""; // ツ親ツ，1ツづつ前
			children.put(p, new LinkedList<String>());
			int x=-1;
			for(int j=0; j<n; j++){
				String s=sc.nextLine();
				int y=s.length()-s.replaceAll(" ", "").length();
				s=s.replaceAll(" ", "");
				debug(s, r, p);
				if(y>x){
					// 1ツづつ可慊づ個階ツ層
					debug("->");
					p=r;
					// parent.put(s, p);
					// children.get(p).add(s);
					// children.put(s, new LinkedList<String>());
				}else if(y<x){
					debug("<-");
					for(int i=y; i<x; i++){
						p=parent.get(p);
					}
					// parent.put(s, p);
					// children.get(p).add(s);
					// children.put(s, new LinkedList<String>());
				}else{
					debug("-");
					// parent.put(s, p);
					// children.get(p).add(s);
					// children.put(s, new LinkedList<String>());
				}
				parent.put(s, p);
				children.get(p).add(s);
				children.put(s, new LinkedList<String>());
				x=y;
				r=s;
			}
			debug();
			dfs("", "");
			for(int i=0; i<m; i++){
				String s=sc.next();
				sc.next();
				sc.next();
				char c=sc.next().charAt(0);
				sc.next();
				String t=sc.next();
				t=t.substring(0, t.length()-1);
				boolean f=false;
				debug(s, t);
				switch(c){
				case 'c':
					f=parent.containsKey(s)&&parent.get(s).equals(t);
					break;
				case 'p':
					f=parent.containsKey(t)&&parent.get(t).equals(s);
					break;
				case 's':
					f=parent.containsKey(s)&&parent.containsKey(t)
							&&parent.get(s).equals(parent.get(t));
					break;
				case 'd':
					for(s=parent.get(s); s!=null; s=parent.get(s)){
						f|=s.equals(t);
					}
					break;
				case 'a':
					for(t=parent.get(t); t!=null; t=parent.get(t)){
						f|=t.equals(s);
					}
					break;
				}
				println(f?"True":"False");
			}
			println("");
			// child:ツ子
			// parent:ツ親
			// sibling:ツ兄ツ津ュ
			// descendant:ツ子ツ堕キ
			// ancestor:ツ静ヲツ祖
		}
	}

	void dfs(String s, String tab){
		for(String t : children.get(s)){
			debug(tab, t, parent.get(t));
			dfs(t, tab+"\t");
		}
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