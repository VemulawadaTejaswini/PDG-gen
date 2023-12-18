import java.util.*;
import java.io.*;
public class Main{
	public static int[] rooms;
	public static HashSet<Integer>[] roomgraph;
	public static boolean[] visited;
	public static int[] steps;
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
	String[] lo = reader.readLine().split(" ");
	int N = Integer.parseInt(lo[0]);
	int M = Integer.parseInt(lo[1]);
	roomgraph = new HashSet[N+1];
	visited = new boolean[N+1];
	steps = new int[N+1];
	for(int i = 1;i<=N;i++){
		roomgraph[i] = new HashSet<Integer>();
		if(i!=1)steps[i] = Integer.MAX_VALUE;
	}
	rooms = new int[N+1];
	for(int i= 0;i<M;i++){
		String[] po = reader.readLine().split(" ");
		int u = Integer.parseInt(po[0]);
		int v = Integer.parseInt(po[1]);
		roomgraph[u].add(v);
		roomgraph[v].add(u);	
	}
	Queue<Integer> q = new LinkedList<Integer>();
	q.add(1);
	rooms[1] = 54;
	while(!q.isEmpty()){
		int root = q.poll();
		for(int p:roomgraph[root]){
		if(rooms[p]==0){
			rooms[p] = root;
			q.add(p);		
		}

		}
	}
	for(int i=2;i<=N;i++){
		if(rooms[i]<=0){
			System.out.println("No");
			return;
		}
		else writer.write(rooms[i]+"\n");
	}
	System.out.println("Yes");
	writer.flush();
	}
}
