import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	static int n;//頂点数
	static boolean[][] side;//辺があるかどうか
	static int[] visit;//訪問済みかどうか
	static int[] d;
	static Queue <Integer> q;
	static int dis=0;
	static void bfs() {
		while(! q.isEmpty()) {
			int x=q.remove();
			dis=d[x]+1;
			for(int i=1; i<=n; i++) {
				if(visit[i]!=1 && side[x][i]) {
					visit[i]=1;
					d[i]=dis;
					q.add(i);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			n=sc.nextInt();
			side=new boolean[n+1][n+1];
			d=new int[n+1];
			visit=new int[n+1];
			q=new LinkedList<>();
			for(int i=0; i<n; i++) {
				int u=sc.nextInt();
				int k=sc.nextInt();
				for(int j=0; j<k; j++) {
					int v=sc.nextInt();
					side[u][v]=true;
				}
			}
			visit[1]=1;
			q.add(1);
			bfs();
			for(int i=2; i<=n; i++) {
				if(d[i]==0) {
					d[i]=-1;
				}
			}
			for(int i=1; i<=n; i++) {
				System.out.printf("%d %d\n", i, d[i]);
			}

		}
	}
}
