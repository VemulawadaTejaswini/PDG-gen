public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		java.util.Scanner scan = new java.util.Scanner(System.in);

		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double C = scan.nextDouble();

		double S, L, h;

		C = 2 * Math.PI * C / 360;
		h = b * Math.sin(C);

		S = a * h / 2;

		double c = Math.sqrt(
				Math.pow( a -  b * Math.cos(C), 2 ) + h*h );

		L = a + b + c;
		System.out.println(S);
		System.out.println(L);
		System.out.println(h);
	}

}