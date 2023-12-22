
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.StringTokenizer;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        String c1 = String.valueOf(c.charAt(0));
        String c2 = String.valueOf(c.charAt(1));
        String c3 = String.valueOf(c.charAt(2));
        
        c1=change19(c1);
        c2=change19(c2);
        c3=change19(c3);
        
    	System.out.println(c1 + c2 + c3);   
    
    }
    private static String change19(String str) {
    	if ("1".equals(str)) {
    		str="9";
    	} else if ("9".equals(str)) {
    		str="1";
    	}
    	
    	return str;
    }
}