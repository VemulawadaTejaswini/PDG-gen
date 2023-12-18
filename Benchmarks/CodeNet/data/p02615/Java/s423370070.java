

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

        int n=gi();
        int[] A =new int[n];
        int[] A2 =new int[n];
        LinkedList<Integer> B =new LinkedList<Integer>();

        for (int i=0; i<n; i++) {
        	A[i]=gi();
        }

        Arrays.sort(A);
        for (int i=0; i<A.length;i++) {
        	A2[i]=A[n-i-1];
        }

        long m=0;
        B.add(A2[0]);
        for (int i=1; i<n;i++) {
        	int co=A2[i];
        	long mk=B.pollFirst();
        	B.add(co);
        	B.add(co);
        	m+=mk;
        }

	    System.out.println(m);

//	    if (isNumber(s1) && isNumber(s2) && s.charAt(a) == '-') {
//	    	System.out.print("Yes");
//	    }else {
//	    	System.out.print("No");
//	    }



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