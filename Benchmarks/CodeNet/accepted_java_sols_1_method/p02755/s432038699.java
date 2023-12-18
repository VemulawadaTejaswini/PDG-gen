import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            for (int n = 1; n < 1e6; n++) {
                if ((int) (n * 0.08) == A && (int) (n * 0.1) == B) {
                    System.out.println(n);
                    return;
                }
            }
            System.out.println(-1);
        }
    }
}
