public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        long n = scanner.nextInt(), a = 1, b = 1;
        for (int i = 0; i < n; i++) {
            long j = Math.max((a - 1) / (a = scanner.nextInt()), (b - 1) / (b = scanner.nextInt())) + 1;
            a *= j;
            b *= j;
        }
        System.out.println(a + b);
    }
}