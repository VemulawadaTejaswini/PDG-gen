
import java.util.*;
public class Main {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int V = sc.nextInt();
		int E [][] = new int [V+1][V+1];
		for (int i=1; i<=V; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			for (int k=0; k<b; k++){
				int c = sc.nextInt();
				E [a][c] = 1;
			}
		}
		Queue <Integer> Q = new ArrayDeque <Integer>();
		Q.add(1);
		int D [] = new int [V+1];
		D [1] = 1;
		while (Q.size()>0){
			int cur = Q.poll();
			for (int dst=1; dst<=V; dst++){
				if (E[cur][dst]==1 & D[dst]==0){
					D[dst]=D[cur]+1;
					Q.add(dst);
				}			
			}			
		}
		for (int m=1; m<=V; m++){
			System.out.println(m+" "+(D[m]-1));
		}
	}
}