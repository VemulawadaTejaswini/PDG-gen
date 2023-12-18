
import java.util.Scanner;


public class Main {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();
        double min = h * 60 + m;
        double ar = min * 0.5;
        double br = m * 6;
        double rad = Math.abs(ar - br);
        double cos = Math.cos(Math.toRadians(rad));
//        System.out.println(ar + "ar");
//        System.out.println(br + "br");
//        System.out.println(rad + "rad");
//        System.out.println(cos + "cos");
        double ans = a * a + b * b - (2 * a * b * cos); 
        System.out.println(Math.sqrt(ans));
        sc.close();
    }   
}
