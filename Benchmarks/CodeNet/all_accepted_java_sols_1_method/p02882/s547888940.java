import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double x = sc.nextDouble();
        sc.close();
        double ans = 0;
        double S  = 0;
        if(b >= a){
            S = x/a;
            ans = Math.toDegrees(Math.atan(2*(a*b-S)/a/a));
            if(ans > Math.toDegrees(Math.atan(b/a))){
                ans = Math.toDegrees(Math.atan(b*b*a/2/x));
            }
        } else {
            S = x/a;
            ans = Math.toDegrees(Math.atan(2*(a*b-S)/a/a));
            if(ans > Math.toDegrees(Math.atan(b/a))){
                ans = Math.toDegrees(Math.atan(b*b*a/2/x));
            }
        }
        System.out.println(ans);
    }
}