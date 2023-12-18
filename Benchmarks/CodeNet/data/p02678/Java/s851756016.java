
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;


public class Main{
	

	 static List <Integer>[] Edge ;
	 static int []ans;
	 static boolean[]visit;
	 static Deque <Integer>que;
	 static int inf = 1000000000;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		
		Edge = new ArrayList [n];
		for(int i = 0 ; i < n ;i++) {
			Edge[i] = new ArrayList <Integer>();
		}
		
		for(int i = 0 ; i < m ;i++) {
			int a = Integer.parseInt(sc.next())-1;
			int b = Integer.parseInt(sc.next())-1;
			Edge[a].add(b);
			Edge[b].add(a);
		}
		
		que = new ArrayDeque<Integer>();
		visit = new boolean [n];
		ans = new int [n];
		Arrays.fill(ans, -1);
		ans[0] = 0;
		visit[0] = true;
		
		BFS(n,0);
		
		for(int i = 0 ; i < n ;i++) {
			if(ans[i] == -1) {
				System.out.println("No");
				return;
			}
		}
		
		System.out.println("Yes");
		
		for(int i = 1 ; i < n ;i++) {
			System.out.println(ans[i]);
		}
		
	

	}
	
	static void BFS(int n ,int st) {
		
		for(int num : Edge[st]) {
			if(!visit[num]) {
				visit[num] = true;
				ans[num] = st +1;
				que.addLast(num);
			}
		}
		
		if(que.size()== 0) {
			return;
		}
		BFS(n,que.poll());
	}
}

