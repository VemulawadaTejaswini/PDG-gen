import java.util.*;
import java.io.*;

public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();
        int sum1;
        int sum2;
        int sum3;
        int min;
        // x=yのとき
        if (x == y) {
            sum1 = 2*c*x;
            sum2 = a*x + b*y;
            min = Math.min(sum1,sum2);
            System.out.println(min);
        }
        // x>yのとき
        if (x > y) {
            sum1 = 2*c*x;
            sum2 = 2*c*y + (x-y)*a;
            sum3 = a*x + b*y;
            min = Math.min(sum1,sum2);
            min = Math.min(min,sum3);
            System.out.println(min);
        }
        // x<yのとき
        if (x < y) {
            sum1 = 2*c*y;
            sum2 = 2*c*x + (y-x)*b;
            sum3 = a*x + b*y;
            min = Math.min(sum1,sum2);
            min = Math.min(min,sum3);
            System.out.println(min);
        }
    }
}