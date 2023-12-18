

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int n=gi();
	    String[] S = new String[n];
        //String s=gs();
	    
	    int ac=0;
	    int wa=0;
	    int tle=0;
	    int re=0;
	    for (int i=0; i<n; i++) {
	    	S[i]=gs();
	    	if (S[i].equals("AC")) {
	    		ac++;
	    	} else if (S[i].equals("WA")) {
	    		wa++;
	    	} else if (S[i].equals("TLE")) {
	    		tle++;
	    	} else if (S[i].equals("RE")) {
	    		re++;
	    	}
	    }
        
	    
	    System.out.println("AC x "+ac);
	    System.out.println("WA x "+wa);
	    System.out.println("TLE x "+tle);
	    System.out.println("RE x "+re);
//	    if (isNumber(s1) && isNumber(s2) && s.charAt(a) == '-') {
//	    	System.out.print("Yes");
//	    }else {
//	    	System.out.print("No");
//	    }



	}

	public static int d(int n) {
		int m=0;
		while(true) {
			if(n<1) {
				break;
			}
			int l= n%10;
			m+=l;
			n= (n-l)/10;
		}
		return m;
	}
	public static long d(long n) {
		String a=String.valueOf(n);
		return (long)a.length();
	}

	// 文字列として入力を取得
	public static String gs() {
		return scanner.next();
	}

	// intとして入力を取得
	public static int gi() {
		return Integer.parseInt(scanner.next());
	}

	// longとして入力を取得
	public static long gl() {
		return Long.parseLong(scanner.next());
	}

	// doubleとして入力を取得
	public static double gd() {
		return Double.parseDouble(scanner.next());
	}
}