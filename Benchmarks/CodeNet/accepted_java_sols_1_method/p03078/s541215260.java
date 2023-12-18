
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = Integer.parseInt(sc.next());
		int y = Integer.parseInt(sc.next());
		int z = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		
		long []a = new long [x];
		long []b = new long [y];
		long []c = new long [z];
		
		for(int i = 0 ; i < x ;i++) {
			a[i] = Long.parseLong(sc.next());
		}
		for(int i = 0 ; i < y ;i++) {
			b[i] = Long.parseLong(sc.next());
		}
		for(int i = 0 ; i < z ;i++) {
			c[i] = Long.parseLong(sc.next());
		}
		
		
		long []sum1 = new long  [x * y];
		int id = 0;
		
		for(int i = 0 ;i < x ;i++) {
			for(int j = 0 ; j < y ;j++) {
				sum1[id] = a[i] + b[j];
				id++;
			}
		}
		
		Arrays.sort(sum1);
		
		int m = x * y -1;
		long []sum = new long [k * z];
		id = 0;
	
		for(int i = m ; i > Math.max(-1, m - k ) ;i--) {
			for(int j = 0 ; j < z ; j++) {
				sum[id] = sum1[i] + c[j];
				id++;
			}
		}
		
		Arrays.sort(sum);
		int l = k * z -1;
		
		for(int i = l ; i > l - k ; i--) {
			System.out.println(sum[i]);
		}
	}
}


