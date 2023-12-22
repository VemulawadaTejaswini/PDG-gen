import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int e = 0;
        int o = 0;
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((i + 1) % 2 == 0) {
                if (s.charAt(i) == '0') {
                    e++;
                } else {
                    o++;
                }
            } else {
                if (s.charAt(i) == '0') {
                    o++;
                } else {
                    e++;
                }
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (e > o) {
                if ((i + 1) % 2 == 0 && s.charAt(i) != '0') {
                    ans++;
                } else if ((i + 1) % 2 != 0 && s.charAt(i) != '1') {
                    ans++;
                }
            } else {
                if ((i + 1) % 2 == 0 && s.charAt(i) != '1') {
                    ans++;
                } else if ((i + 1) % 2 != 0 && s.charAt(i) != '0') {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
