import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        long d = sc.nextInt();

        long x =   Math.max(a*c, a*d);
        long y =   Math.max(b*c, b*d);
        long z =   Math.max(x, y);
        
        System.out.println(z);
    }
}
