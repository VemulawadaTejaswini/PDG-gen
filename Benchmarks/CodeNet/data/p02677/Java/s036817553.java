import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int h = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        double jikakudo = (double)h*30+(double)m/2.0;
        double hunkakudo = 6.0 * (double)m;
        double kakudo = 0;
        if(sa(jikakudo, hunkakudo) >= 180) kakudo = 360 - sa(jikakudo, hunkakudo);
        else kakudo = sa(jikakudo, hunkakudo);
        double ans = a*a + b*b - 2*a*b*Math.cos(Math.toRadians(kakudo));
        System.out.println(Math.sqrt(ans));
    }
    static double sa(double a, double c) {
        if(a <= c) return c-a;
        else return a-c;
    }
}