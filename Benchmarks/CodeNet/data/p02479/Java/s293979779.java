import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		double r = sc.nextDouble();  // 半径
		double pi = Math.PI;

		double area = r * r * pi;  // 面積
		double length = 2.0 * r * pi;  // 円周の長さ
		System.out.println(area + " " + length);
	}
}