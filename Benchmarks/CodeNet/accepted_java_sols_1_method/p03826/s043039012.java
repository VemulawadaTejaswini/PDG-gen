import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintStream out = new PrintStream(System.out);
        int A, B, C, D;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        if(A*B > C*D) {
            out.println(A*B);
        } else {
            out.println(C*D);
        }

        sc.close();
    }
}