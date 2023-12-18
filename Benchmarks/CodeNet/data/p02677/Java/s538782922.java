import java.util.*;
import java.math.BigInteger;

public class Main{
    
    public static final int MOD = (int)1e9+7;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int h = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        double hs = h*30.0+m*6.0/12;
        double ms = m*60.0;
        
        double e = Math.abs(hs-ms);
        
        double c = a*a+b*b-2*a*b*Math.cos(Math.toRadians(e));
        System.out.println(Math.sqrt(c));
        
    }
}
