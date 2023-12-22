

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

        int n=gi();
        int m=gi();
        int c=gi();
        int[] B=new int[m];

      for (int j=0; j< m; j++) {
            	B[j]=gi();
        }
        int d=0;
        for (int i=0; i< n; i++) {
        	int s=0;
            for (int j=0; j< m; j++) {
              int a=gi();
            	s+=B[j]*a;
            }
            if(s+c>0) {
            	d++;
            }
        }
      
        
	    System.out.println(d);

//        if (s>L[n-2]) {
//        	System.out.println("Yes");
//        }else {
//        	System.out.println("No");
//        }
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