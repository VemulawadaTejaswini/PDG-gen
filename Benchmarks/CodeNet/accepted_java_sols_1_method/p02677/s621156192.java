import java.util.*;
import java.math.BigInteger;

public class Main{
    
    public static final int MOD = (int)1e9+7;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        double h = Integer.parseInt(sc.next());
        double m = Integer.parseInt(sc.next());
        double hs = h/12+m/60/12;
        double ms = m/60;
        double e = Math.abs(hs-ms)*360;
        
        double c = a*a+b*b-2*a*b*Math.cos(Math.toRadians(e));
        System.out.println(Math.sqrt(c));
        
    }
}
