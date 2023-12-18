import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	
	public static class Walk {
		int bill;
		int pos;
		int time;
		
		public Walk(int bill, int pos, int time) {
			super();
			this.bill = bill;
			this.pos = pos;
			this.time = time;
		}
	}
	
	public static int BFS(int start, final int n, int[][] bill){
		boolean[][] visited = new boolean[2][n];
		LinkedList<Walk> queue = new LinkedList<Walk>();
		queue.add(new Walk(start, 0, 0));
		
		while(!queue.isEmpty()){
			Walk walk = queue.poll();
			
			if(visited[walk.bill][walk.pos]){
				continue;
			}else{
				visited[walk.bill][walk.pos] = true;
			}
			
			//System.out.println(walk.bill + " " + walk.pos + " " + walk.time);
			
			if(bill[walk.bill][walk.pos] == 2){
				queue.addFirst(new Walk(walk.bill, walk.pos - 1, walk.time));
				continue;
			}else if(bill[walk.bill][walk.pos] == 1 && (walk.pos != n - 1 && bill[walk.bill][walk.pos + 1] != 1)){
				queue.addFirst(new Walk(walk.bill, walk.pos + 1, walk.time));
				continue;
			}
			
			if(walk.pos == n - 1){
				return walk.time;
			}
			
			for(int next = 0; next <= 2; next++){
				if(walk.pos + next >= n){
					break;
				}else if(!visited[1 - walk.bill][walk.pos + next]){
					queue.addLast(new Walk(1 - walk.bill, walk.pos + next, walk.time + 1));
				}
			}
		}
		
		return Integer.MAX_VALUE;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			int[][] bill = new int[2][n];
			
			for(int i = 0; i < 2; i++){
				for(int j = 0; j < n; j++){
					bill[i][j] = sc.nextInt();
				}
			}
			
			int ret = Math.min(BFS(0, n, bill), BFS(1, n, bill));
			
			System.out.println(ret == Integer.MAX_VALUE ? "NA" : (ret + ""));
		}
	}

}