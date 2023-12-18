import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {

	// 標準入力からデータを読み込む準備

	Scanner sc = new Scanner(System.in);

	// 2つの文字の固まりをそれぞれ整数値と想定して読み込む

	double r = sc.nextDouble();
	System.out.println(Math.PI);
	double area = Math.PI * r * r;
	double around = 2 * Math.PI * r;
	System.out.printf("%f %f\n", area, around);
	sc.close();
	
    }

}