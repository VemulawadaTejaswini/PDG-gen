import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main{
	static edge[][] V=new edge[30][30];
	static class edge{
		int v,c;
		edge(int v,int c){//v=行き先, c=距離
			this.v=v;
			this.c=c;
		}
	}
	static class node implements Comparable<node>{
		double cc;
		int v,st;
		node(double cc,int v,int st){//cc=所要時間, v=現在地, st＝使ったチケット
			this.cc=cc;
			this.v=v;
			this.st=st;
		}
		public int compareTo(node s){
			if(this.cc>s.cc)return 1;
			else if(this.cc<s.cc)return -1;
			else return 0;
		}
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int n=sc.nextInt();//チケット枚数
			int m = sc.nextInt();//都市数
			int p = sc.nextInt();//道路数
			int a = sc.nextInt()-1;//出発地
			int b = sc.nextInt()-1;//目的地
			if(n==0)break;
			int[] ti=new int[n];
			int[] Vs=new int[m];
			for(int i=0;i<n;i++) {
				ti[i]=sc.nextInt();
			}//チケットごとの馬数

			Arrays.fill(Vs,0);

			for(int i=0;i<p;i++){
				int x=sc.nextInt()-1;
				int y=sc.nextInt()-1;
				int z=sc.nextInt();//xy間距離
				V[x][Vs[x]++]=new edge(y,z);
				V[y][Vs[y]++]=new edge(x,z);
			}
			Queue<node> q=new PriorityQueue<node>();
			q.add(new node(0,a,0)); //cc=所要時間, v=現在地, st＝使ったチケット

			double[][] vis=new double[m][1<<n];
			boolean[][] fix=new boolean[m][1<<n];
			for(int i=0;i<m;i++){
				Arrays.fill(vis[i],1<<28);
				Arrays.fill(fix[i],false);
			}

			double ans=-1;

			while(! q.isEmpty()){
				node cn=q.poll();

				if(fix[cn.v][cn.st])continue;
				fix[cn.v][cn.st]=true;
				if(cn.v==b){//目的地のとき
					ans=cn.cc;//所要時間
					break;
				}

				for(int i=0;i<n;i++){//n:チケット枚数
					if(((cn.st>>i)&1)==1)continue;
					for(int j=0;j<Vs[cn.v];j++){
						int nv=V[cn.v][j].v;//現在地
						int tc=V[cn.v][j].c;//距離
						int nst=cn.st|(1<<i);//使ったチケット
						double nc=cn.cc+1.0*tc/ti[i];//今までの時間＋今回かかった時間
						if(vis[nv][nst]<=nc)continue;
						vis[nv][nst]=nc;//小さいとき
						q.add(new node(nc,nv,nst));
					}
				}
			}
			if(ans<0)System.out.println("Impossible");
			else System.out.println(ans);
		}
	}
}

