import java.util.*;

public class Main {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int ans = 0;
        for (int i = a; i <= b; i++) {
            String tmp = String.valueOf(i);
            char[] tmp_char = tmp.toCharArray();

            if (tmp_char[0] == tmp_char[4] && tmp_char[1] == tmp_char[3]) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}