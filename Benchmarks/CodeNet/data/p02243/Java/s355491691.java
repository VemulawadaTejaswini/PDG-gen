import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;


public class Main{

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int edgeCnt = Integer.parseInt(s.nextLine());
		ArrayList[] list = new ArrayList[edgeCnt];
		for(int i=0 ; i<edgeCnt ; i++) {
			list[i] = new ArrayList();
			String[] input = s.nextLine().split(" ");
			for(int j=0 ; j<Integer.parseInt(input[1]) ; j++) {
				list[Integer.parseInt(input[0])].add(new Main().new Edge(Integer.parseInt(input[0]), Integer.parseInt(input[j*2+2]),Integer.parseInt(input[j*2+3])));
			}
		}
		int[] result = daikusutora(list);
		for(int k=0 ; k<result.length ; k++) {
			System.out.println(k + " " + result[k]);
		}
	}

	@SuppressWarnings("unchecked")
	public static int[] daikusutora(ArrayList[] list) {
		int[] result = new int[list.length];
		Arrays.fill(result, Integer.MAX_VALUE);
		boolean[] visited = new boolean[list.length];
		Queue queue = new PriorityQueue();
		queue.offer(new Main().new Edge(0, 0, 0));
		result[0] = 0;
		while(true) {
			if(queue.isEmpty())
				break;

			Edge edge = (Edge) queue.poll();
			visited[edge.endNo] = true;
			if(result[edge.endNo] < edge.weight)
				continue;

				for(int i=0 ; i<list[edge.endNo].size() ; i++) {
					Edge e = (Edge)list[edge.endNo].get(i);


					if(!visited[e.endNo]) {

						if((result[e.endNo] > result[e.startNo] + e.weight)) {
							result[e.endNo] = result[e.startNo] + e.weight;
							queue.offer(e);
						}
					}
				}
		}
		return result;
	}

	class Edge implements Comparable<Edge> {

		int startNo;
		int endNo;
		int weight;

		public Edge(int startNo, int endNo, int weight) {
			this.startNo = startNo;
			this.endNo = endNo;
			this.weight = weight;
		}

		public int compareTo(Edge obj) {
			return this.weight - obj.weight;
		}
	}
}