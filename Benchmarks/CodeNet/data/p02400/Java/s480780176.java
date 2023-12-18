import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        circle(r);
    }
    public static void circle(double r){
    
        System.out.printf("%.6f %.6f", r*r*Math.PI, r*2*Math.PI);
    }
}
