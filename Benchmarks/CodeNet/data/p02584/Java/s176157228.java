import java.security.SecureRandom;
import java.sql.Array;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       long x=sc.nextLong();
        long k=sc.nextLong();
        long d=sc.nextLong();
        x=Math.abs(x);
        if (x/d>=k) System.out.println((x-k*d));
        else{
            k-=x/d;
            x-=(x/d)*d;
            if (k%2==0){
                System.out.println(x);
            }
            else{
                System.out.println(Math.abs((x-d)));
            }
        }
    }

}