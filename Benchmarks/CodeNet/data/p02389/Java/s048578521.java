import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		//テキスト入力クラス
		Scanner sc = new Scanner(System.in);
		
		//入力された横と縦の値
		int width = sc.nextInt();
		int height = sc.nextInt();
		
		//周の長さを調べる
		int circumference = (width*2+height*2);
		
		//面積を調べる
		int area_size = (width*height);
		
		//出力
		System.out.println(circumference+" "+area_size);
	}
}