import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String result = "AC";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            String one = s.substring(i, i + 1);
            if (i == 0) {
                if (!one.equals("A")) {
                    result = "WA";
                    break;
                } else {
                    continue;
                }
            }
            if ((i > 1) && (i < s.length() - 1)) {
                if (one.equals("C")) {
                    count++;
                    continue;
                }
            }
            if (Character.isUpperCase(one.toCharArray()[0])) {
                result = "WA";
                break;
            }
        }
        // 出力
        if (count != 1) {
            result = "WA";
        }
        System.out.println(result);
    }
}