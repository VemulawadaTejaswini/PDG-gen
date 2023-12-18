import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] graph = new int[n][n];
		int[][] arr = new int[n][1];
		Queue<Integer> que = new LinkedList<Integer>();
		
		for(int i=1;i<=n;i++){
			int u = sc.nextInt()-1;
			int k = sc.nextInt();
			for(int j=1;j<=k;j++){
				int index = sc.nextInt();
				graph[u][index-1]=1;
			}
		}
		
		que.offer(1);
		arr[1-1][0] = 0;
		int index=1;
		while(que.size()>0){
			int num = que.poll();
			boolean val = false;
			for(int i=0;i<n;i++){
				if(graph[num-1][i]==1 && arr[i][0]==0){
					que.offer(i+1);
					arr[i][0] = index;
					val=true;
				}
			}
			if(val)	
				index++;
		}
		
		for(int i=0;i<n;i++){
			System.out.println((i+1)+" "+arr[i][0]);
		}
	}
}
