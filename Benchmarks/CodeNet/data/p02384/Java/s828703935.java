import java.util.*;

public class Main42c{
	static int T, S, E, W, N, U;
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int[] in = new int[6];
		for(int i = 0; i < 6; i++){
			in[i] = scan.nextInt();
		}
		T = in[0];
		S = in[1];
		E = in[2];
		W = in[3];
		N = in[4];
		U = in[5];

		int q = scan.nextInt();
		for(int i = 0; i < q; i++){
			int n = scan.nextInt();
			int m = scan.nextInt();
			boolean flg = false;
			while(true){
				if(m == N){
					MoveSouth();
					MoveSouth();
				} else if(m == U){
					MoveNorth();
				} else if(m == T){
					MoveSouth();
				} else if(m == E){
					MoveWest();
				} else if(m == W){
					MoveEast();
				}
				if(m == S){
					if(n == T){
						flg = true;
						break;
					} else if(n == U){
						MoveEast();
						MoveEast();
					} else if(n == E){
						MoveWest();
					} else if(n == W){
						MoveEast();
					}
				}
				
			}
			System.out.println(E);
		}

	}

	public static void MoveSouth(){
		int a = T;
		T = N;
		N = U;
		U = S;
		S = a;
	}
	public static void MoveEast(){
		int a = T;
		T = W;
		W = U;
		U = E;
		E = a;
	}
	public static void MoveNorth(){
		int a = T;
		T = S;
		S = U;
		U = N;
		N = a;
	}
	public static void MoveWest(){
		int a = T;
		T = E;
		E = U;
		U = W;
		W = a;
	}
}