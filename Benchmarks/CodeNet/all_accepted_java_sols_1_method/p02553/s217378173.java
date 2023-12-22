import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        long max = Long.MIN_VALUE;
        max = Math.max(max, a*c);
        max = Math.max(max, a*d);
        max = Math.max(max, b*c);
        max = Math.max(max, b*d);
        System.out.println(max);
        sc.close();

    }

}
