
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *  No.215
 *  Time : 6h
 *  Result: ok;
 */
public class Main {

	enum Elem{Fire, Ice, Tree,Earth, Water, Start, Goal;
		public static Elem of(int num) {
			return Elem.values()[num-1];
		}
		
		public Elem next() {
			if (this == Start || this == Goal) {
				throw new IllegalStateException("Start or goal cannot call wins methos");
			}
			
			if (this != Water) {
				return Elem.values()[this.ordinal()+1];
			} else {
				return Elem.values()[0];
			}
		}
		
		public Elem prev() {
			if (this == Start || this == Goal) {
				throw new IllegalStateException("Start or goal cannot call wins methos");
			}
			
			if (this != Fire) {
				return Elem.values()[this.ordinal()-1];
			} else {
				return Water;
			}
		}

		private static final Elem[] elements = new Elem[]{Fire, Ice, Tree,Earth, Water};
		public static Elem[] elements() {
			return elements;
		}
	}
	
	private static class Point {
		final int x;
		final int y;
		final int index;
		public Point(int x, int y, int index) {
			this.x = x;
			this.y = y;
			this.index = index;
		}
		public int distance(Point other) {
			return Math.abs(x - other.x) + Math.abs(y-other.y);
		}
		public String toString(){
			return "(" + x + "," + y + ")";
		}
	}
	/** graph (cost of point to point) */
	private static class Graph{
		Point start;
		Point goal;
		Map<Elem, List<Point>> points;
		int size=0;
		
		static final int MAX = 1000*5 + 2;
		static int[][] graph = new int[MAX][MAX]; // point to point cost;
		static boolean[] visited = new boolean[MAX]; // visit node;
		static int[] minCosts = new int[MAX]; // search MinCost;
		
		Graph(Map<Elem, List<Point>> points) {
			size=0;
			for (List<Point> p : points.values()){
				size += p.size();
			}
			this.start = points.get(Elem.Start).get(0);
			this.goal = points.get(Elem.Goal).get(0);
			this.points = points;
			
			for (int i = 0; i < size;i++) {
				Arrays.fill(graph[i], 0, size, 0);
			}
			
			makeBaseGraph();
		}
		
		private void makeBaseGraph() {
			
			for(Elem from : Elem.elements) {
				
				Elem to = from.next();
				
				if (points.containsKey(from) && points.containsKey(to)) {
					for(Point p : points.get(from)) {
						for(Point p2 : points.get(to)) {
							add(p, p2);
						}
					}
				}
			}
		}
		// remove start goal connection;
		public void reset(Elem startElem) {

			// connect startPoint to nextElemnt point
			for(Point p : points.get(startElem.next())) {
				remove(this.start, p);
			}
			// connect final element point to goal
			Elem prevGoal = startElem.prev();
			for(Point p : points.get(prevGoal)) {
				remove(p, this.goal);
			}
		}

		/**
		 * @param startElem
		 * @return
		 */
		public boolean setStartAndGoal(Elem startElem) {

			Arrays.fill(minCosts, 0, size, Integer.MAX_VALUE);
			Arrays.fill(visited,0, size, false);
			// check all elements exits in map and startElemnt.
			boolean all = true;
			for(Elem e : Elem.elements) {
				all = all &&(points.containsKey(e) || startElem == e);
			}
			if (!all) {
				return false;
			}
			
			// connect startPoint to nextElemnt point
			for(Point p : points.get(startElem.next())) {
				add(this.start, p);
			}
			// connect final element point to goal
			Elem prevGoal = startElem.prev();
			for(Point p : points.get(prevGoal)) {
				add(p, this.goal);
			}
			return true;
		}

		private void remove(Point p1, Point p2) {
			graph[p1.index][p2.index] = 0;
		}
		private void add(Point p1, Point p2) {
			int cost = p1.distance(p2);
			graph[p1.index][p2.index] = cost;
		}
		
		/** search dikstra start to goal */
		public int search() {
			
			int target = start.index;
			minCosts[target]= 0;
			int visitCount=0;
			while(visitCount < size) {
				
				visited[target] = true;
				visitCount++;
				
				Set<Integer> near = near(target, visited);
				// update minimum cost of near(next node).
				for(int i : near) {
					int targetCost = minCosts[target];
					if (targetCost + graph[target][i] < minCosts[i]) {
						minCosts[i] = targetCost + graph[target][i];
					}
				}
				
				// next target
				int next = -1;
				int minOfNext = Integer.MAX_VALUE;
				for (int i = 0; i < size; i++) {
					if (!visited[i]) {
						if (minOfNext >= minCosts[i]) {
							minOfNext = minCosts[i];
							next = i;
						}
					}
				}
				target = next;
			}
			
			return minCosts[goal.index];
		}
		
		/** search next point of target, (target is not visited) */
		private Set<Integer> near(int index, boolean[] visited){
			
			Set<Integer> near = new HashSet<Integer>();
			for (int i = 0; i < size; i++){
				int cost = graph[index][i];
				if (cost != 0 && !visited[i]) { // connected node if cost not zero.
					near.add(i);
				}
			}
			return near;
		}
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		while(s.hasNextLine()) {
			String line = s.nextLine();
			String[] xy = line.split(" ");
			int x = Integer.parseInt(xy[0]);
			int y = Integer.parseInt(xy[1]);
			
			if (x == 0 && y == 0) {
				break;
			}
			
			
			Map<Elem, List<Point>> points = readMap(s, x, y);
			//System.out.println(points);
			int minElem = -1;
			int minCost = Integer.MAX_VALUE;
			Graph graph = new Graph(points);
			// test 5 elements and find minim
			for (int i = 1; i <=5; i++){
				Elem start = Elem.of(i);
				
				int cost = Integer.MAX_VALUE;
				if (graph.setStartAndGoal(start)) {
					cost = graph.search();
					graph.reset(start);
				}
				
				if (cost < minCost) {
					minCost = cost;
					minElem = i;
				}
			}
			// output result
			if (minCost == Integer.MAX_VALUE) {
				System.out.println("NA");
			} else {
				System.out.println(minElem + " " + minCost);
			}
		}
		
		s.close();
	}
	

	
	// read Input and extract points.
	private static Map<Elem, List<Point>> readMap(Scanner s, int x, int y) {
		Map<Elem, List<Point>> map = new HashMap<Elem, List<Point>>();
		int index = 0;
		for (int i = 0; i < y; i++) {
			char[] row = s.nextLine().toCharArray();
			for (int k = 0; k < x; k++) {
				char cell = row[k];
				
				if (cell == 'S') {
					List<Point> list = new ArrayList<Point>(1);
					list.add(new Point(k,i, index++));
					map.put(Elem.Start, list);
				} else if (cell == 'G') {
					List<Point> list = new ArrayList<Point>(1);
					list.add(new Point(k,i, index++));
					map.put(Elem.Goal, list);
				
				} else if(cell == '.'){
					// no execute.
				} else {
					Elem elem = Elem.of(Integer.parseInt(cell+""));
					
					if (!map.containsKey(elem)) {
						map.put(elem, new ArrayList<Point>());
					}
					map.get(elem).add(new Point(k,i, index++));
				}
			}
		}
		
		return map;
	}

}