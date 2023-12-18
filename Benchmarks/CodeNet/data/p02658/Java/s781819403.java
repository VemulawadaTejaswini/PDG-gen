import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long prod = 1;
        for (int i = 0; i < N; ++i) {
            prod *= scanner.nextLong();
            if (prod>1000000000000000000L)
            {
                prod=-1;
                break;
            }
        }
        System.out.println(prod);
    }
}
