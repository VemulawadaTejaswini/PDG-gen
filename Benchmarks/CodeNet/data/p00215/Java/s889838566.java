
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
 *
 *
 *
 */
public class Main {

	enum Elem{Fire, Ice, Tree,Earth, Water, Start, Goal;
		public static Elem of(int num) {
			return Elem.values()[num-1];
		}
		
		public Elem wins() {
			if (this == Start || this == Goal) {
				throw new IllegalStateException("Start or goal cannot call wins methos");
			}
			
			if (this != Water) {
				return Elem.values()[this.ordinal()+1];
			} else {
				return Elem.values()[0];
			}
		}
		
		public boolean inclued(int have) {
			return (have & (1 << this.ordinal())) != 0;
		}
		private static final Elem[] elements = new Elem[]{Fire, Ice, Tree,Earth, Water};
		public static Elem[] elements() {
			return elements;
		}
		public static int allCaptured = (1 << elements.length)-1;
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
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + x;
			result = prime * result + y;
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Point other = (Point) obj;
			if (x != other.x)
				return false;
			if (y != other.y)
				return false;
			return true;
		}
		public String toString(){
			return "(" + x + "," + y + ")";
		}
	}
	/** graph (cost of point to point) */
	private static class Graph{
		Point start;
		Point goal;
		boolean reachToGaol;
		int[][] graph; // point to point cost;
		boolean[] visited; // visit node;
		int[] minCosts; // search MinCost;
		
		Graph( Map<Elem, List<Point>> points) {
			int size=0;
			for (List<Point> p : points.values()){
				size += p.size();
			}
			this.start = points.get(Elem.Start).get(0);
			this.goal = points.get(Elem.Goal).get(0);
			graph = new int[size][size];
			visited = new boolean[size];
			minCosts = new int[size];
		}
		
		public void reset() {
			for(int[] row : graph) {
				Arrays.fill(row, 0);
			}
			Arrays.fill(minCosts, Integer.MAX_VALUE);
			Arrays.fill(visited, false);
			reachToGaol = false;
		}
		
		public void add(Point p1, Point p2) {
			int cost = p1.distance(p2);
			graph[p1.index][p2.index] = cost;
			graph[p2.index][p1.index] = cost;
		}
		
		/** search dikstra start to goal */
		public int search() {
	
			if (!reachToGaol) {
				return Integer.MAX_VALUE;
			}

			
			int target = start.index;
			minCosts[target]= 0;
			while(!allVisit(visited)) {
				
				visited[target] = true;
				
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
				for (int i = 0; i < visited.length; i++) {
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
		
		private boolean allVisit(boolean[] ar) {
			for (boolean v : ar) {
				if (!v) {
					return false;
				}
			}
			return true;
		}
		
		/** search next point of target, (target is not visited) */
		private Set<Integer> near(int index, boolean[] visited){
			
			Set<Integer> near = new HashSet<Integer>();
			for (int i = 0; i < graph[index].length; i++){
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
		
		while(s.hasNext()) {
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
				graph.reset();
				makeGraph(graph, points, Elem.of(i));
				
				int cost = graph.search();
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
	
	// make point to point graph
	private static Graph makeGraph(Graph graph, Map<Elem, List<Point>> points, Elem startElem) {
		
		Point target = graph.start;
		
		/*
		 * have is binary flag of captured moster elemets.
		 * if we have fire and tree, have is 0b00101,
		 * if we have allm have is 0b11111;
		 * 
		 * if we have fire, flag & 0b00001 = 0b00001(not zero);
		 */
		int have = 1 << startElem.ordinal();
		recurMakeGraph(graph, points,target,  have);
		
		return graph;
	}
	
	// recur make graph
	// find next Point that can win elements 
	private static void recurMakeGraph(Graph g, Map<Elem, List<Point>> points ,Point target, int have){
		if (have == Elem.allCaptured) { //complete
			g.add(target, g.goal);
			g.reachToGaol = true;
			return;
		}
		for (Elem elem : Elem.elements()) {
			if (points.containsKey(elem) 
					&& elem.inclued(have) && !elem.wins().inclued(have)) {
				int newHave = have + (1 << elem.wins().ordinal());
				for(Point p : points.get(elem.wins())) {
					g.add(target, p);
					recurMakeGraph(g, points, p, newHave);
				}
			}
		}
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
					List<Point> list = map.containsKey(elem) ? 
							map.get(elem) : new ArrayList<Point>();
					list.add(new Point(k,i, index++));
					map.put(elem, list);
				}
			}
		}
		
		return map;
	}

}