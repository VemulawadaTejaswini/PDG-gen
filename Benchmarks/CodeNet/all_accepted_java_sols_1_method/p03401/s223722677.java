import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int P[] = new int[N];
		int deg[] = new int[N+1];

		for(int n=0;n<N;n++){
			P[n] = sc.nextInt();
		}

		int sums = 0;
		int bef = 0;
		for(int n=0;n<N;n++){
			deg[n] = Math.abs(P[n]-bef);
			sums += deg[n];
			bef = P[n];
		}
		deg[N] = Math.abs(bef);
		sums += deg[N];
		
		for(int n=0;n<N;n++){
			int k = -deg[n]-deg[n+1];

			if(n==0) k += Math.abs(P[1]);
			else if(n==N-1) k += Math.abs(P[N-2]);
			else k += Math.abs(P[n+1] - P[n-1]);

			System.out.println(sums+k);
		}
	}
}