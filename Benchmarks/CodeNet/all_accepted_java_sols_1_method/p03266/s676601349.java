public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        long n = scanner.nextLong();
        long k = scanner.nextLong();
        long a = n / k, b = a * a * a;
        if ((k & 1) == 0) {
            a = (n + k / 2) / k;
            b += a * a * a;
        }
        System.out.println(b);
    }
}