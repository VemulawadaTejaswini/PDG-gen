import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] v = new double[n];
		
		Arrays.setAll(v, i -> sc.nextDouble());
		Arrays.sort(v);
		
		double ave = (v[0] + v[1]) / 2.0;
		for (int i = 2; i < n; i++) {
			ave = (ave + v[i]) / 2.0;
		}
		
		System.out.println(ave);
		
	}
}
