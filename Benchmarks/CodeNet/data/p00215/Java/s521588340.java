

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

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
	
	private static class Point implements Comparable<Point> {
		final int x;
		final int y;
		final Elem elem;
		int minCost;
		boolean visited;
		boolean enque;
		
		public Point(int x, int y, Elem e) {
			this.x = x;
			this.y = y;
			this.elem = e;
			
			minCost = Integer.MAX_VALUE;
		}
		public int distance(Point other) {
			return Math.abs(x - other.x) + Math.abs(y-other.y);
		}
		
		@Override
		public int compareTo(Point o) {
			// TODO Auto-generated method stub
			return minCost - o.minCost;
		}
		
	}
	/** graph (cost of point to point) */
	private static class Graph{
		Point start;
		Point goal;
		Map<Elem, List<Point>> pointMap;
		
		
		Graph(Map<Elem, List<Point>> pointMap) {
			
			this.start = pointMap.get(Elem.Start).get(0);
			this.goal = pointMap.get(Elem.Goal).get(0);
			this.pointMap = pointMap;
		}
		

		/**
		 * @param startElem
		 * @return
		 */
		Elem startElem;
		public boolean setStart(Elem startElem) {
			this.startElem = startElem;
			// check all elements exits in map and startElemnt.
			boolean all = true;
			for(Elem e : Elem.elements) {
				all = all &&(pointMap.containsKey(e) || startElem == e);
			}
			if (!all) {
				return false;
			}
			
			return true;
		}

		
		/** search dikstra start to goal */
		public int search() {
			
			for(List<Point> ps : pointMap.values()){
				for(Point p : ps) {
					p.minCost = Integer.MAX_VALUE;
					p.enque = false;
					p.visited = false;
				}
			}
			
			PriorityQueue<Point> que = new PriorityQueue<Point>();
			start.minCost = 0;
			start.enque = true;
			que.add(start);
			
			while(!que.isEmpty()) {
				
				Point target = que.poll();
				target.visited = true;
				
				List<Point> nexts = nexts(target);
				// update minimum cost of next nodes.
				for(Point n : nexts) {
					if (!n.visited && !n.enque) {
						int targetCost = target.minCost;
						int costOfTargetToNext = target.distance(n);
						if (targetCost + costOfTargetToNext < n.minCost) {
							n.minCost = targetCost + costOfTargetToNext;
						}
						n.enque = true;
						que.add(n);
					}
				}
			}
			
			return goal.minCost;
		}
		
		private List<Point> nexts(Point p) {
			if (p.elem == Elem.Start) {
				return pointMap.get(startElem.next());
			}
			if(p.elem == Elem.Goal) {
				return Collections.emptyList();
			}
			if (p.elem == startElem.prev()) {
				return Arrays.asList(goal);
			}
			return pointMap.get(p.elem.next());
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
			
			
			Map<Elem, List<Point>> pointMap = readMap(s, x, y);
			//System.out.println(points);
			int minElem = -1;
			int minCost = Integer.MAX_VALUE;
			Graph graph = new Graph(pointMap);
			// test 5 elements and find minim
			for (int i = 1; i <=5; i++){
				Elem start = Elem.of(i);
				
				int cost = Integer.MAX_VALUE;
				if (graph.setStart(start)) {
					cost = graph.search();
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
		for (int i = 0; i < y; i++) {
			char[] row = s.nextLine().toCharArray();
			for (int k = 0; k < x; k++) {
				char cell = row[k];
				
				if (cell == 'S') {
					List<Point> list = new ArrayList<Point>(1);
					list.add(new Point(k,i,  Elem.Start));
					map.put(Elem.Start, list);
				} else if (cell == 'G') {
					List<Point> list = new ArrayList<Point>(1);
					list.add(new Point(k,i,  Elem.Goal));
					map.put(Elem.Goal, list);
				
				} else if(cell == '.'){
					// no execute.
				} else {
					Elem elem = Elem.of(Integer.parseInt(cell+""));
					
					if (!map.containsKey(elem)) {
						map.put(elem, new ArrayList<Point>());
					}
					map.get(elem).add(new Point(k,i, elem));
				}
			}
		}
		
		return map;
	}

}