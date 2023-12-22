import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		double C = Math.PI*stdIn.nextInt()/180;
		double S = a*b*Math.sin(C)/2;
		double c = Math.pow(Math.pow(a,2)+Math.pow(b,2)-2*a*b*Math.cos(C),(double)1/2);
		double L = a + b + c;
		double h = Math.sin(C)*b;
		System.out.printf("%.5f\n",S);
		System.out.printf("%.5f\n",L);
		System.out.printf("%.5f\n",h);
	}
}