import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = Math.abs(sc.nextLong());
        long k = sc.nextLong();
        long d = sc.nextLong();
        long min = x % d;
        long count = x / d;
        if(count >= k) {
            System.out.println(x - k * d);
            return;
        }
        if((k - count) % 2 == 0) {
            System.out.println(min);
        } else {
            System.out.println(d - min);
        }
    }
}