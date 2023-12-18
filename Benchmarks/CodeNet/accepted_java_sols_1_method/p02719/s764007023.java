import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        sc.close();
        long min = n % k;
        long res = (min > Math.abs(min-k)) ? Math.abs(min-k) : min;
        
        System.out.println(res);
    }
}