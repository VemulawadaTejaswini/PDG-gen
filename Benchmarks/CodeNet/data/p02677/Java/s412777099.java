import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int h = sc.nextInt();
		int m= sc.nextInt();
		double lhand = Math.toRadians(6*m);
		double shand = Math.toRadians(30*h);
		double x = 2*a*b*Math.cos(Math.abs(lhand-shand));
		double ans = Math.sqrt(Math.pow(a, 2)+Math.pow(b,2)-x);
		System.out.println(String.format("%.9f", ans));

	}

}
