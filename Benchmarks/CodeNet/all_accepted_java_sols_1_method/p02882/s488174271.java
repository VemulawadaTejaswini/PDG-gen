import java.util.*;

public class Main {

    static final int MOD=1000000007;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double x = sc.nextDouble();
        if(a*a*b/2<=x) {
            double h = 2 * (b - x / (a * a));
            double ans = Math.toDegrees(Math.atan(h / a));
            System.out.println(ans);
        }else{
            double h = 2*x/(a*b);
            double ans = 90-Math.toDegrees(Math.atan(h/b));
            System.out.println(ans);
        }
    }
}


