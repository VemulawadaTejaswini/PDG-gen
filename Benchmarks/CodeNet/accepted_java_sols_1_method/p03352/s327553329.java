import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int X = in.nextInt();
            int max = 0;
            for (int b = 1; b <= X; b++) {
                if (b > 1) {
                    for (int p = 2;; p++) {
                        int n = (int) (1e-9 + Math.pow(b, p));
                        if (n > X) {
                            break;
                        }
                        max = Math.max(max, n);
                    }
                } else {
                    int n = b;
                    max = Math.max(max, n);
                }
            }
            System.out.println(max);
        }
    }
}
