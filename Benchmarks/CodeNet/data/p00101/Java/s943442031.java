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
		int n = sc.nextInt(); sc.nextLine();
		
		for (int i=0; i<n; i++) {
			String s = sc.nextLine();
			
			String[] ar = s.split(" ");
			
			for (int j=0; j<ar.length; j++) {
				if (ar[j].equals("Hoshino")) ar[j] = "Hoshina";
				out.print((j==0?"":" ")+ar[j]);
			}
			
			out.println();
			
		}
	}
	//------------------------------------------------------------
}
