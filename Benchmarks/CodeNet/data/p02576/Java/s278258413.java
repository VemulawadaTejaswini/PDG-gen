import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long x = sc.nextLong();
        long t = sc.nextLong();
        long result = (n / x) * t;
        if(n % x != 0) {
            result += t;
        }
        System.out.println(result);
    }
}