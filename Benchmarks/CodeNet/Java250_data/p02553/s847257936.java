import java.util.*;

public class Main {

    public static long x,y;
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        long d = sc.nextInt();

        long maxx = Math.max(a * c, a * d);
        long maxy = Math.max(b * c, b * d);
        long ans = Math.max(maxx, maxy);

        System.out.println(ans);

    }

}
