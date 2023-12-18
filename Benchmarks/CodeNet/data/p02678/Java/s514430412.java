import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().trim().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		int[] dist = new int[n+1];
		Map<Integer, List<Integer>> h = new HashMap<>();
		for(int i = 0; i < m; i++){
		    String[] str = br.readLine().trim().split(" ");
		    int u = Integer.parseInt(str[0]);
		    int v = Integer.parseInt(str[1]);
		    if(h.containsKey(u)){
		        h.get(u).add(v);
		    }
		    else{
		        List<Integer> l = new ArrayList<>();
		        l.add(v);
		        h.put(u, l);
		    }
		    if(h.containsKey(v)){
		        h.get(v).add(u);
		    }
		    else{
		        List<Integer> l = new ArrayList<>();
		        l.add(u);
		        h.put(v, l);
		    }
		}
		boolean[] visited = new boolean[n+1];
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        visited[1] = true;
        while(!q.isEmpty()){
            int parent = q.poll();
            for(int i : h.get(parent)){
                if(visited[i] == false){
                    q.add(i);
                    visited[i] = true;
                    dist[i] = parent;
                }
            }
        }
        boolean ans = false;
        for(int i = 2; i <= n; i++){
            if(dist[i] == 0){
                System.out.println("No");
                ans = true;
            }
        }
        if(ans != true){
            System.out.println("Yes");
            for(int i = 2; i <= n; i++){
                System.out.println(dist[i]);
            }
        }
	}
}

