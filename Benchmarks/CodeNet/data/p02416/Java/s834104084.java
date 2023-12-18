import java.util.*;

/**
 * SumOfNumbers
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        out_of_loop: while (true) {
            String str = sc.next(); // ここで一文字ずつに区切れ
            String[] strArray = str.split("");

            if (strArray[0].equals("0")) {
                break out_of_loop;
            }

            int ans = 0;

            for (String s : strArray) {
                char[] c = s.toCharArray();
                ans += c[0] - '0';
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
