import java.io.*;
import java.util.Scanner;
 
public class Main {
    public static String sort(int a, int b, int c) {
        if (a <= b) {
            if (b <= c) {
                return "" + a + b + c;
            } else if (a <= c) {
                return "" + a + c + b;
            } else {
                return "" + c + a + b;
            }
        } else {
            if (b > c) {
                return "" + c + b + a;
            } else if (a <= c) {
                return "" + b + a + c;
            } else {
                return "" + b + c + a;
            }
        }
    }
 
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(sort(a,b,c));
    }
}
