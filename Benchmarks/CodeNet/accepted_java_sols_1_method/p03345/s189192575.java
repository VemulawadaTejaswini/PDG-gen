import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long k = sc.nextLong();

        long result = a-b;
        if (Math.abs(result) > 1000000000000000000L)
            System.out.println("Unfair");
        else if (k%2 == 0)
            System.out.println(result);
        else
            System.out.println(-result);
    }
}