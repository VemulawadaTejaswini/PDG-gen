import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ABC041A - Table Tennis Training

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();

        long x = 0;
        long y = 0;

        if (a > b) {
            x = a;
            y = b;
        } else {
            x = b;
            y = a;
        }

        long cnt = 0;
        if ((x - y) % 2 == 0) {
            cnt = (x - y) / 2;
        } else {
            if (n - x >= y - 1) {
                cnt = y + (x - y - 1) / 2;
            } else {
                cnt = (n - x + 1) + (n - (y + n - x + 1)) / 2;
            }
        }

        System.out.println(cnt);
    }
}