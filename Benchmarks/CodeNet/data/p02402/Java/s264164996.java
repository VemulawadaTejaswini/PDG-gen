import java.util.Scanner;

public class Main {
	void run(){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		long max, min , sum;
		for(int i = 0 ; i < n; i++){
			a[i] = s.nextInt();
		}
		max = a[0];
		min = a[0];
		sum = a[0];
		for(int i = 1; i < n; i++){
			sum += a[i];
			max = Math.max(max, a[i]);
			min = Math.min(min, a[i]);
		
		}
		System.out.println(min + " " + max + " " + sum);
		
			
	}
	public static void main(String[] args) {
		/* 
		 * Main x;
		 * x = new Main();
		 * x.run();
		 * ??¨????????????
		 */
		new Main().run();
		
	}
}