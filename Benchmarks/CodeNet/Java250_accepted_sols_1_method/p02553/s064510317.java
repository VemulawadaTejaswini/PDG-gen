import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a =  sc.nextLong();
        long b =  sc.nextLong();
        long c =  sc.nextLong();
        long d =  sc.nextLong();
        sc.close();
        long ans = Math.max(Math.max(a*c,a*d),Math.max(b*c,b*d));
        System.out.println(ans);
    }
}
