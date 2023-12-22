import java.io.*;
import java.util.Scanner;
 
public class Main {
    public static int divisors(int a, int b, int c) {
        int count = 0;
        if (b >= c && a <= c) count++;

        b = Math.min(b, c / 2);
        for (int i = a; i <= b; i++) {
            if (c % i == 0) count++;
        }
        return count;
    }
 
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // int y = sc.nextInt();
        // int r = sc.nextInt();
        System.out.println(divisors(a,b,c));
    }
}
