import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = Math.abs(sc.nextLong());
        long k = sc.nextLong();
        long d = sc.nextLong();
        long min = x % d;
        long min2 = Math.abs(x % d - d);
        long count = x / d;
        long a = k - (x / d);
        if(count >= k) {
            System.out.println(x - k * d);
            return;
        }
        if(min == min2) {
            System.out.println(min);
            return;
        }
        if(a % 2 != 0) {
            System.out.println(min2);
        } else {
            System.out.println(min);
        }
    }
}