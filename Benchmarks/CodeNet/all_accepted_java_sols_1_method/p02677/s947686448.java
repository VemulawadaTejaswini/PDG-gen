import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(), B = sc.nextInt();
        int H = sc.nextInt(), M = sc.nextInt();
        
        double theta = (double)2 * Math.PI * ((double)M / 60.0 - ((60.0 * (double)H + M) / 720.0));
        
        double sqr = Math.sqrt((double)(A*A + B * B) - 2 * (double)(A * B) * Math.cos(theta));
        
        System.out.println(sqr);
    }
}