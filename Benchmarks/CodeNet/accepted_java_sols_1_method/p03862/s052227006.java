public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt(), x = scanner.nextInt();
        long l = scanner.nextInt(), ans = l > x ? l - x : 0;
        l -= ans;
        for (int i = 1, t; i < n; i++)
            ans += (t = scanner.nextInt()) - (l = Math.min(x - l, t));
        System.out.println(ans);
    }
}