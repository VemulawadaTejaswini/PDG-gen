import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double r = s.nextDouble();
		double a = r*r*Math.PI;
		String c = String.format("%.6f",a);
		double b = r*2*Math.PI;
		String d = String.format("%.6f",b);
		
		System.out.println(c+" "+d);
	}
}