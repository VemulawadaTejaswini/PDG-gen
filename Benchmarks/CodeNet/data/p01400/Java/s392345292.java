import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static class Train implements Comparable<Train>{
		int station;
		int time;
		boolean getted;
		
		public Train(int station, int time, boolean getted) {
			super();
			this.station = station;
			this.time = time;
			this.getted = getted;
		}

		@Override
		public int compareTo(Train arg0) {
			return this.time - arg0.time;
		}
	}
	
	public static final int MAX_EDGE = 5000;
	public static final int MAX_NODE = 500;
	
	public static final int INF = Integer.MAX_VALUE / 2 - 1;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String[][] data = new String[MAX_EDGE][2];
		int[] dist = new int[MAX_EDGE];
		int[] delay  = new int[MAX_EDGE];
		int[][] adj = new int[MAX_NODE][MAX_NODE];
		boolean[][] is_visited = new boolean[MAX_NODE][2];
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		while(true){
			final int n = sc.nextInt();
			final int m = sc.nextInt();
			
			if(n == 0 && m == 0){
				break;
			}
			
			map.clear();
			
			String start = sc.next();
			String inter = sc.next();
			String goal  = sc.next();
			
			map.put(start, 0);
			map.put(inter, 1);
			map.put(goal , 2);
			
			for(int i = 0; i < m; i++){
				data[i][0] = sc.next();
				data[i][1] = sc.next();
				dist[i] = sc.nextInt();
				delay[i] = sc.nextInt();
			}
			
			int count = 3;
			for(int i = 0; i < m; i++){
				for(int j = 0; j < 2; j++){
					if(!map.containsKey(data[i][j])){
						map.put(data[i][j], count);
						count++;
					}
				}
			}
			
			for(int i = 0; i < n; i++){
				for(int j = i + 1; j < n; j++){
					adj[i][j] = adj[j][i] = INF;
				}
				
				
				is_visited[i][0] = false;
				is_visited[i][1] = false;
			}
			
			for(int i = 0; i < m; i++){
				int from = map.get(data[i][0]);
				int to   = map.get(data[i][1]);
				
				adj[from][to] = adj[to][from] = dist[i] / 40 + delay[i];
			}
			
			PriorityQueue<Train> queue = new PriorityQueue<Main.Train>();
			queue.add(new Train(0, 0, false));
			
			boolean getted = false;
			while(!queue.isEmpty()){
				Train train = queue.poll();
				
				if(getted && !train.getted){
					continue;
				}
				
				if(is_visited[train.station][train.getted ? 1 : 0]){
					continue;
				}else{
					is_visited[train.station][train.getted ? 1 : 0] = true;
				}
				
				if(train.station == 2 && train.getted){
					System.out.println(train.time);
					break;
				}
				
				if(train.station == 1 && !train.getted){
					train.getted = true;
					getted = true;
				}
				
				for(int to = 0; to < n; to++){
					if(adj[train.station][to] < INF && !is_visited[to][train.getted ? 1 : 0]){
						queue.add(new Train(to, train.time + adj[train.station][to], train.getted));
					}
				}
				
			}
			
			
		}
		
	}

}