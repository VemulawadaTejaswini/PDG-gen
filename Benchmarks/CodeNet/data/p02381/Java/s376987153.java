import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int n = sc.nextInt();
			if(n == 0) {
				break;
			}
			
			int[] a = new int[n];
			double m = 0;
			
			for(int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
				m += a[i];
			}
			m /= n;
			
			double v = 0;
			
			for(int i = 0; i < n; i++) {
				v += (a[i]-m) * (a[i]-m);
			}
			v /= n;
			System.out.println(String.format("%f", Math.pow(v, 0.5)));
		}
	}
}
