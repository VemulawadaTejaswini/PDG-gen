import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		double al = 0;
		for(;;){
			double n = scan.nextDouble();
			if(n == 0){
				break;
			}
			Double[] s = new Double[(int) n];
			double sum = 0;
			for(int i = 0; i < n; i++){
				s[i]  = scan.nextDouble();
				sum += s[i];
			}
			double m = sum / n;
			double a1 = 0;
			for(int i = 0; i < n; i++){
				a1 += Math.pow(s[i] - m, 2);
			}
			al = Math.sqrt(a1 / n);
		}
		System.out.printf("%f\n", al);
	}
}