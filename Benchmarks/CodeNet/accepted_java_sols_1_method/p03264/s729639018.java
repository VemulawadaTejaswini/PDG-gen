import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int K = in.nextInt();
            int odd = 0;
            int even = 0;
            for (int i = 1; i <= K; i++) {
                if (i % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
            System.out.println(odd * even);
        }
    }
}
