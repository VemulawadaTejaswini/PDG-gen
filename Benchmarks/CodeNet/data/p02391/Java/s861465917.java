import java.io.*;
import java.util.Scanner;
 
public class Main {
    public static String compare(int a, int b) {
        if (a > b) return "a > b";
        if (a == b) return "a == b";
        return "a < b";
    }
 
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(compare(a, b));
    }
}
