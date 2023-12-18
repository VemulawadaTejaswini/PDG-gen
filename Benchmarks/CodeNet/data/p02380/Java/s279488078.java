public class Main {
	public static void main(String[] args){
		java.util.Scanner scan = new java.util.Scanner(System.in);
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();

		double S,L,h;

		S = a*b*Math.sin(Math.toRadians(c))/2;
		System.out.println(S);

		L = a+b+Math.sqrt(a*a+b*b-a*b*Math.cos(Math.toRadians(c)));
		System.out.println(L);

		h = 2*S/a;
		System.out.println(h);
	}

}