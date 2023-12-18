import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        long a = std.nextLong();
        long b = std.nextLong();
        long k = std.nextLong();

        long restA = Math.max(0, a - k);
        long restB = b;
        if (a - k < 0) {
            long count = k - a;
            restB =  Math.max(b - count, 0);
        }

        String res = restA + " " + restB;
        System.out.println(res);
    }
}
