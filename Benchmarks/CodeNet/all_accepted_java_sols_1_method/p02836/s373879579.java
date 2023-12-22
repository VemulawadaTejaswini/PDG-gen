import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] chars = sc.next().toCharArray();
        int ans = 0;
        int half = chars.length / 2;
        for (int i = 0; i < half; i++) {
            if (chars[i] != chars[chars.length - i - 1])
                ans++;
        }
        System.out.println(ans);
    }
}