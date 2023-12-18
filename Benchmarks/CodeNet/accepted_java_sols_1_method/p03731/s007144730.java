public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt(), t = scanner.nextInt(), ans = 0;
        for (int i = 1, last = scanner.nextInt(); i < n; i++)
            ans += Math.min(t, 0 - last + (last = scanner.nextInt()));
        System.out.println(ans + t);
    }
}