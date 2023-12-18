import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	public void run() {
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n == 0 )break;
			else calc(n);
			
		}
	}
	public void calc(int n){
		int[] noT = new int[n];
		int[][] t = new int[n][n];
		for(int i = 0; i < n; i ++){
			for(int j = 0; j < n+1; j++){
				if(j == 0) noT[i] = sc.nextInt();
				else t[i][j-1] = sc.nextInt();
			}
		}
		int[] ans = new int[1 << n];
		Arrays.fill(ans, Integer.MAX_VALUE);
		ans[0] = 0;
		for(int bit = 0; bit < (1 << n); bit++){
			for(int i = 0; i < n; i++){
				if(((bit >> i) & 1) == 0){
					int min = noT[i];
					for(int j = 0; j < n; j++){
						if(((bit >> j) & 1) > 0){
							min = Math.min(min, t[i][j]);
						}
					}
					ans[bit|(1 << i)] = Math.min(ans[bit|(1<< i)], min + ans[bit]);
				}
			}
		}
		System.out.println(ans[(1<<n) - 1]);
	}


	
	public static void main(String[] args) {
		new Main().run();
	}
}