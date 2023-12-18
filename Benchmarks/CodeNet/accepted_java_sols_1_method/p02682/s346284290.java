import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int K = scanner.nextInt();

        if (A >= K) {
            System.out.println(K);
        } else {
            if (B >= K - A) {
                System.out.println(A);
            } else {
                System.out.println(A - (K - A - B));
            }
        }
    }
}


