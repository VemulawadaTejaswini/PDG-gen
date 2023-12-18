import java.util.Scanner;
public class Main {
	public static double nijou(double d) {
		return d * d;
	}
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		double[] num = new double[n];
		double sum, ave;
		sum = 0;
		for(int i = 0; i < num.length; i++) {
			num[i] = sc.nextDouble();
			sum += num[i];
		}

		ave = sum / n;

		sum = 0;
		for(int i = 0; i < n; i++)
			sum += nijou(num[i] - ave);

		System.out.printf("%.8f\n", Math.sqrt(sum / n));
	}
}