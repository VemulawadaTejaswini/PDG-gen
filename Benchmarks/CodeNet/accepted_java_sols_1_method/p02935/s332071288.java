import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.valueOf(in.nextLine());
		double[] v = new double[n];
		for(int i = 0; i < n; i++)
			v[i] = Double.valueOf(in.next());

		Arrays.sort(v);
		double sum = v[0];
		for(int i = 1; i < n; i++)
			sum = (sum + v[i]) / 2;
		System.out.println(sum);
		
	}
}