
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		ArrayList<Integer>[] list=new ArrayList[n+1];
		for(int i=0;i<n+1;i++){
			list[i]=new ArrayList();
		}
		
		for(int i=0;i<m;i++){
			int a=sc.nextInt()-1;
			int b=sc.nextInt()-1;
			list[a].add(b);
			list[b].add(a);
		}
		

		int[] dist=new int[n];
		int[] ans=new int[n];
		
		Arrays.fill(dist,-1);
		
		Deque<Integer> q = new ArrayDeque<>();
		q.add(0);
		dist[0]=0;
		
		while(!q.isEmpty()){
			int i=q.poll();
			for (int j = 0; j < list[i].size(); j++) {
                int v = list[i].get(j);
                if(dist[v]<0){
                	dist[v]=dist[i]+1;
                	ans[v]=i;
                	q.add(v);
        		}
			}
		}
		
		System.out.println("Yes");
		
		
		for(int i=1;i<n;i++){
			System.out.println(ans[i]+1);
		}
	}
}