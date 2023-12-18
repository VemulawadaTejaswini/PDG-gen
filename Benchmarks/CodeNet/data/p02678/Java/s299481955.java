import java.util.*;
import java.io.*;
@SuppressWarnings("unchecked")
class atcoder {
	static HashMap<Integer,Integer> top= new HashMap<>();
	static int priority;
	static int[] dp;
	static int[] topA;
	static int topP = 0;
	static LinkedList<Integer>[] graph;

	public static int solve(int current, int parent){
		if(current == 1)
			return 0;
		if(dp[current] != -1)
			return dp[current];
	//	System.out.println(current);
		int ans = -1;
		for(int child : graph[current]){
			// if(child != 1)
			// 	return Integer.MAX_VALUE;
			if(child != parent){
				int sol = solve(child,current);
				if (sol != -1) {
					ans = Math.max(ans,1+sol);
				}
			}
		}

		return dp[current] = ans;
	}

	public static void top(int current, int parent, int[] visited){
		visited[current] = 1;
		for(int i : graph[current]){
			if(visited[i] != 1)
				top(i,current,visited);
		}
		top.put(current,priority--);
		topA[topP++] = current;
	}

	public static void build(int[][] savedInput,int n){
		graph = new LinkedList[n];
		for(int ii = 0; ii < n; ii++)
			graph[ii] = new LinkedList<Integer>();


		for(int i  = 0; i < savedInput.length; i++){
			int a = savedInput[i][0];
			int b = savedInput[i][1];
			int priorityOfA = top.get(a);
			int priorityOfB = top.get(b);
			if(priorityOfA > priorityOfB){
		      //   System.out.println("build "+a + " " + b);
				graph[a].add(b);
			}
			else {
			//	System.out.println("build "+b + " " + a);
				graph[b].add(a);
			}
		}
				
		
	}


	public static void main(String[] args) throws Exception {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     	 String[] in = br.readLine().trim().split(" ");
		int n = Integer.parseInt(in[0]);
		n = n+1;
		int e = Integer.parseInt(in[1]);
		topA = new int[n];
		graph = new LinkedList[n];
		priority = n;
		for(int i = 0; i < n; i++)
			graph[i] = new LinkedList<Integer>();
		dp= new int[n];
		Arrays.fill(dp,-1);

		int[][] savedInput = new int[e][2];


		for(int i = 0;i<e;i++){
			in = br.readLine().trim().split(" ");
			int a = Integer.parseInt(in[0]);
			int b = Integer.parseInt(in[1]);
			graph[a].add(b);
			graph[b].add(a);

				savedInput[i][0] = a;
			savedInput[i][1] = b;

}


		int[] visited = new int[n];
        top(1,-1,visited);
		//System.out.println( top);
		
		build(savedInput,n);
		for(int i = 1;i < n; i++)
	 		solve(i,-1);
	   for(int i = 2; i < dp.length;i++){
	   	if(dp[i] == -1){
	   		System.out.print("No");
	   		return;
	   	}
	   }
	   System.out.println("Yes");
	    for(int i = 2; i < dp.length;i++){
	  
	    	System.out.println(dp[i]);
	  }	

//	   System.out.println(Arrays.toString(dp));
	}
}