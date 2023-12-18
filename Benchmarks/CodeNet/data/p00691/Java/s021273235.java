import java.util.Scanner;

class Main {
    private static void solve() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int z = scanner.nextInt();
            if (z == 0) {
                break;
            }

            int z3 = z * z * z;
            int maximum = 0;
            for (int x = 1; x * x * x < z3; x++) {
                int x3 = x * x * x;
                for (int y = 1; x3 + y * y * y < z3; y++) {
                    int y3 = y * y * y;
                    if (x3 + y3 > maximum) {
                        maximum = x3 + y3;
                    }
                }
            }
            System.out.println(z3 - maximum);
        }            
    }

    public static void main(String... args) {
        solve();
    }
}