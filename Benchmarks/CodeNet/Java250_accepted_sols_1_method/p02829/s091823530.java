import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int A = in.nextInt();
            int B = in.nextInt();
            System.out.println(Integer.numberOfTrailingZeros((1 << 1) ^ (1 << 2) ^ (1 << 3) ^ (1 << A) ^ (1 << B)));
        }
    }
}