import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long d = sc.nextLong();
		long[] x = new long[n];
		long[] y = new long[n];
		long count = 0;
		for(int i=0;i<n;i++){
			x[i] = sc.nextLong();
			y[i] = sc.nextLong();
			if(  ( x[i] * x[i] + y[i] * y[i] ) <= d * d ){
				count++;
			}
		}
		System.out.println(count);	
	}
}