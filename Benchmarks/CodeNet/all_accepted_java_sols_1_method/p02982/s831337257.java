import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int d = scan.nextInt();
		double[][] point = new double[n][d];
		double[][] y = new double[n][d];

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < d; j++) {
				point[i][j] = scan.nextDouble();
			}
		}

		int count = 0;
		for(int i = 0; i < n - 1; i++) {
			for(int j = i + 1; j < n; j++) {
				double dist = 0;
				for(int k = 0; k < d; k++) {
					dist += Math.pow((point[i][k] - point[j][k]), 2);
				}
				dist = Math.sqrt(dist);
				if(dist == Math.floor(dist)) {
					count++;
				}
			}
		}
		System.out.println(count);
 	}
}