
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final long A = sc.nextLong();
        String B = sc.next();
        int b_x = Integer.valueOf(B.substring(0, 1)), b_y = Integer.parseInt(B.substring(2));
        long a_x = A * b_x;
        long a_y = A * b_y / 100;
        System.out.println(a_x + a_y);
    }
}
