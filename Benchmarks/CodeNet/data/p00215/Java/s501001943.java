import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *  No.215
 *  Time : 6h
 *  Result: ok;
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
		
		public static Set<Elem> wins(Set<Elem> have){
			Set<Elem> res = new HashSet<Elem>();
			for(Elem e : have) {
				Elem win = e.wins();
				if (!have.contains(win)) {
					res.add(win);
				}
			}
			return res;
		}
	}
	
	private static class Point {
		final int x;
		final int y;
		Elem elem;
		int index;
		public Point(int x, int y, Elem elem) {
			this.x = x;
			this.y = y;
			this.elem = elem;
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
			return "(" + x + "," + y + "," + elem + ")" + index;
		}
	}
	/** graph (cost of point to point) */
	private static class Graph{
		Point start;
		Point goal;
		boolean reachToGaol;
		int[][] graph; // point to point cost;
		
		Graph(Collection<Point> points) {
			int i = 0;
			for (Point p : points) {
				p.index = i++;
				if (p.elem == Elem.Start) {
					this.start = p;
				}
				if (p.elem == Elem.Goal) {
					this.goal = p;
				}
			}
			graph = new int[points.size()][points.size()];
		}
		
		public void reset() {
			graph = new int[graph.length][graph.length];
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

			boolean[] visited = new boolean[graph.length];
			int[] minCosts = new int[graph.length];
			Arrays.fill(minCosts, Integer.MAX_VALUE);
			
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
			
			
			Set<Point> points = readMap(s, x, y);
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
	private static Graph makeGraph(Graph graph, Set<Point> points, Elem startElem) {
		
		graph.start.elem = startElem;
		
		Point target = graph.start;
		Set<Elem> have = new HashSet<Elem>();
		have.add(target.elem);
		
		recurMakeGraph(graph, points,target,  have);
		
		return graph;
	}
	
	// recur make graph
	// find next Point that can win elements 
	private static void recurMakeGraph(Graph g,  Set<Point> points ,Point target, Set<Elem> have){
		if (have.size() == Elem.values().length -2) { //compleate
			g.add(target, g.goal);
			g.reachToGaol = true;
			return;
		}
		for (Point p : nextPoint(points, have)) {
			g.add(target, p);
			Set<Elem> newHave = new HashSet<Elem>(have);
			newHave.add(p.elem);
			recurMakeGraph(g, points, p, newHave);
		}
	}
	
	// find next points
	private static Set<Point> nextPoint(Set<Point> points, Set<Elem> have) {
		Set<Point> next = new HashSet<Point>();
		Set<Elem> nexeElems = Elem.wins(have);
		for (Point p : points) {
			if (nexeElems.contains(p.elem)) {
				next.add(p);
			}
		}
		return next;
		
	}
	
	// read Input and xtract points.
	private static Set<Point> readMap(Scanner s, int x, int y) {
		Set<Point> points = new HashSet<Point>();
		
		for (int i = 0; i < y; i++) {
			char[] row = s.nextLine().toCharArray();
			for (int k = 0; k < x; k++) {
				char cell = row[k];
				
				if (cell == 'S') {
					points.add(new Point(k, i, Elem.Start));
				} else if (cell == 'G') {
					points.add(new Point(k, i, Elem.Goal));
				} else if(cell == '.'){
					// no execute.
				} else {
					points.add(new Point(k, i, Elem.of(Integer.parseInt(cell+""))));
				}
			}
		}
		
		return points;
		
	}

}