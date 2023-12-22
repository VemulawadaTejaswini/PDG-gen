public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        scanner.useDelimiter("");
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt(), d = scanner.nextInt();
        if (a + b + c + d == 7) System.out.printf("%d+%d+%d+%d=7\n", a, b, c, d);
        else if (a + b + c - d == 7) System.out.printf("%d+%d+%d-%d=7\n", a, b, c, d);
        else if (a + b - c + d == 7) System.out.printf("%d+%d-%d+%d=7\n", a, b, c, d);
        else if (a + b - c - d == 7) System.out.printf("%d+%d-%d-%d=7\n", a, b, c, d);
        else if (a - b + c + d == 7) System.out.printf("%d-%d+%d+%d=7\n", a, b, c, d);
        else if (a - b + c - d == 7) System.out.printf("%d-%d+%d-%d=7\n", a, b, c, d);
        else if (a - b - c + d == 7) System.out.printf("%d-%d-%d+%d=7\n", a, b, c, d);
        else if (a - b - c - d == 7) System.out.printf("%d-%d-%d-%d=7\n", a, b, c, d);
    }
}