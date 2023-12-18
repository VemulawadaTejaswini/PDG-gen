import java.awt.geom.*;
import java.util.*;

public class Main {

	int INF = 1 << 24;
	final double EPS = 1.0e-08;
	int n, s1, s2;
	Point2D s1p, s2p;
	Point2D [] toy;
	HashSet<Integer> ylist;

	class Edge{
		int from, to;
		double cost;
		public Edge(int from, int to, double cost) {
			this.from = from;
			this.to = to;
			this.cost = cost;
		}
		@Override
		public String toString() {
			return "Edge [from=" + from + ", to=" + to + ", cost=" + cost + "]";
		}

	}

	class C implements Comparable<C>{
		int ind;
		Point2D p;
		public C(int ind, Point2D p) {
			this.ind = ind;
			this.p = p;
		}
		@Override
		public int compareTo(C o) {
			if(this.p.getX() < o.p.getX()) return -1;
			else if(this.p.getX() > o.p.getX()) return 1;
			else if(this.p.getY() < o.p.getY()) return -1;
			else if(this.p.getY() > o.p.getY()) return 1;
			else return 0;
		}
	}
	Comparator< Point2D > com = new Comparator< Point2D >() {
		public int compare(Point2D o1, Point2D o2) {
			if(o1.getX() < o2.getX()) return -1;
			else if(o1.getX() > o2.getX()) return 1;
			else if(o1.getY() < o2.getY()) return -1;
			else if(o1.getY() > o2.getY()) return 1;
			else return 0;
		}
	};

	class State implements Comparable<State>{
		int now1, now2;
		double cost;
		public State(int now1, int now2, double cost) {
			super();
			this.now1 = now1;
			this.now2 = now2;
			this.cost = cost;
		}
		@Override
		public int compareTo(State o) {
			if(this.cost < o.cost ) return -1;
			if(this.cost > o.cost)   return 1;
			return 0;
		}
		@Override
		public String toString() {
			return "State [now1=" + now1 + ", now2=" + now2 + ", cost=" + cost
					+ "]";
		}


	}

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			n = sc.nextInt();
			if(n == 0) break;
			Point2D [] plist = new Point2D[n];
			ylist = new HashSet<Integer>();
			for(int i = 0 ; i < n; i ++){
				int x = sc.nextInt();
				int y = sc.nextInt();
				ylist.add(y);
				plist[i] = new Point2D.Double(x,y);
			}
			s1p = plist[0];
			s2p = plist[n-1];

			ArrayList<Line2D> llist = new ArrayList<Line2D>();
			for(int i = 1;i < n; i++){
				Line2D l = new Line2D.Double(plist[i-1], plist[i]);
				llist.add(l);
			}

