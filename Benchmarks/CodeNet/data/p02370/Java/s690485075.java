import java.util.*;
public class Main {
	// get topological order from edge-list format,
	// such as 0: <1, 2>, 1: <>, 2: <3>, 3: <>
	// (expecting vetex-number starts from 0)
	// if there is no topological order, it returns null.
	static ArrayList<Integer> getTopologicalOrder(ArrayList<ArrayList<Integer>> es) {
		int n = es.size(); // number of vertexes
		int[] deg = new int[n];
		ArrayList<Integer> ret = new ArrayList<>(n);
		Queue<Integer> q = new ArrayDeque<Integer>(n);
		for(int i=0; i<n; i++) {
			for(int to : es.get(i)) {
				deg[to]++;
			}
		}
		for(int i=0; i<n; i++) {
			if(deg[i]==0) q.add(i);
		}
		int cnt = 0;
		while(!q.isEmpty()) {
			int from = q.poll();
			ret.add(from);
			for(int to : es.get(from)) {
				deg[to]--;
				if(deg[to]==0) {
					q.add(to);
				}
			}
			cnt++;
		}
		if(cnt!=n) return null;
		return ret;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); int m = sc.nextInt();
		ArrayList<ArrayList<Integer>> es = new ArrayList<>();
		for(int i=0; i<n; i++) {
			es.add(new ArrayList<Integer>());
		}
		for(int i=0; i<m; i++) {
			int s = sc.nextInt(); int t = sc.nextInt();
			es.get(s).add(t);
		}
		ArrayList<Integer> tord = getTopologicalOrder(es);
		for(int i=0; i<n; i++) {
			System.out.println(tord.get(i));
		}
	}
}

