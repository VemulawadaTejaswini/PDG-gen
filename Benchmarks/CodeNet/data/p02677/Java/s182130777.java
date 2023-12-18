import java.util.Scanner;
import  java.math.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            double a = sc.nextInt();
            double b = sc.nextInt();
            double c = sc.nextInt();
            double d = sc.nextInt();
            double e  = Math.toRadians(90);
    e=Math.cos(e);

            System.out.printf("%.20f",Math.sqrt(a*a+b*b-a*b*2*e));
        }
    }
}
