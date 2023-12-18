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
		
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			
			char[] train = new char[200];
			Arrays.fill(train,'-');
			int pos = 100;
			
			String s = sc.next();
			train[pos] = s.charAt(0);
			
			for (int j=1; j<s.length();) {
				char c1 = s.charAt(j); j++;
				char c2 = s.charAt(j); j++;
				char car = s.charAt(j); j++;
				
				if (c1=='-' && c2=='>') {
					pos++;
					train[pos] = car;
				}
				else {
					pos--;
					train[pos] = car;
				}
			}
			
			for (int k=50; k<150; k++) {
				if (train[k]!='-') out.print(train[k]);
			}
			out.println();
		}

		
	}
	//------------------------------------------------------------
}
