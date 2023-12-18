import java.util.*;
import java.math.*;
import java.io.*;


public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
        String s = sc.next();
        int a = Integer.parseInt(s.substring(0,2));
        int b = Integer.parseInt(s.substring(2,4));
        boolean yymm = b <= 12 && b >= 1;
        boolean mmyy = a <= 12 && a >= 1;
        if(yymm && mmyy) System.out.println("AMBIGUOUS");
        else if(yymm) System.out.println("YYMM");
        else if(mmyy) System.out.println("MMYY");
        else System.out.println("NA");
    }
}