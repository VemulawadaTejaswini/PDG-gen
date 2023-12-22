public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            String str = Integer.toString(scanner.nextInt(), 2);
            ans += str.length() - str.lastIndexOf("1") - 1;
        }
        System.out.println(ans);
    }
}