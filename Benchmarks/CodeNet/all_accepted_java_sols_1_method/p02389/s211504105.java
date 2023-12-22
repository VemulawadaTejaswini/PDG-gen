import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		//データの読み込み
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//結果の計算
		int area = a * b;
		int length = (2 * a) + (2 * b);
		
		//結果を出力
		System.out.println(area + " " + length);
	}
}
