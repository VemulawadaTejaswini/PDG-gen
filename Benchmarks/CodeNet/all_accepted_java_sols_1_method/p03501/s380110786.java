import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, a, b;
        n = Integer.parseInt(sc.next());
        a = Integer.parseInt(sc.next());
        b = Integer.parseInt(sc.next());
        
        int num = n * a;
        System.out.println(Math.min(num, b));

        sc.close();
    }
}