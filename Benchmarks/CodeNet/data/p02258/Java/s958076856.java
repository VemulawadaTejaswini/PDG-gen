import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	int n;
	int[] R;
	int max,min;
	
	public void input() {
		n = sc.nextInt();
		R = new int[n];
		for(int i=0; i<n; i++) R[i] = sc.nextInt();
	}
	
	public void compute() {
		min = R[0];
		max = Integer.MIN_VALUE;
		for(int i=1; i<n; i++) {
			max = Math.max(max, R[i]-min);
			min = Math.min(min, R[i]);
		}
		System.out.println(max);
	}
	
	public static void main(String[] args) {
		Main obj = new Main();
		obj.input();
		obj.compute();
	}
}

