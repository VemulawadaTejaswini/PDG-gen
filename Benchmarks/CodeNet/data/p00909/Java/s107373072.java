import java.util.*;
import static java.lang.Math.*;

public class Main {
	final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		final long stackSize = 8*1024*1024;
		new Thread(null, new AOJ1330(), "RUN", stackSize).start();
//		new AOJ1330();
	}
	
	class AOJ1330 implements Runnable{
		AOJ1330(){
//			while(sc.hasNext()){
//				N=sc.nextInt();
//				M=sc.nextInt();
//				if((N|M)==0)	break;
//				solve();
//			}
		}
		@Override public void run(){
//			long start = System.currentTimeMillis();
			while(sc.hasNext()){
				N=sc.nextInt();
				M=sc.nextInt();
				if((N|M)==0)	break;
				solve();
			}
//			System.out.println( (System.currentTimeMillis()-start)+"ms");
		}
		
		int N,M;
		
		void solve(){
			UnionFind uf = new UnionFind(N);
			for(int i=0; i<M; ++i){
				if(sc.next().equals("!")){
					int a=sc.nextInt(), b=sc.nextInt(), w=sc.nextInt();
					--a;
					--b;
					uf.unite(a, b, w);
				}else{
					int a=sc.nextInt(), b=sc.nextInt();
					--a;
					--b;
					int ret = uf.getWeight(a, b);
					System.out.println(ret>=uf.INF ? "UNKNOWN" : ret);
				}
			}
		}
		
		// Union-Find Tree
		class UnionFind{
			class Node{
				int par,w;
				Node(int par,int w){
					this.par=par;
					this.w=w;
				}
			}
			
			Node[] node;
			final int INF = Integer.MAX_VALUE/4;
			
			UnionFind(int n){
				node=new Node[n];
				for(int i=0; i<n; ++i)	node[i]=new Node(i,0);
			}
			
			Node find(int x){
				if(node[x].par == x)	return node[x];
				else{
					Node tmp = find(node[x].par);
					node[x].par = tmp.par;
					node[x].w += tmp.w;
					return node[x];
				}
			}
			
			void unite(int x,int y,int w){
				Node tx=find(x);
				Node ty=find(y);
				if(tx.par==ty.par)	return;
				
				node[tx.par].w = w - tx.w;
				node[tx.par].par = y;
			}
			
			int getWeight(int x,int y){
				Node tx = find(x);
				Node ty = find(y);
				return (tx.par==ty.par ? tx.w-ty.w : INF);
			}
			
		}
	}
}