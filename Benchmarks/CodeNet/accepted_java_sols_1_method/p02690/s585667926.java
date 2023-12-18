
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();
        long[] power = new long[1001];
        power[0] = 0;
        for (int i = 1; i <= 1000; ++i) {
            power[i] = ((long)i) * i * i * i * i;
        }
        for (int a = -1000; a <= 1000; ++a) {
            for (int b = -1000; b <= 1000; ++b) {
                long powerA = power[Math.abs(a)];
                if (a < 0) {
                    powerA *= -1L;
                }
                long powerB = power[Math.abs(b)];
                if (b < 0) {
                    powerB *= -1L;
                }
                if (powerA - powerB == x) {
                    System.out.println(a + " " + b);
                    return;
                }
            }
        }
    }
}
