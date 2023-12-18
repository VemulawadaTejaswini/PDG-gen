import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextInt();
        long b = sc.nextInt();

        long c = (b*b)-(a*a);
        long d = 2*b-2*a;

        if (c%d == 0)
            System.out.println(c/d);
        else
            System.out.println("IMPOSSIBLE");
    }
}
