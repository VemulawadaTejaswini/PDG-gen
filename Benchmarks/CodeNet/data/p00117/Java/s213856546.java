import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	static int n,m,s,g,money,pillar;
	static int[][] edge;
	static int[][] min;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		n=cin.nextInt();
		m=cin.nextInt();
		edge=new int[n+1][n+1];
		min=new int[n+1][2];
		for(int i=0;i<=n;i++){
			min[i][0]=min[i][1]=1<<30;
		}
		for(int i=0;i<=n;i++){
			Arrays.fill(edge[i], 1<<30);
		}
		for(int i=1;i<=m;i++){
			String[] s = cin.next().split(",");
			
			int a=Integer.parseInt(s[0]);
			int b=Integer.parseInt(s[1]);
			int c=Integer.parseInt(s[2]);
			int d=Integer.parseInt(s[3]);
			edge[a][b]=c;
			edge[b][a]=d;
		}
		String[] ss = cin.next().split(",");
		s=Integer.parseInt(ss[0]);
		g=Integer.parseInt(ss[1]);
		money=Integer.parseInt(ss[2])-Integer.parseInt(ss[3]);
		PriorityQueue<int[]> q = new PriorityQueue<int[]>(100,new Comparator<int[]>(){
			public int compare(int[] a,int [] b){
				return a[1]-b[1];
			}
		});
		q.add(new int[]{s,0});
		min[s][0]=0;
		while(!q.isEmpty()){
			int[] p = q.poll();
			int now=p[0];
			int cost=p[1];
			for(int i=1;i<=n;i++){
				if(edge[now][i]!=1<<30){
					if(min[i][0]>cost+edge[now][i]){
						min[i][0]=cost+edge[now][i];
						q.add(new int[]{i,min[i][0]});
					}
				}
			}
		}
		
		q.add(new int[]{g,0});
		min[g][1]=0;
		while(!q.isEmpty()){
			int[] p = q.poll();
			int now=p[0];
			int cost=p[1];
//			System.out.println(now+" "+cost);
			for(int i=1;i<=n;i++){
				if(edge[now][i]!=1<<30){
					if(min[i][1]>cost+edge[now][i]){
						min[i][1]=cost+edge[now][i];
						q.add(new int[]{i,min[i][1]});
					}
				}
			}
		}
		System.out.println(money-min[g][0]-min[s][1]);
	}
}