import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n, i;
		int[] x = new int[100], y = new int[100];
		double[] dist = new double[4];
		
		for(i = 0; i < 4; i++){
			dist[i] = 0;
		}
		
		n = sc.nextInt();
		
		for(i = 0; i < n; i++){
			x[i] = sc.nextInt();
		}
		for(i = 0; i < n; i++){
			y[i] = sc.nextInt();
		}
		
		for(i = 0; i < n; i++){
			dist[0] += Math.abs(x[i] - y[i]);
			dist[1] += Math.pow(x[i] - y[i], 2);
			dist[2] += Math.pow(Math.abs(x[i] - y[i]), 3);
			dist[3] = Math.max(dist[3], Math.abs(x[i] - y[i]));
		}
		
		dist[1] = Math.abs(Math.sqrt(dist[1]));
		dist[2] = Math.pow(dist[2], 0.3333333333);
		
		for(double d : dist){
			System.out.println(d);
		}
	}
}