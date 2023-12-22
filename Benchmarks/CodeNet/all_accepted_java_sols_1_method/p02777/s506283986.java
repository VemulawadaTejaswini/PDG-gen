import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.next(), s2 = scan.next();
        int a = scan.nextInt(), b = scan.nextInt();
        String s3 = scan.next();
        if (s3.equals(s1))
            a --;
        else
            b --;
        System.out.println(a + " " + b);
    }
}
