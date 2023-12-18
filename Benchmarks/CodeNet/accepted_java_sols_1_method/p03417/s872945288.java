public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        long n = scanner.nextInt(), m = scanner.nextInt();
        System.out.println(n == 2 || m == 2 ? 0 : n == 1 || m == 1 ? n == 1 ? m == 1 ? 1 : m - 2 : n - 2 : (n - 2) * (m - 2));
    }
}