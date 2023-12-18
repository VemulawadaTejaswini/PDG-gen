import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

// Restrictive Filesystem
// 2013/05/13
public class Main{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	int n;
	String[] ss;

	void run(){
		try{
			for(;;){
				n=Integer.parseInt(br.readLine());
				if(n==0){
					break;
				}
				ss=new String[n];
				for(int i=0; i<n; i++){
					ss[i]=br.readLine();
				}
				solve();
			}
		}catch(Exception e){}
	}

	void solve(){
		ArrayList<Mem> list=new ArrayList<Mem>();
		boolean[] removed=new boolean[10010];
		int[] ids=new int[10010];
		HashMap<Integer, Integer> rev=new HashMap<Integer, Integer>();

		list.add(new Mem(0, (int)1e9+10));
		removed[0]=true;
		ids[0]=-1;
		rev.put(-1, 0);

		StringBuilder sb=new StringBuilder();
		for(String s : ss){
			String[] ss=s.split(" ");
			if(ss[0].equals("W")){
				int id=Integer.parseInt(ss[1]), len=Integer.parseInt(ss[2]);
				ids[rev.size()+1]=id;
				rev.put(id, rev.size()+1);
				id=rev.get(id);
				for(int i=0, size=list.size(); i<size; i++){
					Mem m=list.get(i);
					if(removed[m.id]){
						if(len>=m.len){
							m.id=id;
							len-=m.len;
						}else if(len<m.len){
							int right=m.len-len;
							m.id=id;
							m.len=len;
							list.add(i+1, new Mem(0, right));
							len=0;
						}
					}
					if(len==0){
						break;
					}
				}
			}else if(ss[0].equals("D")){
				int id=Integer.parseInt(ss[1]);
				removed[rev.get(id)]=true;
			}else{
				int at=Integer.parseInt(ss[1]);
				int tot=0;
				for(int i=0, size=list.size(); i<size; i++){
					Mem m=list.get(i);
					if(tot+m.len>at){
						int id=m.id;
						sb.append(removed[id]?-1:ids[id]).append('\n');
						break;
					}
					tot+=m.len;
				}
			}
		}
		println(sb.toString());
	}

	class Mem{
		int id, len;

		Mem(int id, int len){
			this.id=id;
			this.len=len;
		}
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();
	}
}