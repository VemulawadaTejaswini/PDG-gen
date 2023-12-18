import java.util.*;

public class Main {
	public static void main(String[] args) {

		double r,C,A;
		
		Scanner sc = new Scanner(System.in);

		r = sc.nextDouble();

		A =  Math.PI * Math.pow(r,2);
		C = 2 * r *Math.PI; 

		System.out.printf("%.6f %.6f\n", A, C);
	}
}