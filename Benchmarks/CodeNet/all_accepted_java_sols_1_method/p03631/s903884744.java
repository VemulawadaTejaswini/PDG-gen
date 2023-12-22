import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.StringTokenizer;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int a1=a/100;
    int a2=(a-a1*100)/10;
    int a3=a - a1*100 -a2*10;
   
    if (a3==a1) {
    	System.out.println("Yes");
    } else {
    	System.out.println("No");
    }
     
                    
    
    }
}