import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] x = new long[N];
		long[] y = new long[N];
		for(int i =  0; i < N; i++){
			x[i] = sc.nextLong();
			y[i] = sc.nextLong();
		}
		
		long max = 0;
		for(int i = 0; i < N-1; i++){
			for(int j = i+1; j < N; j++){
				long dis = Math.abs(x[i]-x[j]) + Math.abs(y[i]-y[j]);
				max = Math.max(max, dis);
			}	
		}
		System.out.println(max);
	}
}
