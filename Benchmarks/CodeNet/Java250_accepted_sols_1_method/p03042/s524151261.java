import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        sc.close();

        int pre = Integer.parseInt(S.substring(0, 2));

        int suf = Integer.parseInt(S.substring(2, 4));

        String answer = "";

        if (0 < pre && pre <= 12) {
            if (0 < suf && suf <= 12) {
                answer = "AMBIGUOUS";
            } else {
                answer = "MMYY";
            }
        } else {
            if (0 < suf && suf <= 12) {
                answer = "YYMM";
            } else {
                answer = "NA";
            }
        }
        System.out.println(answer);
    }
}