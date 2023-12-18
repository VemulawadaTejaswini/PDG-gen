import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner (System.in)){
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double C = sc.nextDouble();
			
			C = Math.toRadians(C);

			double S,L,h;

			S = 0.5*a*b*Math.sin(C);
			L = a + b + Math.sqrt(Math.pow(a,2)+Math.pow(b,2)-(2*a*b*Math.cos(C)));
			h = b*Math.sin(C);

			System.out.printf("%.8f\n",S);
			System.out.printf("%.8f\n",L);
			System.out.printf("%.8f\n",h);
		}
	}
}

