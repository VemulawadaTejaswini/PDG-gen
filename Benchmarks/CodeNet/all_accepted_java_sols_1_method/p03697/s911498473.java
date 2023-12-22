import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintStream out = new PrintStream(System.out);
        int a, b;

        a = sc.nextInt();
        b = sc.nextInt();

        out.println((a+b < 10)? a+b: "error");
        
        sc.close();
    }
}