import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception{
		int num = 998244353;

		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
 		
	 	StringTokenizer st = new StringTokenizer(bf.readLine());
	 	int n = Integer.parseInt(st.nextToken());
	 	int m = Integer.parseInt(st.nextToken());
	 	Map<Integer, Set<Integer>> graph = new HashMap<Integer, Set<Integer>>(); 	
	 	for(int j= 1;j<=n;j++){
	 		graph.put(j,  new HashSet<Integer>());
	 	}
	 	for(int j =0 ;j<m;j++){
	 		StringTokenizer st1 = new StringTokenizer(bf.readLine());
	 		int v1 = Integer.parseInt(st1.nextToken());
	 		int v2 = Integer.parseInt(st1.nextToken());
	 		graph.get(v1).add(v2);
	 		graph.get(v2).add(v1);
	 	}
	 	int max = 0;
	 	Set<Integer> seen = new HashSet<Integer>();
	 	for(int j = 1;j<=n;j++){
	 		
	 		if (!seen.contains(j)){
	 			
	 			Stack<Integer> dfs = new Stack<Integer>();
	 			dfs.add(j);
	 			Set<Integer> tempseen = new HashSet<Integer>();
	 			while(!dfs.isEmpty()){
	 				int vertex = dfs.pop();
	 				for(int child : graph.get(vertex)){
	 					if (!tempseen.contains(child))
	 						dfs.add(child);
	 				}
	 				tempseen.add(vertex);
	 				seen.add(vertex);
	 			}
	 			max = Math.max(max, tempseen.size());
	 		}
	 		
	 	}
	 	
	 	
 		out.println(max);
	 		
 		out.close();
 		
 		
 		
 	}
}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	


