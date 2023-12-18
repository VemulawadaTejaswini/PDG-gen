import java.util.*;

public class Main {

	public static Scanner sc = new Scanner(System.in);
	public static int N, M;
	
	public static void main(String[] args) {
		
		while (true) {
			N = sc.nextInt();
			M = sc.nextInt();
			if (N == 0 && M == 0)
				break;
			
			ArrayList<Edge> es = new ArrayList<Edge>();
			for (int i = 0; i < N; i++) {
				es.add(new Edge(sc.nextInt(), sc.nextInt()));
			}
			
			Collections.sort(es);
			int ans = 0;
			for (int i = 0; i < N; i++) {
				int D = es.get(i).D, P = es.get(i).P;
				if (M == 0) {
					ans += D * P;
				} else if (D <= M) {
					M -= D;
				} else {
					
					ans += P * (D - M);
					M = 0;
				}
				
			}
			System.out.println(ans);
		}
	}
}

class Edge implements Comparable<Edge> {
	int D, P;
	Edge(int D, int P) {
		
		this.D = D;
		this.P = P;
	}
	
	public int compareTo(Edge e) {
		return  e.P - this.P;
	}
}