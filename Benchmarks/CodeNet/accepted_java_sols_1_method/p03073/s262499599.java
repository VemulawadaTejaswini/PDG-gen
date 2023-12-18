import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int ans = 0;
        for (int i = 1; i < s.length; i++) {
            if (s[i] == s[i - 1]) {
                ans++;
                if (s[i] == '0') {
                    s[i] = '1';
                } else {
                    s[i] = '0';
                }
            }
        }
        System.out.println(ans);
    }
}