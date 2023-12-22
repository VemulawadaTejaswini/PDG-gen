import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] c1 = new char[s.length() / 2];
        char[] c2 = new char[s.length() / 2 + 1];
        for (int i = 0; i < s.length() / 2; i++) {
            c1[i] = s.charAt(i);
        }
        for (int i = s.length() - 1; i >= s.length() / 2; i--) {
            c2[s.length() - 1 - i] = s.charAt(i);
        }
        int ans = 0;
        for (int i = 0; i < s.length() / 2; i++) {
            if (c1[i] != c2[i]) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}