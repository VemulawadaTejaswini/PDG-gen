import java.util.*;

class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		while (true) {
			int n = sc.nextInt();
			if (n == 0) break;
			
			double[] ar = new double[n];
			double sum = 0;
			for (int i=0; i<n; i++) {
				ar[i] = sc.nextInt();
				sum += ar[i];
			}
			double avg = sum/(double)n;
			double bunsan = 0;
			for (int i=0; i<n; i++) {
				ar[i] -= avg;
				ar[i] = ar[i] * ar[i];
				bunsan += ar[i];
			}
			
			System.out.println(String.format("%.5f",Math.sqrt(bunsan/n)));
			
		}
		
	}
}
