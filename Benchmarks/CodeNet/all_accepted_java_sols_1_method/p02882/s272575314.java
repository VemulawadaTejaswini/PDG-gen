import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double x = sc.nextInt();
        double n = x/(double)a;
        double l;
        if (x>=a*a*(double)b/2){
            l = 2*(a*b-n)/a;
            b=a;
            a=l;
            l=b;
        }else {
            l = 2*n/b;
            a=b;
        }
        double d = Math.acos(Math.sqrt((l*l)/(l*l+a*a)));
        System.out.println(d/Math.PI*180);
    }
}
