import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] x = new int[n];
		int plus = 0;
		int minus = 0;
		int zero = 0;
		int z = 0;
		for(int i=0; i<n; i++){
			x[i] = sc.nextInt();
		}
		int dist = Math.abs(x[0])+x[n-1]-x[0];
		for(int i=0; i<=n-k; i++){
			dist = Math.min(dist, Math.min(Math.abs(x[i]),Math.abs(x[i+k-1]))+x[i+k-1]-x[i]);
		}
		System.out.println(dist);
	}
}