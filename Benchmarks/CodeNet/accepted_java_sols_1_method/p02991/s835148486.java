import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<Integer>[] list = new ArrayList[3*n+1];
		for(int i = 1; i <= 3*n; i++){
		    list[i] = new ArrayList<Integer>();
		}
		for(int i = 0; i < m; i++){
		    int from = sc.nextInt();
		    int to = sc.nextInt();
		    list[from].add(to + n);
		    list[from + n].add(to + 2*n);
		    list[from + 2*n].add(to);
		}
		int s = sc.nextInt();
		int t = sc.nextInt();

		// 計算
		int result = -1;
		ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
		int[] visited = new int[3*n+1];
		Arrays.fill(visited, Integer.MAX_VALUE);
		ad.add(s);
		visited[s] = 0;
		while(!ad.isEmpty()){
		    Integer now = ad.poll();
		    for(Integer i : list[now]){
		        int before = visited[i];
		        visited[i] = min(visited[i], visited[now]+1);
		        if(before != visited[i]) ad.add(i);
		        if(i == t) break;
		    }
		}
		if(visited[t] != Integer.MAX_VALUE) result = visited[t]/3;

		// 出力
		System.out.println(result);

	}
}
