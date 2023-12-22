import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        long d = sc.nextInt();

        long max = Long.MIN_VALUE;

        max = Math.max(max, a * c);
        max = Math.max(max, a * d);
        max = Math.max(max, b * c);
        max = Math.max(max, b * d);

        System.out.println(max);

    }
}
