import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		double area = r * r * Math.PI;
		double cir = r*2 * Math.PI;
		System.out.printf("%f %f",area, cir);
	}
}