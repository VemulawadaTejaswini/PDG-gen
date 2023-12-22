import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            for (int n = N; n < 1000; n++) {
                if (n % 111 == 0) {
                    System.out.println(n);
                    return;
                }
            }
        }
    }
}
