import java.util.Scanner;
import java.lang.Math;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		double area = r * r * Math.PI;
		double len = 2 * r * Math.PI;
		System.out.println(String.format("%.6f" + " " + "%.6f",area,len));
		
	}

}

