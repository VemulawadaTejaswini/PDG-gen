import java.util.Scanner;

public class Main {
	
	Scanner sc = new Scanner(System.in);
	public void run() {
		while(sc.hasNext()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int a = sc.nextInt();
			if(n == 0 && m == 0 && a == 0) break;
			calc(n, m, a);
		}
	}
	public void calc(int n, int m, int a){
		int[][] amida = new int[1001][n+1];
		int height = 0;
		
		for(int i = 0; i < m; i++){
			int h = sc.nextInt();
			int p = sc.nextInt();
			int q = sc.nextInt();
			amida[h][p] = q;
			if(height < h) height = h;
		}
		
		for(int i = height; i >0; i--){
			if(amida[i][a] != 0) a = amida[i][a];
		}
		System.out.println(a);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}