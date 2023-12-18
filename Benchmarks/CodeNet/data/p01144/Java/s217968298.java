import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	private static class Path implements Comparable<Path>{
		int dist;
		int p;
		
		Path(int d, int p){
			this.dist = d;
			this.p = p;
		}

		@Override
		public int compareTo(Path arg0) {
			return this.dist * this.p > arg0.dist * arg0.p ? -1
														   :this.dist * this.p > arg0.dist * arg0.p ? 1
																                                    : 0;
		}
	}
			
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			final int N = sc.nextInt();
			long M = sc.nextLong();
			
			if(N == 0 && M == 0){
				break;
			}
			
			Path[] ps = new Path[N];
			
			for(int i = 0; i < N; i++){
				ps[i] = new Path(sc.nextInt(), sc.nextInt());
			}
			
			Arrays.sort(ps);
			
			
			for(int i = 0; M != 0 && i < N; i++){
				if(M - ps[i].dist > 0){
					M -= ps[i].dist;
					ps[i].dist = 0;
				}else{
					ps[i].dist -= M;
					M = 0;
				}
			}
			
			int sum = 0;
			for(int i = 0; i < N; i++){
				sum += ps[i].dist * ps[i].p;
			}
			
			System.out.println(sum);
			
		}
		
	}

}