import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        n -= 1;
        String ans = "";
        while (n >= 0) {
            ans = (char) ('a' + n % 26) + ans;
            if (n == 0)
                break;
            n /= 26;
            n -= 1;
        }
        System.out.println(ans);
    }
}
