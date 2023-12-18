import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	class UnionFind{
		int[] pars;
		UnionFind(int n){
			pars = new int[n];
			for(int i=0; i<n; i++) pars[i] = i;
		}
		int getRoot(int x){
			return x==pars[x]?x:(pars[x] = getRoot(pars[x]));
		}
		boolean isSame(int x, int y){
			return getRoot(x) == getRoot(y);
		}
		void merge(int x, int y){
			pars[getRoot(x)] = getRoot(y);
		}
	}

	double sq(double x){ return x*x; }

	class Cell{
		double x, y, z, r;
		Cell(double _x, double _y, double _z, double _r){
			this.x = _x;
			this.y = _y;
			this.z = _z;
			this.r = _r;
		}
		double getDist(Cell a){
			return sqrt(sq(x-a.x) + sq(y-a.y) + sq(z-a.z));
		}
	}

	class Edge{
		double dist;
		int a, b;
		Edge(double _d, int _a, int _b){
			this.dist = _d;
			this.a = _a;
			this.b = _b;
		}
	}

	class Cmp implements Comparator<Edge>{
		public int compare(Edge e1, Edge e2){
			return e1.dist>e2.dist?1:e1.dist<e2.dist?-1:0;
		}
	}

	int N;
	Cell[] cells;

	void run(){
		Scanner in = new Scanner(System.in);
		for(;;){
			N = in.nextInt();
			if(N==0) return ;
			cells = new Cell[N];
			for(int i=0; i<N; i++){
				cells[i] = new Cell(in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble());
			}
			System.out.printf("%.3f\n", solve());
		}
	}


	double solve(){
		double ret = 0.0;
		UnionFind uf = new UnionFind(N);
		ArrayList<Edge> es = new ArrayList<Edge>();
		for(int i=0; i<N; i++){
			for(int j=i+1; j<N; j++){
				double d = cells[i].getDist(cells[j]) - cells[i].r - cells[j].r;
				if(d <= 0) uf.merge(i, j);
				else es.add(new Edge(d, i, j));
			}
		}
		Edge[] ees = (Edge[])es.toArray(new Edge[0]);
		sort(ees, new Cmp());
		for(int i=0; i<ees.length; i++){
			if(!uf.isSame(ees[i].a, ees[i].b)){
				uf.merge(ees[i].a, ees[i].b);
				ret += ees[i].dist;
			}
		}
		return ret;
	}

	public static void main(String args[]){
		new Main().run();
	}
}