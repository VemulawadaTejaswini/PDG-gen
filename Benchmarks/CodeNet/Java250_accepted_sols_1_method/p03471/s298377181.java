import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int Y = in.nextInt();

            for (int _1e4 = 0; _1e4 <= N; _1e4++) {
                for (int _5e3 = 0; _1e4 + _5e3 <= N; _5e3++) {
                    int _1e3 = N - (_1e4 + _5e3);
                    if (_1e4 * 10000 + _5e3 * 5000 + _1e3 * 1000 == Y) {
                        System.out.println(_1e4 + " " + _5e3 + " " + _1e3);
                        return;
                    }
                }
            }

            System.out.println("-1 -1 -1");
        }
    }
}
