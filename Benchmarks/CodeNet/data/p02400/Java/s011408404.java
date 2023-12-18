
//スキャナークラスをインポート
import java.util.Scanner;


/**
 * 円の面積と円周の長さを求める
 */
 
 
class Main{
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		//小数点を使うのでdoubleにする
		double r = sc.nextDouble();
		
		
		//Math.PIは円周率(3.14)
		System.out.printf("%.6f %.6f",r * r * Math.PI, (r + r) * Math.PI);
		 
		
	}
	
}	


