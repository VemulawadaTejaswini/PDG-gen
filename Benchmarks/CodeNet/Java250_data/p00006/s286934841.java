import java.util.Scanner;

class Main {
    private static String reverse(String string) {
        char[] result = new char[string.length()];
        for (int i = 0; i < result.length; i++) {
            result[i] = string.charAt(result.length - i - 1);
        }
        return String.valueOf(result);
    }

    private static void solve() {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        System.out.println(reverse(string));
    }

    public static void main(String... args) {
        solve();
    }
}