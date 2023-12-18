

import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int A=gi();
	    int B=gi();
	    int C=gi();
	    int K=gi();
	    
	    while(K>0) {
	    	if(A>=B) {
	    		B=B*2;
	    	} else if(C<=B) {
	    		C=C*2;
	    	}
	    	K--;
	    }


	    if(A<B && B<C) {
	        System.out.println("Yes");
	    } else {
	    	System.out.println("No");
	    }
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