import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int win = 0;
        int left = 15 - s.length();
        sc.close();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'o') {
                win++;
            }
        }

        if ((win + left) > 7) {
            // 出力
            System.out.println("YES");
        } else {
            // 出力
            System.out.println("NO");
        }

    }
}
