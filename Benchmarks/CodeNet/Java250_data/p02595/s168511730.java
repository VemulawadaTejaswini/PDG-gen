import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		long d = Integer.parseInt(sc.next());
		long[] x = new long[n];
		long[] y = new long[n];
		for(int i = 0; i < n; i++) {
			x[i]  = Integer.parseInt(sc.next());
			y[i]  = Integer.parseInt(sc.next());
		}
		int sum = 0;
		for(int i =  0; i < n; i++) {
			if(d*d >= x[i]*x[i] + y[i]*y[i]) {
				sum++;
			}
		}
		System.out.println(sum);
	}

	
	
}

