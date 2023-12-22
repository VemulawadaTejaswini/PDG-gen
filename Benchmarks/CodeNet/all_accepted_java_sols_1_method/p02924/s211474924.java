import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long ans = 0;
        for (int i = 1; i < n; i++) {
            ans += i;
        }
        System.out.println(ans);
    }
}