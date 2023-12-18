import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();

        for (int i = (int) Math.sqrt(N); i >= 1; i--) {
            if (N % i == 0) {
                System.out.println((i - 1) + (N / i - 1));
                return;
            }
        }


    }
}