
import java.util.*;


public class Main{ 

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int nodeNum = scan.nextInt();
		AdjacencyMatrices am = new AdjacencyMatrices(nodeNum);

		am.readMatrix(scan);
		Iterator<Edge> iter = am.getIter();

		UnionFind unionFind  = new UnionFind(nodeNum);
		int sumDist = 0;
		int id=0;
		while(iter.hasNext()){
			Edge e = iter.next();

			if(!unionFind.same(e.x, e.y)){
				sumDist += e.dist;
				unionFind.union(e.x, e.y);
			}
		}
		System.out.println(""+sumDist);
	}

}

class Edge implements Comparable<Edge>{
	int x;
	int y;
	int dist;
	int id;
	public Edge(int x, int y, int d,int id){
		this.x = x;
		this.y = y;
		this.dist = d;
		this.id = id;
	}
	@Override
 	public int compareTo(Edge other) {
		return this.dist - other.dist;
	}
	@Override
	public String toString(){
		return "x: " + x + " y : " + y + " dist : " + dist;
	}
}
class AdjacencyMatrices{
	int pointNum;
	ArrayList<Edge> edgeList = new ArrayList<Edge>();
	public AdjacencyMatrices(int n){
		pointNum = n;
	}
	public void readMatrix(Scanner scan){
		int id = 0;
		for(int i=0; i<pointNum; i++)
			for(int j=0; j< pointNum; j++){
				int dist = scan.nextInt();
				if(j > i && dist>=0)
					edgeList.add(new Edge(i, j, dist, id++));
		}
	}

	public Iterator<Edge> getIter(){
		Collections.sort(edgeList);
		return edgeList.iterator();
	}

}
class UnionFind{
    int[] index;
    public UnionFind(int n){
        index = new int[n];
        for(int i=0; i<n; i++)
            index[i] = i;
    }
    int find(int x){
        if(index[x]==x)
            return x;
        else
            return find(index[x]);
    }
    boolean same(int x, int y){
        return find(x) == find(y);
    }
    void union(int x, int y){
        int rootx = find(x);
        int rooty = find(y);
        if(rootx == rooty)
            return;
        else
            index[rooty] = rootx;
    }
    void printIndex(){
        for(int i=0; i<index.length; i++)
            System.out.print(" " + index[i]);
        System.out.println("");
    }

}