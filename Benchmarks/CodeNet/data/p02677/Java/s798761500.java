import java.math.*;
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();
        double ans = 0.0;
        double ar = 30*h + m/2;
        double br = 6*m;
        double cr = 0.0;
        if(h==0&&m==0){
            if(a-b>0){
                System.out.println(a-b);
            } else {
                System.out.println(b-a);
            }
        } else if(ar-br==180||br-ar==180){
            System.out.println(a+b);
        } else if(ar-br==90||br-ar==90||ar-br==270||ar-br==270){
            double ans1 = a*a + b*b;
            ans = Math.sqrt(ans1);
            System.out.println(ans);
        } else{
            if(ar-br>0){
                if(ar-br<180){
                    cr = ar-br;
                } else {
                    cr = 360 - (ar-br);
                }
            } else {
                if(br-ar<180){
                    cr = br - ar;
                } else {
                    cr = 360 - (br -ar);
                }
            }
            double ans1 = a*a + b*b -2*a*b*Math.cos(Math.toRadians(cr));
            ans = Math.sqrt(ans1);
            System.out.println(ans);
        }
    }
}
