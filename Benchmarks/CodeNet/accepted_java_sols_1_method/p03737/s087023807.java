import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintStream out = new PrintStream(System.out);
        String s1, s2, s3;
        char l1, l2, l3;

        s1 = sc.next();
        s2 = sc.next();
        s3 = sc.next();

        l1 = s1.toUpperCase().charAt(0);
        l2 = s2.toUpperCase().charAt(0);
        l3 = s3.toUpperCase().charAt(0);

        out.println(""+l1+l2+l3);
        
        sc.close();
    }
}