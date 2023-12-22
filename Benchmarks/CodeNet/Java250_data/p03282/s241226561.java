import java.util.Scanner;

class Main {
    static String S;

    public static void main(String... args) {
        Scanner IN   = new Scanner(System.in);
        S = IN.next();
        long K = IN.nextLong();
        System.out.println(calc(K, 0));
    }

    static Character calc(long k, int i) {
        if (k == 1) {
            return S.charAt(i);
        } else {
            if (S.charAt(i) != '1') {
                return S.charAt(i);
            } else {
                return calc(k - 1, i + 1);
            }
        }
    }
}
