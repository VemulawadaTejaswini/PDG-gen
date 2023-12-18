
class Main {
	public static void main(String[] args){
		java.util.Scanner scn = new java.util.Scanner(System.in);
		double r = scn.nextDouble();
		System.out.printf("%f %f\n", r * r * Math.PI, r * 2 * Math.PI);
		scn.close();
	}
}