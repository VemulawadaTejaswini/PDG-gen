import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 1;
        String last = s.substring(0, 1);
        int index = 1;
        int length = 1;

        while (index + length <= s.length()) {
            String v = s.substring(index, index + length);
            if (last.equals(v)) {
                length++;
            } else {
                last = v;
                index += length;
                length = 1;
                ans++;
            }
        }

        System.out.println(ans);
    }
}