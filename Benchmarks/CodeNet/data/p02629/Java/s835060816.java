import java.util.*;

public class Main {
    final static char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(getDogName(n));
    }

    private static String getDogName(long n) {
        String name = "";
        if (n > 26) {
            name = getDogName(n / 26);
        }
        int index = (int) ((n - 1) % 26);
        name += alphabet[index];
        return name;
    }
}