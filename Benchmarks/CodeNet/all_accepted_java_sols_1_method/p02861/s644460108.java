import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		double avg = 0;
		double[] x = new double[n];
		double[] y = new double[n];

		for(int i = 0; i < n; i++) {
			x[i] = scan.nextDouble();
			y[i] = scan.nextDouble();
		}

		double sum = 0;
		//全ての辺の長さの総和
		for(int i = 0; i < n - 1; i++) {
			for(int j = i+1; j < n; j++) {
				sum += Math.pow((x[i] - x[j])*(x[i] - x[j]) + (y[i] - y[j])*(y[i] - y[j]), 0.5);
			}
		}
		
		avg = sum * 2 / n;

		System.out.println(avg);

	}

}
