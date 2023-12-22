import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double x = sc.nextDouble();
        double m = a*a*b;
        double y = 0.0;
        double ans = 0.0;
        if(x < m/2){
            y = 2*x/(a*b*b);
            ans = 90.0 - Math.toDegrees(Math.atan(y));
        }else{
            y = 2*(a*a*b-x)/(a*a*a);
            ans = Math.toDegrees(Math.atan(y));
        }

        System.out.println(ans);
        sc.close();

    }

}
