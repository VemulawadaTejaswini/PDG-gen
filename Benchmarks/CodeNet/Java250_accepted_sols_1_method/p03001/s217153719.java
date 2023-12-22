import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double w = sc.nextDouble();
		double h = sc.nextDouble();
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double area = w * h / 2;
		int mult = 0;
		if(x * 2 == w && y * 2 == h) mult++;
		System.out.println(area + " " + mult);
	}
}
