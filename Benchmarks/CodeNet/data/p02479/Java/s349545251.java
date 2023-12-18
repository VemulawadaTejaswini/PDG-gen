import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		double area = r * r * Math.PI;
		double length = 2 * r * Math.PI;
		System.out.println(area + " " + length);
	}

}