import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        double d = sc.nextDouble();
        if(l < 100000) {System.out.println((long) Math.floor(l * d)); return;}
        long ans = l * (long)Math.floor(d);
        d -= Math.floor(d);
        d *= 100;
        ans += (l / 100) * (long)d;
        System.out.println(ans);
    }
}