import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;


public class Main {

	static boolean canReach(int current, int target) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(current);
		visited[current] = true;
		
		while (!q.isEmpty()) {
			int to = q.poll();
			visited[to] = true;
			for (int i=0;i<arLs[to].size();i++) {
				int next = (Integer) arLs[to].get(i);
				if (next==target) {
					return true;
				}
				if (visited[next]) continue;
				q.add(next);
			}
		}
		
		return false;
	}
	
//	static boolean canReach(int current, int target) {
//		if (visited[current]) return false;
//		visited[current] = true;
//		for (int i=0;i<arLs[current].size();i++) {
//			int to = (Integer) arLs[current].get(i);
//			if (to==target) {
//				return true;
//			}
//			if (canReach(to, target)) {
//				return true;
//			}
//		}
//		return false;
//	}
	
	static List<Integer>[] arLs;
	static boolean[] visited;
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m=scan.nextInt();
		arLs = new List[n];
		visited = new boolean[n];
		for (int i=0;i<n;i++) {
			List<Integer> ls = new ArrayList<Integer>();
			arLs[i] = ls;
		}
		for (int i=0;i<m;i++) {
			int s1=scan.nextInt();
			int s2=scan.nextInt();
			arLs[s1].add(s2);
			arLs[s2].add(s1);
		}
		
		int k=scan.nextInt();
		for (int j=0;j<k;j++) {
			for (int i=0;i<n;i++) {
				visited[i]=false;
			}
			System.out.println(canReach(scan.nextInt(),scan.nextInt()) ? "yes" : "no");
		}
	}
}