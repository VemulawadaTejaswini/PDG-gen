import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double A = scan.nextInt();
        double B = scan.nextInt();
        double C = scan.nextInt();
        double D = scan.nextInt();
        double ans = 0;
        double Sado  = (Math.PI)*Math.abs(C/6+D/360-D/30);
        if(Sado >Math.PI){Sado-=Math.PI;}
        double p = A*A+B*B;
        double q = 2*A*B;
        ans = Math.sqrt(p - q*Math.cos(Sado));
        System.out.println(ans);
    }
}
