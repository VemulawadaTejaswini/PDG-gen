import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try (Scanner s = new Scanner(System.in)) {
            int a = s.nextInt();
            long b = s.nextLong();
            long n = s.nextLong();
            long x = Math.min(b - 1, n);
            System.out.println((a * x) / b);
        }
    }
}
