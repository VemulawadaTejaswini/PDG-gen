public class graph{
	public static void main(String[] args) throws Exception{
		Scanner s = new Scanner(System.in);
		int V = s.nextInt();
		int E = s.nextInt();
		int src = s.nextInt();
		
		HashMap<Integer, List<int[]>> graph = new HashMap<>(V);
		for(int i = 0; i < V; ++i){
			graph.put(i, new LinkedList<int[]>());
		}
		
		for(int i = 0; i < E; ++i){
			int x = s.nextInt();
			int y = s.nextInt();
			int weight = s.nextInt();
			
			graph.get(x).add(new int[] {y, weight});
		}
		
		int[] dist = new int[V];
		Arrays.fill(dist, Integer.MAX_VALUE);
		
		PriorityQueue<int[]> queue = new PriorityQueue<>();
		queue.offer(new int[]{src, 0});
		dist[src] = 0;
		
		while(!queue.isEmpty()){
			int[] vertex = queue.poll();
			
			for(int[] adj : graph.get(vertex[0])){
				if(dist[adj[0]] > dist[vertex[0]] + adj[1]){
					dist[adj[0]] = dist[vertex[0]] + adj[1];
					queue.offer(adj);
				}
			}
		}
		
		for(int i = 0; i < V; ++i){
			System.out.println(dist[i] == Integer.MAX_VALUE ? "INF" : dist[i]);
		}
	}
}