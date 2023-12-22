import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintStream out = new PrintStream(System.out);

        long a, b, x, num;

        a = sc.nextLong();
        b = sc.nextLong();
        x = sc.nextLong();

        num = b/x - a/x;

        if (a%x == 0) {
            num++;
        }
        
        out.println(num);
        sc.close();
    }
}