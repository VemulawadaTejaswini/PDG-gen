import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		double b = sc.nextInt();
		double h = sc.nextInt();
		double m = sc.nextInt();
		double ax, ay, bx, by, arad, brad;
		arad = (1/2 - h/6 - m/360)*Math.PI;
		brad = (1/2 - m/30)*Math.PI;
		ax = a * Math.cos(arad);
		bx = b * Math.cos(brad);
		ay = a * Math.sin(arad);
		by = b * Math.sin(brad);
		System.out.println(Math.sqrt((ax-bx)*(ax-bx)+(ay-by)*(ay-by)));
	}
}
