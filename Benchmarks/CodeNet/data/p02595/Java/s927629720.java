import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long d = scan.nextInt();
		long[] x = new long[n];
		long[] y = new long[n];
		for(int i = 0;i < n; ++i){
			x[i] = scan.nextInt();
			y[i] = scan.nextInt();
		}
		int count = 0;
		for(int i = 0;i < n; ++i){
			long distance = x[i]*x[i] + y[i]*y[i];
			count += distance <= d*d? 1 : 0;
		}

		System.out.print(count);
	}
}
