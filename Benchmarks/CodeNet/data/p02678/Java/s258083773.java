import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
	
	public static void func(List<Integer>[] I, int now, int[] ans) {
		ArrayDeque<Integer> que = new ArrayDeque<>();
		que.add(now);
		
		while(!que.isEmpty()) {
			int x = que.remove();
			
			for(int t: I[x]) {
				if(ans[t] == 0) {
					ans[t] = x;
					que.add(t);
				}
			}
			
		}
		
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int m = stdIn.nextInt();
		
		List<Integer>[] list = new List[n+1];
		
		int [] ans = new int[n+1];
		
		for(int i = 1; i <= n; i++) {
			list[i] = new ArrayList<>();
		}
		
		for(int i = 1; i <= m; i++) {
			int a = stdIn.nextInt();
			int b = stdIn.nextInt();
			list[a].add(b);
			list[b].add(a);
		}

		func(list,1,ans);
		
		System.out.println("Yes");
		
		for(int i = 2; i <= n; i++) {
			System.out.println(ans[i]);
		}
		
	}

}
