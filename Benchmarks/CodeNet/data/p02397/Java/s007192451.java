import java.io.*;
import java.util.Scanner;
 
public class Main {
    public static void print() {
        Scanner sc = new Scanner(System.in);
        int a, b;
        while (true) {
            a = sc.nextInt();
            b = sc.nextInt();
 
            if(a == 0 && b == 0)break;
            System.out.println("" + Math.min(a,b), + " " + Math.max(a,b));
        }
    }
 
    public static void main (String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int W = sc.nextInt();
        // int H = sc.nextInt();
        // int x = sc.nextInt();
        // int y = sc.nextInt();
        // int r = sc.nextInt();
        print();
    }
}
