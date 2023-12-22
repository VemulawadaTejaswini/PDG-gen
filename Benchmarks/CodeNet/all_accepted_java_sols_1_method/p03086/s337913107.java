import java.util.*;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        s = s.replaceAll("C", "A");
        s = s.replaceAll("G", "A");
        s = s.replaceAll("T", "A");

        int ans = 0;

        int now = 0;

        for(String value : s.split("")) {
            if (value.equals("A")) {
                now++;
            } else {
                if (now > ans) {
                    ans = now;
                }
                now = 0;
            }
        }

        if (now > ans) {
            ans = now;
        }

        // 出力
        System.out.println(ans);
    }
}