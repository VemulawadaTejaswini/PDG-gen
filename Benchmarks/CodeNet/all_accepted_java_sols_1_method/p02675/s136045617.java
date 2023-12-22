import java.util.*;
import java.io.*;
 
public class Main {
    public static void main (final String[] args) {
        final Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        char last = str.charAt(n-1);
        
        if (last == '3') System.out.println("bon");
        else if (last == '0' || last == '1' || last == '6' || last == '8') System.out.println("pon");
        else System.out.println("hon");
        
    }
}