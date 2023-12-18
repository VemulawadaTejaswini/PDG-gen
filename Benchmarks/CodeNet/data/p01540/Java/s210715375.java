import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

//Treasure Hunt
public class Main{

	class Scanner {
		int nextInt() {
			try {
				int c = System.in.read();
				while (c != '-' && (c < '0' || '9' < c))
					c = System.in.read();
				if (c == '-') return -nextInt();
				int res = 0;
				do {
					res *= 10;
					res += c - '0';
					c = System.in.read();
				} while ('0' <= c && c <= '9');
				return res;
			} catch (Exception e) {
				return -1;
			}
		}
	}
	
	class P{
		double x, y;
		public P(double x, double y) {
			this.x = x;
			this.y = y;
		}
	}
	
	Comparator<P> xsort = new Comparator<P>() {
		public int compare(P o1, P o2) {
			return (int)Math.signum(o1.x-o2.x);
		}
	};
	Comparator<P> ysort = new Comparator<P>() {
		public int compare(P o1, P o2) {
			return (int)Math.signum(o1.y-o2.y);
		}
	};
	
	class Node{
		double lx, rx, ly, ry;
		Node parent;
		Node left, right;
		P point;
		int num;
		public Node(double lx, double rx, double ly, double ry) {
			this.lx = lx;
			this.rx = rx;
			this.ly = ly;
			this.ry = ry;
			parent = left = right = null;
			point = null;
			num = 0;
		}
		int search(double x1, double x2, double y1, double y2){
			if(left==null){
				if(x1 <= point.x && point.x <= x2 && y1 <= point.y && point.y <= y2)return reportAll();
				return 0;
			}
			if(x2 < lx || rx < x1 || y2 < ly || ry < y1)return 0;
			if(x1 <= lx && rx <= x2 && y1 <= ly && ry <= y2){
				return reportAll();
			}
			return left.search(x1, x2, y1, y2) + right.search(x1, x2, y1, y2);
		}
		int reportAll(){
			return num;
		}
	}
	Node make2DTree(List<P> list, int depth, double lx, double rx, double ly, double ry, Node parent){
		Node res = new Node(lx, rx, ly, ry);
		res.parent = parent;
		if(list.size()==1){
			res.point = list.get(0);
			res.num = 1;
			return res;
		}
		PriorityQueue<P> L = new PriorityQueue<P>(list.size(), depth%2==0?xsort:ysort);
		PriorityQueue<P> R = new PriorityQueue<P>(list.size(), depth%2==0?xsort:ysort);
		int mid = (list.size()-1)/2;
		res.point = list.get(mid);
		for(int i=0;i<list.size();i++){
			if(i<=mid)L.add(list.get(i));
			else R.add(list.get(i));
		}
		List<P> leftList = new ArrayList<P>(), rightList = new ArrayList<P>();
		while(!L.isEmpty())leftList.add(L.poll());
		while(!R.isEmpty())rightList.add(R.poll());
		if(depth%2==0){
			res.left = make2DTree(leftList, depth+1, lx, res.point.x, ly, ry, res);
			res.right = make2DTree(rightList, depth+1, res.point.x, rx, ly, ry, res);
		}
		else{
			res.left = make2DTree(leftList, depth+1, lx, rx, ly, res.point.y, res);
			res.right = make2DTree(rightList, depth+1, lx, rx, res.point.y, ry, res);
		}
		res.num = res.left.num + res.right.num;
		return res;
	}
	Node make(List<P> list, double lx, double rx, double ly, double ry){
		Collections.sort(list, xsort);
		return make2DTree(list, 0, lx, rx, ly, ry, null);
	}
	
	void run(){
		Scanner sc = new Scanner();
		int n = sc.nextInt(), m = sc.nextInt();
		int INF = 1<<30;
		List<P> p = new ArrayList<P>();
		for(int i=0;i<n;i++)p.add(new P(sc.nextInt(), sc.nextInt()));
		Node root = make(p, -INF, INF, -INF, INF);
		while(m--!=0){
			int x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt();
			System.out.println(root.search(x1, x2, y1, y2));
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}