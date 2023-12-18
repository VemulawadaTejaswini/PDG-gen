import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		long k = sc.nextLong();
		int[] a = new int[s.length()];
		int c = 0;
		a[c]++;

		for (int i = 0; i < s.length() - 1 ; i++ ) {
			if ( s.charAt(i) != s.charAt(i+1) ) {
				c++;
			}
			a[c]++;
		}

		if ( c == 0 ) {
			// 全部同じ文字	
			long d = (long)s.length() * k / 2l ;
			System.out.println(d);
			System.exit(0);
		}

		long ct = 0;
		for (int i = 1; i < c ; i++ ) {
			ct = ct + ( (long)a[i] / 2l ) * k ;
		}

		if ( s.charAt(0) == s.charAt(s.length()-1) ) {
			// 先頭＝終端なら、k-1回は連結で計算	
			ct = ct + ( ((long)a[0]+(long)a[c]) / 2l ) * (k-1) ;
			// 1回は別個に計算	
			ct = ct + (long)a[0] / 2l ;
			ct = ct + (long)a[c] / 2l ;
		} else {
			// 先頭≠終端なら、k回とも別個に計算	
			ct = ct + ( (long)a[0] / 2l ) * k ;
			ct = ct + ( (long)a[c] / 2l ) * k ;
		}
		// 出力
		System.out.println(ct);
	}
}