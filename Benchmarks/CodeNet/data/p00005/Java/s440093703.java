import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    /* Euclid???????????? */
    public static long gcd(long a, long b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }
    public static void main(String[] args) throws IOException {
       Scanner in = new Scanner(System.in);
       while (in.hasNextInt()) {
           long a = in.nextInt();
           long b = in.nextInt();

           long gcd = gcd(a, b);
           long lcm = Math.abs(a*b) / gcd;
           System.out.println(""+gcd+" "+lcm);
       }
    }
}