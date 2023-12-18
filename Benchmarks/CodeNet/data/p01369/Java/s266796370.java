import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        solve2552();
    }

    public static void solve2552() {
        Scanner sc = new Scanner(System.in);
        String left = "qwertasdfgzxcvb";
//        String right = "yuiophjklnm";
        while (true) {
            String string = sc.next();
            if ("#".equals(string)) {
                break;
            }
            String ans = "";
            for (int i = 0; i < string.length(); i++) {
                ans += left.contains(string.substring(i, i + 1)) ? "l" : "r";
            }
            int count = 0;
            char[] charArr = ans.toCharArray();
            for (int j = 1; j < charArr.length; j++) {
                if (charArr[j - 1] != charArr[j]) {
                    count++;
                }
            }
            System.out.println(count);
        }

    }
}
