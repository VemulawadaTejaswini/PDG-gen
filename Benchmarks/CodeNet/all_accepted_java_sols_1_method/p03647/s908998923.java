import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		boolean[] to = new boolean[N];
		boolean[] from = new boolean[N];
		for(int i=0; i<M; i++) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			if(a==0)
				to[b] = true;
			if(b==0)
				to[a] = true;
			if(a==N-1)
				from[b] = true;
			if(b==N-1)
				from[a] = true;
		}
		boolean ok = false;
		for(int i=1; i<N-1; i++)
			ok |= to[i]&&from[i];
		
		System.out.println(ok ? "POSSIBLE" : "IMPOSSIBLE");
				
		sc.close();
	}
}