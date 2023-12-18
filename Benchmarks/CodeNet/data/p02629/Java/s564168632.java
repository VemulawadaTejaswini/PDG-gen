import java.util.Scanner;

public class Main {
    private static final long[] BASE = new long[12];
    private static final char[] smallChar = new char[27];

    static {
        BASE[0] = 1;
        for (int i = 1; i < BASE.length; i++) {
            BASE[i] = BASE[i - 1] * 26;
        }

        int i = 1;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            smallChar[i++] = ch;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        StringBuilder ans = new StringBuilder();

        for (int i = BASE.length - 1; i >= 0; i--) {
            if (n >= BASE[i]) {
                long div = n / BASE[i];
                n %= BASE[i];

                ans.append(smallChar[(int)div]);
            }
        }

        System.out.println(ans.toString());
    }
}