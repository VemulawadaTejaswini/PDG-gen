import java.util.*;
import java.util.Map.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int a = Integer.parseInt(String.valueOf(str.charAt(0)));
        int b = Integer.parseInt(String.valueOf(str.charAt(1)));
        int c = Integer.parseInt(String.valueOf(str.charAt(2)));
        int d = Integer.parseInt(String.valueOf(str.charAt(3)));
        
        if (a + b + c + d == 7) {System.out.println(String.valueOf(a) + "+" + String.valueOf(b) + "+" + String.valueOf(c) + "+" + String.valueOf(d) + "=7"); return;}
        if (a + b + c - d == 7) {System.out.println(String.valueOf(a) + "+" + String.valueOf(b) + "+" + String.valueOf(c) + "-" + String.valueOf(d) + "=7"); return;}
        if (a + b - c + d == 7) {System.out.println(String.valueOf(a) + "+" + String.valueOf(b) + "-" + String.valueOf(c) + "+" + String.valueOf(d) + "=7"); return;}
        if (a + b - c - d == 7) {System.out.println(String.valueOf(a) + "+" + String.valueOf(b) + "-" + String.valueOf(c) + "-" + String.valueOf(d) + "=7"); return;}
        if (a - b + c + d == 7) {System.out.println(String.valueOf(a) + "-" + String.valueOf(b) + "+" + String.valueOf(c) + "+" + String.valueOf(d) + "=7"); return;}
        if (a - b + c - d == 7) {System.out.println(String.valueOf(a) + "-" + String.valueOf(b) + "+" + String.valueOf(c) + "-" + String.valueOf(d) + "=7"); return;}
        if (a - b - c + d == 7) {System.out.println(String.valueOf(a) + "-" + String.valueOf(b) + "-" + String.valueOf(c) + "+" + String.valueOf(d) + "=7"); return;}
        if (a - b - c - d == 7) {System.out.println(String.valueOf(a) + "-" + String.valueOf(b) + "-" + String.valueOf(c) + "-" + String.valueOf(d) + "=7"); return;}
        
    }
}
