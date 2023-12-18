import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	static String[][] dp;
	static char[][] code;
	static int W;
	static int H;
	public static void main(String[] args) {
		solve();
	}

	private static void solve() {
		Scanner sc = new Scanner(System.in);
		PrintWriter pr = new PrintWriter(System.out);
		
		while (true) {
			int n = sc.nextInt();
			if(n==0) break;
			boolean[][] plan = new boolean[n][30];
			Set<Integer>[] set = new HashSet[n];
			for (int k = 0; k < n; k++) {
				set[k] = new HashSet<Integer>();
				int tmp = sc.nextInt();
				for(int s=0;s<tmp;s++){
					plan[k][sc.nextInt()-1] = true;
					set[k].add(k);
				}
			} 
			for(int d=0;d<30;d++){
				Set<Integer> tmp = new HashSet<Integer>();
				boolean finish = false;
				for(int s=0;s<n;s++){
					if(plan[s][d]){
						tmp.addAll(set[s]);
					}
				}
				for(int s=0;s<n;s++){
					if(plan[s][d]){
						set[s].addAll(tmp);
						if(set[s].size()==n){
							pr.println(d+1);
							finish = true;
							break;
						}
					}
				}
				if(finish) break;
			}
		}
		pr.flush();
		sc.close();
		
	}
}