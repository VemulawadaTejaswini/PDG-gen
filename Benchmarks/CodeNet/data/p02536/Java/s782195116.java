import java.util.*;
import java.io.*;

public class Main{
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    static void addEdge(int v, int w, LinkedList<Integer> adj[]) 
    { 
        adj[v].add(w);
    } 

    
    static void DFS(int v, boolean visited[], LinkedList<Integer> adj[]){
        visited[v] = true;
        Iterator<Integer> i = adj[v].listIterator(); 
        while(i.hasNext()){ 
            int n = i.next(); 
            if (!visited[n]) 
                DFS(n, visited, adj); 
        } 
    } 
    
    static int notConnected(int v, boolean visited[]){
        int count = 0;
        for (int i = 0; i < v; ++i){
            if (!visited[i]){
                count++;
            }
        }  
        return count;
    }

	public static void main (String[] args) throws IOException{
        String nm[] = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        LinkedList<Integer> adj[] = new LinkedList[n]; 
        boolean visited[] = new boolean[n];
        for (int i=0; i<n; i++){
            adj[i] = new LinkedList<Integer>(); 
        }

        for(int i=0;i<m;i++){
            String ip[] = br.readLine().split(" ");
            addEdge(Integer.parseInt(ip[0]), Integer.parseInt(ip[1]), adj); 
        }
        DFS(1, visited, adj);
        bw.write(notConnected(n, visited) + "\n");
        bw.flush();
    }    
}
