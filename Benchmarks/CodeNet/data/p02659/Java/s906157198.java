import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long A = sc.nextLong();
            String B = sc.next();
            String[] split = B.split("[.]");
            long B1 = Long.parseLong(split[0]);
            long B2 = Long.parseLong(split[1]);
            long B3 = B1 * 100 + B2;
            System.out.println((A * B3) / 100);
        }
    }
}
