import java.util.*;

public class Dice{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int[] in = new int[6];
		for(int i = 0; i < 6; i++){
			in[i] = scan.nextInt();
		}
		int T = in[0];
		int S = in[1];
		int E = in[2];
		int W = in[3];
		int N = in[4];
		int U = in[5];

		int q = scan.nextInt();
		for(int i = 0; i < q; i++){
			int n = scan.nextInt();
			int m = scan.nextInt();
			boolean flg = false;
			while(true){
				if(m == S){
					if(n == T){
						flg = true;
						break;
					} else{
						MoveEast();
					}
				} else{
					MoveSouth();
				}
				
			}
			System.out.println(E);
		}

	}

	public void MoveSouth(){
		int a = T;
		T = N;
		N = U;
		U = S;
		S = a;
	}
	public void MoveEast(){
		int a = T;
		T = W;
		W = U;
		U = E;
		E = a;
	}
	public void MoveNorth(){
		int a = T;
		T = S;
		S = U;
		U = N;
		N = a;
	}
	public void MoveWest(){
		int a = T;
		T = E;
		E = U;
		U = W;
		W = a;
	}
}