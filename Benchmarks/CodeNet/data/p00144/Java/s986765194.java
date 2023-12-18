import java.util.Scanner;


public class Main {

	final int INF = 100000;

	private void doit() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][] data = new int[n+1][n+1];
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= n; j++){
				if(i !=j){
					data[i][j] = INF;
				}
			}
		}

		for(int i = 1; i <= n; i++){
			int from = sc.nextInt();
			int k = sc.nextInt();
			while(k-- > 0){
				int to = sc.nextInt();
				data[from][to] = 1;
			}
		}

		for(int j = 1; j <= n; j++){
			for(int i = 1; i <= n; i++){
				for(int k = 1; k <= n; k++){
					data[i][k] = Math.min(data[i][k], data[i][j] + data[j][k]);
				}
			}
		}

		int p = sc.nextInt();
		while(p-- > 0){
			int from = sc.nextInt();
			int to = sc.nextInt();
			int ttl = sc.nextInt();
			if(data[from][to] + 1 <= ttl){
				System.out.println(data[from][to] + 1);
			}
			else{
				System.out.println("NA");
			}
		}



	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();

	}

}