

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

        int N=gi();
        int T=gi();
        
        int min=Integer.MAX_VALUE;
        for(int i=0; i<N;i++) {
        	int c=gi();
        	int t=gi();
        	if (t<=T && min>c) {
        		min = c;
        	}
        }
	    //System.out.println(min);
	    
        if (min==Integer.MAX_VALUE) {
        	System.out.println("TLE");
        }else {
        	System.out.println(min);
        }
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