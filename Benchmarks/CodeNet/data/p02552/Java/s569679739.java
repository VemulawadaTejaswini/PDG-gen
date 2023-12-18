import java.util.*;

public class Main {

    public static long x,y;
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        long d = sc.nextInt();

        x = Math.max(Math.abs(a), (Math.abs(b)));
        y = Math.max(Math.abs(c), (Math.abs(d)));
        
        System.out.println(x * y);

    }

}
