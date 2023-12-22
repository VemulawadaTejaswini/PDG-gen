import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split("");
        String t = sc.next();
        String concat = "";
        for (int i = 0; i < s.length; i++) {
            concat = s[s.length - 1];
            for (int j = 0; j < s.length - 1; j++) {
                concat += s[j];
            }
            // 一致してたら修了
            if (concat.equals(t)) {
                System.out.println("Yes");
                return;
            }
            // 連結した文字列を分解
            s = concat.split("");
        }
        System.out.println("No");
    }
}
