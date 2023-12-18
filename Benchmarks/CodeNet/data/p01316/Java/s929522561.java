import java.util.ArrayList;
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
		for(int i = 0; i < m; i++){
			code[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++){
			xs[i] = sc.nextInt();
		}
		min = Integer.MAX_VALUE;
		iter(128, 0, n, m, 0);
		System.out.println(min);
	}
	int[] code;
	int[] xs;
	int min;

	public void iter(int y, int i, int n, int m, int sum){
		if(i == n){
			if(min > sum) min = sum;
		}
		else {
			for(int j = 0; j < m; j++){
				int t = y + code[j];
				if(t < 0) t = 0;
				if(t > 255) t = 255;
				int s = sum + (xs[i] - t) * (xs[i] - t);
				iter(t, i+1, n, m, s);
			}
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}