
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int cnt = 1;

        int ans = 0;

        while (cnt < y) {
            cnt--;
            cnt += x;
            ans++;
        }
        System.out.println(ans);

    }

}
