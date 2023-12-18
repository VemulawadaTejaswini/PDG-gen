public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int ans = -1, l = 0;
        for (char c : scanner.next().toCharArray()) if (l != (l = c)) ans++;
        System.out.println(ans);
    }
}