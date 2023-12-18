class Main {
	public static void main(String[] args){

	java.util.Scanner scanner = new java.util.Scanner(System.in);
	double r = scanner.nextDouble();
	double pi = Math.PI;
	double s = pi*r*r;
	double l =  2*r*pi;
	String S = String.format("%.6f", s);
	String L = String.format("%.6f", l);
		System.out.println(S+" "+L);
		scanner.close();
	 }
}