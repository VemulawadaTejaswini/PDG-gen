import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.Collections;
import java.math.BigDecimal;
import java.util.LinkedList;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        String s = sc.next();
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            String cmd = sc.next();
            switch (cmd) {
            case "print":
                print(s, sc.nextInt(), sc.nextInt());
                break;
            case "reverse":
                s = reverse(s, sc.nextInt(), sc.nextInt());
                break;
            case "replace":
                s = replace(s, sc.nextInt(), sc.nextInt(), sc.next());
                break;
            }
        }
    }
    
    static void print(String s, int a, int b) {
        System.out.println(s.substring(a, b+1));
    }
    
    static String reverse(String s, int a, int b) {
        StringBuilder sb = new StringBuilder();
        for (int i = b; i >= a; i--) {
            sb.append(s.substring(i, i+1));
        }
        return s.substring(0, a) + sb.toString() + s.substring(b+1, s.length());
    }
    
    static String replace(String s, int a, int b, String p) {
        return s.replace(s.substring(a, b+1), p);
    }
}