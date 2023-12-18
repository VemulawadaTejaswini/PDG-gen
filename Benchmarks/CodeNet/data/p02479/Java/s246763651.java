class Main {
	public static void main(String args[]){

		Scanner scan= new Scanner(System.in);
		double r = scan.nextDouble();
		double S = r*r*Math.PI;
		double L = r*2*Math.PI;
		System.out.printf("%.6f %.6f",S,L);
	}
}