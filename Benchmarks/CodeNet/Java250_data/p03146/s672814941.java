

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

        int s=gi();
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        m.put(s,1);
        int i=1;
        while(true) {
        	i++;
        	if (s%2 ==0) {
        		s=s/2;
        	} else {
        		s=3*s+1;
        	}
        	if(m.containsKey(s)) {
        		break;
        	}
        	m.put(s,1);
        	
        }
	    System.out.println(i);

//        if (min==Integer.MAX_VALUE) {
//        	System.out.println("TLE");
//        }else {
//        	System.out.println(min);
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