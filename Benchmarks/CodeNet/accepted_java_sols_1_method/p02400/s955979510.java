import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		//半径を入力
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		
		//結果を計算
		double area = r * r * Math.PI;
		double length = 2.0 * r * Math.PI;
		
		//結果を出力
		System.out.printf("%f %f",area,length);
	}
}
