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
			if (n == 0) break;
			
			int[] ar = new int[10];
			for (int i=0; i<n; i++) ar[sc.nextInt()]++;
			
			for (int i=0; i<10; i++) {
				if (ar[i] == 0) out.println("-");
				else {
					for (int j=0; j<ar[i]; j++) {
						out.print("*");
					}
					out.println();
				}
			}
		}
	}
	//------------------------------------------------------------
}
