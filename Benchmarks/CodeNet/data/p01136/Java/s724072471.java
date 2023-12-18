import java.util.*;
import static java.lang.Math.*;
public class Main {
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		new AOJ2011();
	}
}
class AOJ2011{
	final Scanner sc = new Scanner(System.in);
	AOJ2011(){
		while(sc.hasNext()){
			n=sc.nextInt();
			if(n==0)	break;
			solve();
		}
	}
	int n;
	ArrayList<ArrayList<Integer>> f;
	void solve(){
		f=new ArrayList<ArrayList<Integer>>(n);
		for(int i=0; i<=30; ++i)f.add(new ArrayList<Integer>());
		for(int i=0; i<n; ++i){
			int m=sc.nextInt();
			for(int j=0; j<m; ++j){
				int d=sc.nextInt();
				f.get(d).add(i);
			}
		}
		
//		System.out.println(f);
		
		for(int i=1; i<=30; ++i){
			String[] init=new String[n];
			for(int j=0; j<n; ++j)init[j]=""+j;
			if( dfs(init,1,i) ){
				System.out.println(i);
				return;
			}
		}
		System.out.println(-1);
	}
	boolean dfs(String[] list,int depth,int lim){
		
//		System.out.println(depth+" "+Arrays.toString(list));
		
		for(int i=0; i<n; ++i)if(list[i].length()>=n)	return true;
		
		if(depth>lim)	return false;
		
		ArrayList<Integer> cand=f.get(depth);
		for(int i=0; i<cand.size(); ++i){
			String[] prev=new String[f.size()];
			prev[0]=list[cand.get(i)];
			int k=1;
			for(int j=0; j<cand.size(); ++j){
				if(i==j)	continue;
				prev[k++]=list[cand.get(j)];
				list[cand.get(i)]+=list[cand.get(j)];
				list[cand.get(j)]="";
			}
			if( dfs(list, depth+1, lim) )	return true;
			list[cand.get(i)	]=prev[0];
			k=1;
			for(int j=0; j<cand.size(); ++j){
				if(i==j)	continue;
				list[cand.get(j)]=prev[k++];
			}
		}
		
		return false;
		
	}
}

class AOJ2005{
	final Scanner sc = new Scanner(System.in);
	AOJ2005(){
		while(sc.hasNext()){
			int n=sc.nextInt(),m=sc.nextInt(),s=sc.nextInt(),g1=sc.nextInt(),g2=sc.nextInt();
			if(n==0)	break;
			--s; --g1; --g2;
			solve(n,m,s,g1,g2);
		}
	}
	final int INF=Integer.MAX_VALUE/4;
	void solve(int n,int m,int s,int g1,int g2){
		int[][] g=new int[n][n];
		for(int i=0; i<n; ++i)for(int j=0; j<n; ++j)	g[i][j]=INF;
		for(int i=0; i<m; ++i){
			int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
			--a; --b;
			g[a][b]=c;
		}
		
		ArrayList<HashSet<String>> c1=new ArrayList<HashSet<String>>(n);
		for(int i=0; i<n; ++i)	c1.add(new HashSet<String>());
		
		LinkedList<S1> o1=new LinkedList<S1>();
		o1.add(new S1(s,new String()));
		
		while(!o1.isEmpty()){
			S1 now=o1.poll();
			for(int i=0; i<n; ++i){
				if(now.p==i || g[now.p][i]>=INF)	continue;
				String tmp=now.s+i;
				if(!c1.get(i).contains(tmp)){
					if(i!=g1)	o1.add(new S1(i,tmp));
					c1.get(i).add(tmp);
				}
			}
		}
		
		
		
		HashSet<String> cand=new HashSet<String>();
		cand.addAll(c1.get(g1));
		c1=null;
		System.gc();
		
		int ans=INF;
		for(String str:cand){
			
			int[][] gg=new int[n][n];
			for(int i=0; i<n; ++i)for(int j=0; j<n; ++j)gg[i][j]=g[i][j];
			
			int prev=s,cost1=0;
			for(int i=0; i<str.length(); ++i){
				cost1+=gg[prev][str.charAt(i)-'0'];
				gg[prev][str.charAt(i)-'0']=0;
				prev=str.charAt(i)-'0';
			}
			
			PriorityQueue<S2> o2=new PriorityQueue<S2>();
			o2.add(new S2(s,0));
			int[] c2=new int[n];
			for(int i=0; i<n; ++i)c2[i]=INF;
			
			int cost2=0;
			while(!o2.isEmpty()){
				S2 now=o2.poll();
				if(now.p==g2){
//					System.out.println("G2");
					cost2=now.c;
					break;
				}
				for(int i=0; i<n; ++i){
					if(now.p==i || gg[now.p][i]>=INF)	continue;
					int nc=now.c+gg[now.p][i];
					if(c2[i]<=nc)	continue;
					o2.add(new S2(i, nc));
					c2[i]=nc;
					
				}
			}
			
//			System.out.println(cost1+" "+cost2);
			ans=min(ans,cost1+cost2);
			
		}
		
		System.out.println(ans);
		
	}
	class E{
		int d,c;
		E(int d,int c){
			this.d=d;
			this.c=c;
		}
	}
	class S1{
		int p;
		String s;
		S1(int p,String s){
			this.p=p;
			this.s=s;
		}
	}
	class S2 implements Comparable<S2>{
		int p,c;
		S2(int p,int c){
			this.p=p;
			this.c=c;
		}
		@Override public int compareTo(S2 o){
			return this.c-o.c;
		}
	}
}