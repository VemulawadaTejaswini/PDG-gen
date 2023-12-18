import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // AGC 008 Simple Calculator
        Scanner sc = new Scanner(System.in);
        long now = 1;
        int k = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (b - a <= 2 || k <= a) {
            System.out.println(k + now);
            return;
        }
        if (now < a) {
            k -= a - now;
            now = a;
        }
        if (k % 2 == 1) {
            k--;
            now++;
        }
        long count = k / 2;
        now += count * (b - a);

        System.out.println(now);
    }
}