import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		Vector<Integer>[] to = new Vector[2000000];
		for(int i = 0;i < 2000000; ++i){
			to[i] = new Vector<>();
		}
		for(int i = 0;i < m; ++i){
			int a = scan.nextInt();
			int b = scan.nextInt();
			--a;--b;
			to[a].add(b);
			to[b].add(a);

		}
		Queue<Integer>q = new ArrayDeque<>();//ärÎŰĚ¸_
		q.add(0);
		int[] distance = new int[n];//¸_ĚŁ
		Arrays.fill(distance,Integer.MAX_VALUE);
		int[] pre = new int[n];//OĚ¸_
		distance[0] = 0; //n_
		q.add(0);
		while(q.peek() != null){
			int v = q.poll();
			for(int i :to[v]){
				if(distance[i] != Integer.MAX_VALUE)continue;
				distance[i] = distance[v]+1;//¸_ĚŁđL^
				pre[i] = v;//OĚ¸_ĚÔđL^
				q.add(i);
			}
		}
		System.out.println("Yes");
		for(int i = 1;i < n; ++i){
			int ans = pre[i];
			System.out.println(ans+1);
		}
	}
}

