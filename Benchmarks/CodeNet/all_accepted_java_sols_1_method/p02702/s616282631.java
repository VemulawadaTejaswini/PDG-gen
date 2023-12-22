
import java.util.Scanner;

public class Main {
    private static int mod = 2019;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] s = scan.next().split("");
        scan.close();

        int[] amari = new int[2019];
        amari[0] = 1;
        int tenMod = 1;
        int nowMod = 0;
        for (int i = s.length - 1; i >= 0; i--) {
            nowMod += tenMod * Integer.parseInt(s[i]);
            nowMod %= mod;
            amari[nowMod]++;

            tenMod *= 10;
            tenMod %= mod;
        }

        long ans = 0;
        for (int i = 0; i < amari.length; i++) {
            ans += amari[i] * (amari[i] - 1) / 2;
        }
        System.out.println(ans);
    }
}
