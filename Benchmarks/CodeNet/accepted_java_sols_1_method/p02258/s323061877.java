import java.util.*;

public class Main{
	final static int MOD = 1000000007;
	final static int INF = 1000000000;
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int ans = -2 * INF, minv = 2 * INF;
		for(int i = 0; i < n; ++i){
			int R = Integer.parseInt(sc.next());
			ans = Math.max(ans, R - minv);
			minv = Math.min(minv, R);
		}
		sc.close();
		System.out.println(ans);
	}
	
}

