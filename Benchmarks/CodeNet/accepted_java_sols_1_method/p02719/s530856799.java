import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        long v = n % k;
        v = Math.min(v, Math.abs(v - k));

        System.out.println(v);
    }
}