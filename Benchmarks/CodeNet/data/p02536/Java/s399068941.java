import java.io.*;
import java.util.*;

class Main{

	static void dfs(int src,Map<Integer,LinkedList<Integer>> map,boolean vis[]){
		if(vis[src]) return;

		vis[src] = true;

		for(int i : map.get(src)){
			dfs(i,map,vis);
		}
	}

    public static void main(String args[])throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String s[] = br.readLine().split(" ");

    int n = Integer.parseInt(s[0]);
    int m = Integer.parseInt(s[1]);

    Map<Integer,LinkedList<Integer>> map = new HashMap<>();

    for(int i=1;i<=n;i++) map.put(i,new LinkedList<>());

    while(m-->0){
    	s = br.readLine().split(" ");
    	
    	int u = Integer.parseInt(s[0]);
    	int v = Integer.parseInt(s[1]); 

    	map.get(u).add(v);
    	map.get(v).add(u);
    }

    boolean vis[] = new boolean[n+1];

    int count=-1;

    for(int i=1;i<=n;i++){
    	if(vis[i]) continue;
    	dfs(i,map,vis);
    	count++;
    }


    System.out.println(count);
  }
}