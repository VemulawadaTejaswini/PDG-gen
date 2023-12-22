import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        char[] s = scanner.next().toCharArray();
        int ans = 0;
        int count = 0;
        for (char c : s) {
            if (c == 'R') {
                count++;
            } else {
                ans = Math.max(ans, count);
                count = 0;
            }
        }
        System.out.println(Math.max(count, ans));
    }

}