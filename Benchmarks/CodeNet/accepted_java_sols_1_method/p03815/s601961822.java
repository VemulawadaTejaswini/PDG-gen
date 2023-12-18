import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long ans = x / 11;
        long mod = x % 11;
        ans *= 2;
        if (mod > 0) {
            ans++;
        }
        if (mod > 6) {
            ans++;
        }
        System.out.println(ans);
    }

}
