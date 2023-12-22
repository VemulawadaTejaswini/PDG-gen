import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		double r = sc.nextDouble();  // 半径
		double pi = Math.PI;

		double area = pi * r * r;  // 面積
		double length = 2.0 * pi * r;  // 円周の長さ
		//System.out.println(area + " " + length);
		System.out.printf("%.6f %.6f", area, length);
	}
}