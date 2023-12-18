import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//変数の宣言
		double r;
		double Area,Length;
		//値の入力
		//System.out.println("Please input r:");
		Scanner sc = new Scanner(System.in);
		r=sc.nextDouble();
		//計算
		Area=Math.PI*r*r;
		Length=2*Math.PI*r;
		//結果の表示
		System.out.println(String.format("%08f", Area)+" "+String.format("%08f", Length));
	}
}

