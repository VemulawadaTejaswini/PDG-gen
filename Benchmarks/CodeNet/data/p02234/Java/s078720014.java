import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	int n;
	int[][] m;
	int[] r;
	int[] c;
	
	public void input() {
		n = sc.nextInt();
		m = new int[n][n];
		r = new int[n];
		c = new int[n];
		for(int i=0; i<n; i++) {
			r[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}
	}
	
	public int solve(int start, int goal) {
		if(start == goal) { return 0; }
		if(m[start][goal] == 0) {
			int min = Integer.MAX_VALUE;
			for(int i=start; i<goal; i++) {
				int swap = solve(start,i)+solve(i+1,goal)+r[start]*c[i]*c[goal];
				min = Math.min(swap,min);
			}
			m[start][goal] = min;
		}
		return m[start][goal];
	}
	
	public void output() {
		System.out.println( solve(0,n-1) );
	}
	
	public static void main(String[] args) {
		Main obj = new Main();
		obj.input();
		obj.output();
	}
}

