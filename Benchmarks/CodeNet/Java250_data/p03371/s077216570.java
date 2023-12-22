import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = 0;
        if (c * 2 >= a + b) {
            sum += a * x + b * y;
        } else {
            if (x > y) {
                sum += 2 * c * y;
                x -= y;
                sum += Math.min(a * x, 2 * c * x);
            } else if (x < y) {
                sum += 2 * c * x;
                y -= x;
                sum += Math.min(b * y, 2 * c * y);
            } else {
                sum += 2 * c * x;
            }
        }
        System.out.println(sum);
    }
}