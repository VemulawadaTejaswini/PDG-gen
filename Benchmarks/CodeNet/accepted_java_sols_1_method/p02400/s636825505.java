import java.util.Scanner;	//Scannerクラス：Java標準入力を取得する


public class Main{
	public static void main(String[] args){		//メソッド宣言
		double r;				//
		double a;
		double c;

		try(Scanner sc = new Scanner(System.in)){
			r = sc.nextDouble();

			c = 2 * r * Math.PI;
			a = r * r * Math.PI;

			System.out.println(String.format("%.8f %.8f",a,c));
		}
	}
}



