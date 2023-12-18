import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int a = Integer.parseInt(s.substring(0,2));
        int b = Integer.parseInt(s.substring(2,4));

        if ( (a>=1) && (a<=12) && (b>=1) && (b<=12) )
            System.out.println("AMBIGUOUS");
        else if ( (a>=1) && (a<=12) && ( (b==0) || (b>12) ) )
            System.out.println("MMYY");
        else if ( (b>=1) && (b<=12) && ( (a==0) || (a>12) ) )
            System.out.println("YYMM");
        else
            System.out.println("NA");
    }
}