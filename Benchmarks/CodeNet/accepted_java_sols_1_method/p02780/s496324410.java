
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		
		double []d = new double[300001];
		
		for(int i = 0 ; i <= 300000 ; i++) {
			d[i] = (double)(i+2)/2;
		}
		
		double []sum = new double [n+1];
		sum[0] = 0;
		
		for(int i = 0 ;i < n ;i++) {
			int p = Integer.parseInt(sc.next());
			sum[i+1] = sum[i] + d[p-1];
		}
		double max = 0;
		for(int i = 0 ; i <= n-k ; i++) {
			max = Math.max(sum[k+i] - sum[i], max);
		}
		
		System.out.println(max);
		
	}
}