			ArrayList<ArrayList<Edge>> pass = segmentArrangement(llist);
			double ans = solve(pass);
			System.out.printf("%f\n",ans);
		}

	}

	private double solve(ArrayList<ArrayList<Edge>> pass) {
		double ans = INF;
		int passsize = pass.size();
		PriorityQueue<State> open = new PriorityQueue<State>();
		open.add(new State(s1, s2, 0.0));
		boolean[][] close2 = new boolean[passsize][passsize];
		close2[s1][s2] = true;
		while(! open.isEmpty()){
			State now = open.poll();
			if(now.now1 == now.now2){
				ans = Math.min(ans, now.cost);
				break;
				//continue;
			}

			for(int i = 0 ; i < pass.get(now.now1).size(); i++){
				for(int j = 0; j < pass.get(now.now2).size(); j++){
					int next1 = pass.get(now.now1).get(i).to;
					int next2 = pass.get(now.now2).get(j).to;
					if(next1 == now.now1 && next2 == now.now2)continue;
					if(Math.abs(toy[next1].getY() - toy[next2].getY()) < EPS){
						double value = pass.get(now.now1).get(i).cost+ pass.get(now.now2).get(j).cost;
						double nextcost = now.cost + value;
						if(close2[next1][next2]) continue;
						close2[next1][next2] = true;
						open.add(new State(next1, next2, nextcost));
					}
				}
			}
		}
		return ans;
	}

	private ArrayList<ArrayList<Edge>> segmentArrangement(ArrayList<Line2D> arg) {
		Line2D [] line = arg.toArray(new Line2D[arg.size()]);
		//交点リストを求める
		ArrayList<Point2D> intersectionlist = new ArrayList<Point2D>();
		for(int i = 0; i < line.length; i++){
			intersectionlist.add(line[i].getP1());
			intersectionlist.add(line[i].getP2());
			for(int j = i + 1; j < line.length; j++){
				if(line[i].intersectsLine(line[j])){
					Point2D p = intersectPtSS(line[i], line[j]);
					if(p == null) continue;
					intersectionlist.add(p);
				}
			}
		}

		for(int i : ylist){
			for(int j = 0; j < line.length; j++){
				Point2D p1 = line[j].getP1();
				Point2D p2 = line[j].getP2();
				if((p1.getY() <= i && i <= p2.getY()) || (p2.getY() <= i && i <= p1.getY())){
					double x = line[j].getX1() + (line[j].getX2() - line[j].getX1()) * ((double) i - line[j].getY1())  / (line[j].getY2() - line[j].getY1());
					intersectionlist.add(new Point2D.Double(x, i));
				}
			}
		}

		//sortする。重複削除
		Collections.sort(intersectionlist, com);
		for(int i = 1; i < intersectionlist.size(); i++){
			if(issame(intersectionlist.get(i-1), intersectionlist.get(i))){
				intersectionlist.remove(i);
				i--;
			}
		}

		//交点リストから、線分を通過するもの同士でグラフを生成する。
		int len = intersectionlist.size();
		toy = new Point2D[len];
		for(int i = 0 ; i < len; i++){
			toy[i] = intersectionlist.get(i);
			if(issame(toy[i], s1p)){
				s1 = i;
			}
			if(issame(toy[i], s2p)){
				s2 = i;
			}
		}

		//double [][] res = new double[len][len];
		ArrayList<ArrayList<Edge>> res = new ArrayList<ArrayList<Edge>>();
		for(int i = 0; i < len; i++){
			res.add(new ArrayList<Main.Edge>());
			res.get(i).add(new Edge(i, i, 0.0));
		}
		for(int i = 0; i < line.length; i++){

			ArrayList<C> list = new ArrayList<C>();
			for(int j = 0; j < len; j++){
				if(line[i].ptSegDist(intersectionlist.get(j)) < 1.0){
					list.add(new C(j, intersectionlist.get(j)));
				}
			}
			Collections.sort(list);
			for(int j = 1; j < list.size(); j++){
				int from = list.get(j-1).ind;
				int to = list.get(j).ind;
				double cost = list.get(j).p.distance(list.get(j-1).p);
				res.get(from).add(new Edge(from, to, cost));
				res.get(to).add(new Edge(to, from, cost));
			}
		}
		return res;
	}

	private Point2D intersectPtSS(Line2D l, Line2D m) {
		Point2D lVec = sub(l.getP2(), l.getP1());
		Point2D mVec = sub(m.getP2(), m.getP1());
		Point2D m1l1Vec = sub(m.getP1(), l.getP1());
		double a = cross(m1l1Vec, lVec);
		double b = cross(lVec, mVec);
		if(Math.abs(a) < EPS && Math.abs(b) < EPS){
			//平行な直線同士の場合
			return null;
			//          if(l.getP1().distance(m.getP1()) < EPS) return l.getP1();
			//          if(l.getP1().distance(m.getP2()) < EPS) return l.getP1();
			//          return l.getP2();
		}
		double t = a / b;
		double resx = m.getX1() + t * mVec.getX();
		double resy = m.getY1() + t * mVec.getY();
		return new Point2D.Double(resx, resy);
	}

	private boolean issame(Point2D p1, Point2D p2) {
		if(Math.abs(p1.getX() - p2.getX()) < EPS && Math.abs(p1.getY() - p2.getY()) < EPS ){
			return true;
		}
		return false;
	}
	private double cross(Point2D p1, Point2D p2) {
		double res = p1.getX() * p2.getY() - p1.getY() * p2.getX();
		return res;
	}
	private Point2D sub(Point2D p2, Point2D p1) {
		double x = p2.getX() - p1.getX();
		double y = p2.getY() - p1.getY();
		return new Point2D.Double(x, y);
	}

	public static void main(String [] args){
		new Main().doit();
	}
}