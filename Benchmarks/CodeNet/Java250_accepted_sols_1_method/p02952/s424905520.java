
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        StringBuilder ans;
//        long cnt = 0;
        int cnt = 0;
        for (int i = 1; i <= n; i++) {

            ans = new StringBuilder(""+i);
            if (ans.length() % 2 != 0) {
                cnt++;
            }
        }

        System.out.println(cnt);

    }

}
