import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();

        long m = n;
        String ans = "";
        while (m > 0) {
            if (m % 26 == 0) {
                ans = 'z' + ans;
                m -= 26;
            } else {
                ans = (char)((m % 26) + 'a' - 1) + ans;
            }
            m /= 26;
        }

        System.out.println(ans);
    }
}