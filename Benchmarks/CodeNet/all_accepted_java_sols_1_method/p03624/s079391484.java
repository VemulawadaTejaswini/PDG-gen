import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int a[] = new int[26];
        Arrays.fill(a, 0);

        for (int i = 0; i < s.length(); i++) {
            a[s.charAt(i) - 'a'] = 1;
        }

        for (int i = 0; i < 26; i++) {
            if (a[i] == 0) {
                System.out.println((char)('a' + i));
                return;
            }
        }

        System.out.println("None");
    }
}
