import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math.*;
import java.util.*;
import java.math.*;
import java.text.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(8);
        nf.setGroupingUsed(false);
        if(a > b || a == b) {
            
            //aのほうが大きい
            //S=1/2ab sin0;
            //h = bsin0
            //L = a + b + √a^2+b^2-2abcosθ 
            System.out.println(nf.format(1*a*b*Math.sin(Math.toRadians(c)) / 2));
            System.out.println(nf.format(a + b + Math.sqrt(Math.pow(a,2) + Math.pow(b,2) - 2 * a * b * Math.cos(Math.toRadians(c)))));
            System.out.println(nf.format(b * Math.sin(Math.toRadians(c))));
        }else {
            
        }
    }
}