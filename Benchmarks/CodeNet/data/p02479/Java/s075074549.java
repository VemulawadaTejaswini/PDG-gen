import java.util.Scanner;
import java.lang.Math;
public class Main {
	public static void main(String[] args) { // 標準入力からデータを読み込む準備
		Scanner sc = new Scanner(System.in); // 2つの文字の固まりをそれぞれ整数値と想定して読み込む
		double r = sc.nextDouble(); 
		double area = 2*r*Math.PI; /* ここを変えて面積を求めよう */;
		double length = r*r*Math.PI; /* ここを変えて周囲の長さを求めよう */;
		System.out.printf("%f %f\n",area,length);
	}
}