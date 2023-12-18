import java.util.Scanner;


class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double r = scan.nextDouble();
		double a = r * r * 3.141592653589;
		double b = r * 2 * 3.141592653589;
		System.out.println(String.format("%.6f",a) + " " + String.format("%.6f",b));
	}
}
