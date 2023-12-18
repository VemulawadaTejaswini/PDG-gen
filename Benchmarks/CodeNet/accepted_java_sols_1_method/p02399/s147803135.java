
//スキャナークラスをインポート
import java.util.Scanner;


/**
 * 割り算の結果と余りと小数点を出力
 */
 
 
class Main{
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
			
		System.out.print( a / b +" " );
		System.out.print( a % b + " ");
		//intからdoubleにキャスト
		//String.formatで
		System.out.println(String.format("%.5f", (double)a/(double)b));

	}
}
