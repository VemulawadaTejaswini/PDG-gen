public class Main {
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		String str1 = in.next();
		double r = java.lang.Double.parseDouble(str1);
		System.out.println(String.format("%.6f", 2*r*Math.PI) + " " + String.format("%.6f", r*r*Math.PI));
	}
}