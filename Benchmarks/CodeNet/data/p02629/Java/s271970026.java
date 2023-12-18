import java.util.Scanner;

public class Main {

    static char[] alphabet = "zabcdefghijklmnopqrstuvwxy".toCharArray();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        int keta;
        for (int i = 1; true; i++) {
            long u = 0;
            for (int j = 1; j <= i; j++) {
                u += Math.pow(26, j);
            }
            if (n < u) {
                keta = i - 1;
                break;
            }
        }

        String name = "";
        for (int i = keta; i >= 0; i--) {
            int idx = (int)(n % 26);
            name = alphabet[idx] + name;
            n /= 26;
        }
        System.out.println(name);
    }
}
