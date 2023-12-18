import java.util.Scanner;

public class Main {
	
	Scanner sc = new Scanner(System.in);
	public void run() {
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n == 0) break;
			calc(n);
		}
	}

	public void calc(int n){
		int[][] map = new int[n][n];
		for(int i = 0; i < n; i++){
			int m = sc.nextInt();
			for(int j = 0; j < m; j++){
				int p = sc.nextInt();
				map[i][p-1] = 1;
			}
		}
		int k = sc.nextInt();
		int[] ans = new int[n];
		for(int i = 0; i < k; i++){
			int l = sc.nextInt();
			for(int j = 0; j < n; j++){
				if(map[j][l-1] == 0) ans[j] = -1;
			}
		}
		
		int answer = 0;
		for(int i = 0; i < n; i++){
			if(ans[i] == 0 && answer == 0) answer = i + 1;
			else if(ans[i] == 0 && answer != 0) {
				answer = -1;
				break;
			}
		}
		if(answer == 0) answer = -1;
		System.out.println(answer);
	}
	public static void main(String[] args) {
		new Main().run();
	}
}