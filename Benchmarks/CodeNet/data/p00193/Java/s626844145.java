import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		for(int m,n,x,a[][];(n=s.nextInt())>0;){
			m=s.nextInt();
			x=s.nextInt();
			a=new int[n][m];
			Deque<int[]>q=new ArrayDeque<int[]>();
			for(int i=0;i<x;++i){
				int v=s.nextInt()-1,u=s.nextInt()-1;
				a[u][v]=1;
				q.add(new int[]{u,v,1});
			}
			int[][]dm={{-1,-1,-1,0,0,1},{-1,0,0,1,1,1}};
			int[][]dn={{-1,0,1,-1,1,0},{0,-1,1,-1,0,1}};
			while(!q.isEmpty()){
				int[]t=q.poll();
				for(int i=0;i<6;++i){
					int u=t[0]+dn[t[0]%2][i],v=t[1]+dm[t[0]%2][i];
					if(0<=u&&u<n&&0<=v&&v<m&&a[u][v]<1){
						q.add(new int[]{u,v,a[u][v]=t[2]+1});
					}
				}
			}
			int r=0;
			for(x=s.nextInt();x-->0;){
				q.add(new int[]{s.nextInt()-1,s.nextInt()-1,1});
				int c=0;
				while(!q.isEmpty()){
					int[]t=q.poll();
					if(a[t[1]][t[0]]>t[2]){
						++c;
						for(int i=0;i<6;++i){
							int u=t[0]+dm[t[1]%2][i],v=t[1]+dn[t[1]%2][i];
							if(0<=u&&u<n&&0<=v&&v<m){
								q.add(new int[]{u,v,t[2]+1});
							}
						}
					}
				}
				r=r>c?r:c;
			}
			System.out.println(r);
		}
	}
}