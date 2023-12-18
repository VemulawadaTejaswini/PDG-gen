import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	static List<int[]>[] node;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(;;){
			int n = sc.nextInt();
			int m = sc.nextInt();
			node=new ArrayList[n];
			for(int i=0;i<n;i++){
				node[i]=new ArrayList<int[]>();
			}
			if(n+m==0)break;
			for(int i=0;i<n;i++){
				int a = sc.nextInt()-1;
				int b = sc.nextInt()-1;
				int cost = sc.nextInt();
				int time = sc.nextInt();
				node[a].add(new int[]{b,cost,time});
				node[b].add(new int[]{a,cost,time});
			}
			int k = sc.nextInt();
			for(int i=0;i<k;i++){
				int p = sc.nextInt()-1;
				int q = sc.nextInt()-1;
				int r = sc.nextInt()+1;
				System.out.println(min(p,q,r));
			}
		}
	}
	static int min(int p,int q,int r){
		PriorityQueue<int[]>que=new PriorityQueue<int[]>(100,new Comparator<int[]>(){
			@Override
			public int compare(int[] arg0, int[] arg1) {
				return arg0[1]-arg1[1];
			}
		});
		int[] min = new int[node.length];
		Arrays.fill(min, 1<<30);
		min[p]=0;
		que.add(new int[]{p,0});
		while(!que.isEmpty()){
			int s = que.peek()[0];
			int cost=que.poll()[1];
			for(int[] a:node[s]){
				int next=a[0];
				int ncost=cost+a[r];
				if(min[next]>ncost){
					min[next]=ncost;
					que.add(new int[]{next,ncost});
				}
			}
		}
		return min[q];
	}
}