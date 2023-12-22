import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long k = in.nextLong();
        k--;

        for (long i = 0; i < s.length(); i++) {
            if (s.charAt((int)i) != '1') {
                System.out.println(s.charAt((int)i));
                return;
            }

            if (i == k) {
                System.out.println(1);
                return;
            }
        }

        System.out.println(s.charAt(s.length() - 1));
    }
}