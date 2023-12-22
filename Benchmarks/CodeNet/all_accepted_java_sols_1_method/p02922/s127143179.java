import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int A = in.nextInt();
            int B = in.nextInt();

            for (int i = 0;; i++) {
                if (i * (A - 1) + 1 >= B) {
                    System.out.println(i);
                    return;
                }
            }
        }
    }
}
