
import java.util.Scanner;
import java.util.ArrayList;


class Main{
	public static void main(String[] args){
		Solve s = new Solve();
		s.solve();
	}	
}

class Solve{
	Solve(){}

	void solve(){
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int [][] ar = new int[n][n];

		for(int i = 0; i < n; i++){
			int u = in.nextInt() - 1, k = in.nextInt();
			for(int j = 0; j < k; j++){
				int v = in.nextInt() -1;
				ar[u][v] = 1;
			}
		}

		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				System.out.print(ar[i][j]);
			}
			System.out.println("");
		}

	}
}