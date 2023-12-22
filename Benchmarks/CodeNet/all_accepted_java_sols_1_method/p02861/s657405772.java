import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		double length = 0;
		
		for (int i = 0; i < n; i++) {
			x[i] = scan.nextInt();
			y[i] = scan.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				length += Math.sqrt(Math.pow(x[i] - x[j], 2) + Math.pow(y[i] - y[j], 2));
			}
		}
		
		System.out.println(length / n);
		scan.close();
	}
}