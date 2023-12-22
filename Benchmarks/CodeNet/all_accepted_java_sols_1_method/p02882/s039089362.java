import java.util.*;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        
        double ans = 0;

        if(x==a*a*b/2.0){
            double h = b;
            double i = Math.sqrt(a * a + b * b);
            ans = Math.toDegrees(Math.asin(h / i));
        }
        else if(x<a*a*b/2.0){
            double h = 2.0 * x / b / a;
            double i = Math.sqrt(h * h + b * b);
            ans = 90 - Math.toDegrees(Math.asin(h / i));
        }
        else{
            double h = 2 * b - 2.0 * x / a / a;
            double i = Math.sqrt(h * h + a * a);
            ans = Math.toDegrees(Math.asin(h / i));
        }
        System.out.println(ans);
    }
}