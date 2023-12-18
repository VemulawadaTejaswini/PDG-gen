
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final long s = in.nextLong();
        long r = (long) Math.sqrt(s);
        if (r * r < s) {
            r += 1;
        }
        System.out.println("0 0 " + r + " 1 " + (r * r - s) + " " + r);
    }
}