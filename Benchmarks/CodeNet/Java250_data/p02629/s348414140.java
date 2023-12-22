import java.util.Scanner;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            long mod = n % 26;
            if (mod == 0) {
                n--;
                mod = 25;
            } else {
                mod--;
            }
            sb.append((char) ('a' + mod));
            n /= 26;
        }
        System.out.println(sb.reverse().toString());
    }
}