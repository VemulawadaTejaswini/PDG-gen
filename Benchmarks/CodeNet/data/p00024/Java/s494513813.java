import java.util.Scanner;

class Main {
    private static void solve() {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextFloat()) {
            float v = scanner.nextFloat();
            float t = v / 9.8f;
            float y = 4.9f * t * t;
            System.out.println((int) Math.ceil(y / 5) + 1);
        }
    }

    public static void main(String... args) {
        solve();
    }
}