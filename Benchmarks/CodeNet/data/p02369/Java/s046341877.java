import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int V = Integer.parseInt(sc.next());
		int E = Integer.parseInt(sc.next());
		ArrayList<ArrayList<Integer>> edge = new ArrayList<ArrayList<Integer>>();
		for (int i=0;i<V;i++) {
			ArrayList<Integer> add = new ArrayList<Integer>();
			edge.add(add);
		}
		int[] indegree = new int[V];
		for (int i=0;i<E;i++) {
			int s = Integer.parseInt(sc.next());
			int t = Integer.parseInt(sc.next());
			edge.get(s).add(t);
			indegree[t]++;
		}
		ArrayList<Integer> ans = new ArrayList<Integer>();
		ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
		for (int i=0;i<V;i++) {
			if (indegree[i]==0) {
				queue.add(i);
				ans.add(i);
			}
		}
		int flag = 0;
		// cycle detection
		if (queue.isEmpty()) {
			flag=1;
		}
		int cnt = 0;
		while(!queue.isEmpty()) {
			Integer rem = queue.remove();
			for (Integer i : edge.get(rem)) {
				indegree[i]--;
				if (indegree[i]==0) {
					queue.add(i);
					ans.add(i);
				}
			}
			cnt++;
			// cycle detection
			if (cnt>V) {
				flag=1;
				break;
			}
		}
		// cycle detection
		if (cnt!=V) {
			flag=1;
		}
		System.out.println(flag);
		// System.out.println(ans);
		// for (int i=0;i<V;i++) {
			// System.out.println(ans.get(i));
		// }
	}

}
	

