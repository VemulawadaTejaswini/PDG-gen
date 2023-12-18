import java.util.Scanner;
import java.lang.Math;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		double length = 2*r*Math.PI; /* ここを変えて面積を求めよう */;
		double area = r*r*Math.PI; /* ここを変えて周囲の長さを求めよう */;
		System.out.printf("%f %f\n",area,length);
	}
}