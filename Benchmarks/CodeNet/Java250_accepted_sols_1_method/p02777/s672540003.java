import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        int c = sc.nextInt();
        int d = sc.nextInt();

        String e = sc.next();

        if (e.equals(a))
            System.out.println((c - 1) + " " + d);
        else
            System.out.println(c + " " + (d - 1));
    }
}
