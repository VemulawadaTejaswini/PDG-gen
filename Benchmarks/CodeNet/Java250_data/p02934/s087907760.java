import java.util.*;
import static java.lang.System.*;
import java.math.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] list = new double[n];
		for(int i = 0; i < n; i++)
			list[i] = sc.nextDouble();
		
		double sum = 0;
		for(int i = 0; i < n; i++) {
			double d = 1.0 / list[i];
			sum += d;
		}
		double ans = 1.0 / sum;
		out.println(ans);
	}
}