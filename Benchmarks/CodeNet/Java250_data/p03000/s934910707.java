

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    int X=gi();
	    int[] L=new int[N];

        for(int i=0; i<N; i++) {
        	L[i]=gi();
        }

        int c=1;   
        int d=0;
        for (int i=0; i<N; i++) {
        	d=d+L[i];
        	if(d>X) {
        		break;
        	}
        	c++;
        }
        

        System.out.print(c);

//        if (b>=1 && b<=12) {
//        	if(a>=1 && a<=12) {
//        	    System.out.println("AMBIGUOUS");
//        	} else {
//        		System.out.println("MMYY");
//        	}
//        }else {
//        	if(a>=1 && a<=12) {
//        	    System.out.println("YYMM");
//        	} else {
//        		System.out.println("NA");
//        	}
//        }
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