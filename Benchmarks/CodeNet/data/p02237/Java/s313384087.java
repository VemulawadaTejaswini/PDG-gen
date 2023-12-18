import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	public void run() {
		while(sc.hasNext()){
			int n = sc.nextInt();
			calc(n);
		}
	}
	public void calc(int n){
		int[][] gyouretsu = new int[n][n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				gyouretsu[i][j] = 0;
			}
		}
		for(int i = 0; i < n; i++){
			int u = sc.nextInt();
			int k = sc.nextInt();
			for(int j = 0; j < k; j++){
				int v = sc.nextInt();
				gyouretsu[u-1][v-1] = 1;
			}
		}
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				System.out.print(gyouretsu[i][j]);
				if(j != n-1){
					System.out.print(" ");
				}
			}
				System.out.println();
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}