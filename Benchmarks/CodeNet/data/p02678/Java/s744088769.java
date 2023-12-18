import java.util.*;
public class Main{

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		int m = Integer.parseInt(scan.next());
		int[][] ab = new int[m][2];
		int a,b;
		for(int i = 0;i < m; ++i){
			a = Integer.parseInt(scan.next());
			b = Integer.parseInt(scan.next());
			ab[i][0] = Math.min(a, b);
			ab[i][1] = Math.max(a, b);
		}
		Arrays.sort(ab,(x,y) -> Integer.compare(x[0], y[0]));

		int[] cost = new int[n];
		Arrays.fill(cost, Integer.MAX_VALUE);
		cost[0] = 0;
		int old = 1;
		int count = 1;
		for(int i = 0;i < m; ++i){
			if(ab[i][0] == old){
				cost[ab[i][1] - 1] = Math.min(cost[ab[i][1]-1], count);
			}else{
				++count;
				cost[ab[i][1] - 1] = Math.min(cost[ab[i][1]-1], count);
			}

			old = ab[i][0];
		}
		if(count == n -1 ){
			System.out.println("Yes");
			for(int i = 1;i < n; ++i){
				System.out.println(cost[i]);
			}
		}else{
			System.out.println("No");
		}

	}
}