import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        var sc = new Scanner(System.in);
    
        double a = Double.parseDouble(sc.next());
        double b = Double.parseDouble(sc.next());
        double h = Double.parseDouble(sc.next());
        double m = Double.parseDouble(sc.next());
        
        double x = Math.toRadians(Math.abs(h*30 + m*0.5 - m*6));
        double ans = Math.sqrt(a*a+b*b-(2*a*b*Math.cos(x)));
        System.out.println(ans);
    }
}