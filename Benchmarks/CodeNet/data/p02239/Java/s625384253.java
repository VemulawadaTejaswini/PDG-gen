import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean[][] connected=new boolean[200][200];
		boolean[] visied=new boolean[200];

		for(int i=0; i<n; i++) {
			//polygon information
			int u=0,k=0,v=0;
			u=sc.nextInt();
			u--;

			k=sc.nextInt();

			for(int j=0; j<k; j++) {
				v=sc.nextInt();	//input polygon data
				v--;
				connected[u][v]=true;		//graph no renketu
			}
		}
		Queue<Integer> q1,q2;
		q1=new LinkedList<Integer>();
		q2=new LinkedList<Integer>();
		boolean[] visited=new boolean[200];
		int[] ans=new int[200];
		for(int i=0; i<n; i++) {
			ans[i]=-1;
		}
		q1.add(0);

		for(int i=0; i<q1.size(); i++) {
			while(q1.size()>0) {
				int p=q1.peek();
				q1.remove();
				if(visited[p]==true) {continue;}
				else {
					visited[p]=true;
					ans[p]=i;
				}

				for(int j=0; j<n; j++) {
					if(connected[p][j]==true) {
						q2.add(j);
					}
				}
			}
			q1=q2;
			q2=new LinkedList<Integer>();
		}

	}
}
