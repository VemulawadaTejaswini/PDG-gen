import java.util.*;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double m = 0.0, a = 0.0;
		int n;
		while((n = sc.nextInt()) != 0){
			double[] s = new double[n];
			for(int i = 0; i < n; i++){
				s[i] = sc.nextInt();
				m += s[i];
			}
			m /= (double)n;
			for(int i = 0; i < n; i++){
				a += (s[i] - m)*(s[i] - m);
			}
			a /= (double)n;
			System.out.printf("%.8f\n", Math.sqrt(a));
		}
	}
}