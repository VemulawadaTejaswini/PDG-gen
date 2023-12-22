import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		double r = sc.nextDouble();
		double a = r*r*Math.PI;
		double b = 2*r*Math.PI;
		String menseki = String.format("%.6f",a);
		String enshuu = String.format("%.6f",b);
		System.out.println(menseki+" "+enshuu);
	}
}

