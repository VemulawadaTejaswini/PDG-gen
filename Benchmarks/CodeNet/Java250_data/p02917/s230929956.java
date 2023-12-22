import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
	
	void run() {
		int n = sc.nextInt();
		int[] b = new int[n+1];
		b[0] = Integer.MAX_VALUE;
		b[n] = Integer.MAX_VALUE;
		for(int i =0 ; i< n-1; i++) {
			b[i+1] = sc.nextInt();
		}
		
		int a[] = new int[n];
		
		int sum = 0;
		for(int i = 0 ; i < n;i++) {
			a[i] = Math.min(b[i], b[i+1]);
			sum += a[i];
		}
		
		System.out.println(sum);
	}
}
