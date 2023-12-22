import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintStream out = new PrintStream(System.out);
        int r, g, b;

        r = sc.nextInt();
        g = sc.nextInt();
        b = sc.nextInt();

        if ((g*10+b)%4 == 0) {
            out.println("YES");
        } else {
            out.println("NO");
        }
        
        
        sc.close();
    }
}