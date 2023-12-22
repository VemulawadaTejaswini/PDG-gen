import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        String t = sc.next();

        boolean res = false;
        for (int i = 0; i < s.length; i++) {

            char[] tmpChar = new char[s.length];
            for (int j = 0; j < s.length - 1; j++) {
                tmpChar[j+1] = s[j];
            }
            tmpChar[0] = s[s.length-1];

            s = tmpChar;// 入れ替えをした結果を更新

            // 比較
            String tmpRes = new String(s);
            if (tmpRes.equals(t)) {
                res = true;
                break;
            }
        }

        System.out.println(res ? "Yes" : "No");
    }
}
