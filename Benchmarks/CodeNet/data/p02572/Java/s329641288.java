import java.util.*;

 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] a = new double[n];
		long sum = 0;
		for(int i = 0; i < n; i ++){
			a[i] = sc.nextDouble();
		}
		for(int i = 0; i < n; i ++){
			for(int j = i + 1; j < n; j ++){
				sum += a[i] * a[j];
			}
		}
		System.out.println((int)(sum % (Math.pow(10, 9) + 7)));

	}
}