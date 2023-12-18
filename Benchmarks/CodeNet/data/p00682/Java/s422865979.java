

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main p = new Main();
	}

	public Main() {
		Scanner sc = new Scanner(System.in);
		int num = 1;
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			int[] x = new int[n];
			int[] y = new int[n];
			for(int i=0;i<n;i++){
				x[i] = sc.nextInt();
				y[i] = sc.nextInt();
			}
			
			solve(num, n, x, y);
			num++;
		}
	}

	public void solve(int num, int n, int[] x, int[] y) {
		double res = 0;
		for(int i=0;i<n;i++){
			res += (x[i]-x[(i+1)%n])*(y[i]+y[(i+1)%n]);
		}
		System.out.println(String.format("%d %.1f", num, Math.abs(res/2)));
	}

}