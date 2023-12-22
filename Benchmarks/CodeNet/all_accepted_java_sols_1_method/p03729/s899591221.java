import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintStream out = new PrintStream(System.out);
        String A, B, C;

        A = sc.next();
        B = sc.next();
        C = sc.next();

        if (A.charAt(A.length()-1) == B.charAt(0) && B.charAt(B.length()-1) == C.charAt(0)) {
            out.println("YES");
        } else {
            out.println("NO");
        }
        
        
        sc.close();
    }
}