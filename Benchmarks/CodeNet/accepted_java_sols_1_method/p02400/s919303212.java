import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double r = sc.nextDouble();
		double pi = 3.141592653589;
		
		double cir = 2 * r * pi;
		double area = r * r * pi;
		
		System.out.printf("%.6f" + " ", area);
		System.out.printf("%.6f", cir);
	}
}
