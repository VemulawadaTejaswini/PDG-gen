import java.util.*;

public class Main{
    final static long mod = 1000000007;
    //
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();
    double d = b - c / a / a;
    if(2 * d <= b){
        double ans = Math.atan(2 * d / a) / Math.PI * 180;
        System.out.println(ans);
    }else{
        double ans = 90 - Math.atan((c / (a * a * b / 2) * a) / b) / Math.PI * 180; 
        System.out.println(ans);
    }
    }
    
}

