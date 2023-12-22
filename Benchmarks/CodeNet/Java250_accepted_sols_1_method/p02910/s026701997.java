import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        final char[] s = sc.next().toCharArray();
        for (int i = 0; i < s.length; i++) {
            if (s[i] == (i%2==0? 'L': 'R')) {
                System.out.println("No");
                return;
            }
        } System.out.println("Yes");
    }
}