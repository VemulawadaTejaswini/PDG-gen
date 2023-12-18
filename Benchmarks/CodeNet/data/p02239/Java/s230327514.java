import java.util.*;
public class Main {

	static int[] dist,visit;
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		List<List<Integer>> ls=new ArrayList<>();

		int n=in.nextInt();
		dist=new int[n]; visit=new int[n];
		for(int i=0;i<n;i++) {
			ls.add(new ArrayList<>());
			dist[i]=-1;
		}
		for(int i=0;i<n;i++) {
			int u=Integer.parseInt(in.next()),k=Integer.parseInt(in.next());
			for(int j=0;j<k;j++)ls.get(u-1).add(Integer.parseInt(in.next())-1);
		}

		solve(ls);
		for(int i=0;i<n;i++) System.out.println(i+1+" "+dist[i]);
	}
	
	static void solve(List<List<Integer>> ls) {
		Queue<Integer> que=new ArrayDeque<>();
		que.add(0);
		visit[0]=1;
		dist[0]=0;
		while(!que.isEmpty()) {
			int p=que.remove();
			for(int i=0;i<ls.get(p).size();i++) {
				int next=ls.get(p).get(i);
				if(visit[next]==0) {
					visit[next]=1;
					dist[next]=dist[p]+1;
					que.add(next);
				}
			}
		}
	}
}

