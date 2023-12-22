public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        long x = scanner.nextLong();
        System.out.println(x / 11 * 2 + (x % 11 == 0 ? 0 : (x % 11 + 5) / 6));
    }
}