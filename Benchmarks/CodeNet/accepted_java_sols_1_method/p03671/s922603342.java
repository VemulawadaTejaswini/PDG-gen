import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintStream out = new PrintStream(System.out);
        int a, b, c, min;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        min = a + b;
        if (min > a + c) {
            min = a + c;
        }
        if (min > b + c) {
            min = b + c;
        }
        
        out.println(min);
        sc.close();
    }
}