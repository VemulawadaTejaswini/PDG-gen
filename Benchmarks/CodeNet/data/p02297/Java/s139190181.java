import java.util.Scanner;
public class Main {
	static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x[] = new int[n];
		int y[] = new int[n];
		for (int i=0; i<n; i++){
			x[i] = sc.nextInt()-x[0];
			y[i] = sc.nextInt()-y[0];
		}
		double area = 0;
		for (int k = 1; k<n-1; k++){
			area += x[k]*y[k+1]-x[k+1]*y[k];
		}
		System.out.printf("%.1f\n", Math.abs(area*0.5));
	}
}