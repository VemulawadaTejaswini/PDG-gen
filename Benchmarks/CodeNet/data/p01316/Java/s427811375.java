import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	public void run() {
		while(sc.hasNext()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n == 0 && m == 0)break;
			else calc(n, m);
			
		}
	}
	public void calc(int n, int m){
		code = new int[m];
		xs = new int[n];
		 memo = new int[n][256];
		 for(int i = 0; i < n; i++){
			 Arrays.fill(memo[i], Integer.MAX_VALUE); 
		 }
		for(int i = 0; i < m; i++){
			code[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++){
			xs[i] = sc.nextInt();
		}
		
		int t = iter(128, 0, n, m);
		System.out.println(t);
		
	}
	int[] code;
	int[] xs;
	int[][] memo;
	
	public int iter(int y, int i, int n, int m){
		if(i == n) 
			return 0;
		else if(memo[i][y] != Integer.MAX_VALUE) 
			return memo[i][y];
		else{
			int ans = Integer.MAX_VALUE;
			for(int j = 0; j < m; j++){
				int t = y + code[j];
				if(t > 255) t = 255;
				if(t < 0) t = 0;
				ans = Math.min(ans, (xs[i] - t)*(xs[i] - t) + iter(t, i+1, n,m));
			}
			memo[i][y] = ans;
			return ans;
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}