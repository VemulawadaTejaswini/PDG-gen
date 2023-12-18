import java.util.*;
import java.io.*;
@SuppressWarnings("unchecked")
class Main {
	static LinkedList<Integer>[] graph;

	public static void solve(int n){
		int[] distance = new int[n];
		int[] visited = new int[n];
		int[] marks = new int[distance.length];
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		while(!q.isEmpty()){
			int poll = q.poll();
			for(int child : graph[poll]){
				if(visited[child] == 0){
					distance[child] = distance[poll]+1;
					marks[child] = poll;
					visited[child] = 1;
					q.add(child);
				}
			}
		}		

		//System.out.print(Arrays.toString(distance));
	 System.out.println("Yes");
    for(int i = 2; i < marks.length; i++){
      System.out.println(marks[i]);
    }

	}


	public static void main(String[] args) throws Exception {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     	 String[] in = br.readLine().trim().split(" ");
		int n = Integer.parseInt(in[0]);
		n = n+1;
		int e = Integer.parseInt(in[1]);
		graph = new LinkedList[n];
		for(int i = 0; i < n; i++)
			graph[i] = new LinkedList<Integer>();



		for(int i = 0;i<e;i++){
			in = br.readLine().trim().split(" ");
			int a = Integer.parseInt(in[0]);
			int b = Integer.parseInt(in[1]);
			graph[a].add(b);
			graph[b].add(a);


}
          solve( n);


   

	}
}