import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int c[] = new int[N+1];

		for(int k=0;k<N+1;k++){
			c[k] = 0;
		}
		for(int n=0;n<M;n++){
			int t = sc.nextInt();
			c[t] = 1;
		}

		int up=0;
		int down=0;

		for(int n=0;n<X;n++){
			down += c[n];
		}
		for(int n=X+1;n<N+1;n++){
			up += c[n];
		}

		System.out.println(Math.min(down,up));


	}
}