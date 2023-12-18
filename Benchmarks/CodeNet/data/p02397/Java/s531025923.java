import java.io.*;
import java.util.Scanner;
 
public class Main {
    public static String swap(int a, int b) {
        return b + " " + a;
    }
 
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // int x = sc.nextInt();
        // int y = sc.nextInt();
        // int r = sc.nextInt();
        System.out.println(swap());
    }
}
