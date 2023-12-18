

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public final class Main {

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final long n = Long.parseLong(in.nextLine());
        System.out.println(numToTitle(n));
    }

    public static String numToTitle(long n) {
        final StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append((char) (n % 26 + 'a' - 1));
            n /= 26;
        }
        return sb.reverse().toString();
    }
}
