import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	public void run() {
		while(sc.hasNext()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			if(n == 0 && m == 0 && k == 0)break;
			else calc(n, m, k);
			
		}
	}
	public void calc(int n, int m, int k){
		int[] memo = new int[1];
		for(int i = 0; i < n; i++){
			int[] me = new int[(int)Math.pow(m, i+1)];
			for(int j = 0; j < memo.length; j++){
				for(int t = 0; t < m; t++){
					me[m * j + t] = memo[j] + t + 1;
				}
			}
			memo = me;
		}
		
		double sum = 0;
		for(int i = 0; i < memo.length; i++){
			int t = memo[i] - k;
			if(t < 1) t = 1;
			sum += 1 / (Math.pow(m, n)) * t;
		}
		System.out.printf("%.8f\n",sum);
	}

	
	public static void main(String[] args) {
		new Main().run();
	}
}