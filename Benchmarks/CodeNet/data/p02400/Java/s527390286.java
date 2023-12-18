import java.util.Scanner;

public class Main{
	
	public static void main(String[] args){
		
		//テキスト入力クラス
		Scanner sc = new Scanner(System.in);
		
		//半径
		double radius = sc.nextInt(); 
		//面積
		double area = radius*radius*Math.PI;
		//周の長さ
		double circuit = radius*2*Math.PI;
		
		System.out.print(area+" "+circuit);
		
	}

}