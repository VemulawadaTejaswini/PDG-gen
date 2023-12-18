
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		
		double[] e = new double[n];
		double s = 0;
		for(int i = 0; i < k; i++) {
			e[i] = (scan.nextDouble()+1)/2;
			s += e[i];
		}
		
		double max = s;
		for(int i = k; i < n; i++) {
			e[i] = (scan.nextDouble()+1)/2;
			s += e[i]-e[i-k];
			if(s > max) {
				max = s;
			}
		}
		
		System.out.println(max);
		

	}

}