

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
	    int[] W=new int[N];

        for(int i=0; i<N; i++) {
        	W[i]=gi();
        }

        int min=Integer.MAX_VALUE;        
        for (int i=1; i<N; i++) {
        	int T=i;
        	int b=0;
        	int a=0;
        	for (int j=0; j<i; j++) {
        		b+=W[j];
        	}
        	for (int j=i; j<N; j++) {
        		a+=W[j];
        	}
        	int z=Math.abs(b-a);
        	if(z<min) {
        		min=z;
        	}
        }
        

        System.out.print(min);

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