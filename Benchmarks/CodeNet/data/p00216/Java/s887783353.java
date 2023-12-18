import java.math.*;
import java.util.*;
import static java.lang.System.*;

public class Main {
	//初期フィールド・メソッド---------------------------------------------
	static Scanner sc = new Scanner(System.in);
	static int min(int... ar) {Arrays.sort(ar); return ar[0];}
	static int max(int... ar) {Arrays.sort(ar); return ar[ar.length-1];}
	//------------------------------------------------------------


	//フィールド追加場所-----------------------------------------------
	//------------------------------------------------------------


	//メソッド追加場所------------------------------------------------
	//------------------------------------------------------------


	//mainメソッド---------------------------------------------------
	public static void main(String[] args) {
		while (true) {
			int n = sc.nextInt();
			if (n == -1) break;
			
			int cost = 1150;
			if (n > 10) {
				cost += Math.min( 1250 , (n-10)*125 );
			}
			if (n > 20) {
				cost += Math.min( 1400 , (n-20)*125 );
			}
			if (n > 30) {
				cost += (n-30)*160;
			}
			
			out.println(4280-cost);
		}
	}
	//------------------------------------------------------------
}
