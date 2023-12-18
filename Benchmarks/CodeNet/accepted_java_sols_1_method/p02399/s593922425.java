import java.io.*;
import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int d,r;
        double f;
        d = a / b;
        r = a % b;
        f = (double)a / b;
        System.out.printf("%d %d %f", d, r, f);
    }
}
