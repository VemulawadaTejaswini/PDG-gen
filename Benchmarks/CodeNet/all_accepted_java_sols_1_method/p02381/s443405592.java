import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			double[] score = new double[n];
			double sum = 0.0;

			for(int i = 0; i < n; i++){
				score[i] = sc.nextDouble();
				sum += score[i];
			}
			double m = sum / n;
			sum = 0.0;
			for(int j = 0; j < n; j++){
				sum += Math.pow((score[j] - m), 2);
			}
			System.out.printf("%.8f\n", Math.sqrt(sum / n));
		}
	} 

}
