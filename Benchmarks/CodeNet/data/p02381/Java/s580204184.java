import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Double> stdDev = new ArrayList<>();
		while(true) {
			int n = sc.nextInt();
			if(n == 0) {
				break;
			}
			double[] num = new double[n];
			for(int i = 0; i < n; i++) {
				num[i] = sc.nextDouble();
			}
			stdDev.add(sd(num));
		}
		for(double value: stdDev) {
			System.out.println(value);
		}
	}

	public static double sd(double[] num) {
		double sum = 0;
		for(double value: num) {
			sum += value;
		}
		double mean = sum / num.length;
		
		double sd = 0;
		for(double value: num) {
			sd += Math.pow(value - mean, 2);
		}
		sd = Math.sqrt(sd / num.length);
		return sd;
	}
}

