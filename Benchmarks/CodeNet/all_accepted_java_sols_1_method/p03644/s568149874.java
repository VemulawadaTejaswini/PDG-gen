import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int cnt = 0;
        int maxCnt = 0;
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            cnt = 0;
            int divided = i;
            while (true) {
                if (divided % 2 != 0) {
                    break;
                } else {
                    divided = divided / 2;
                    cnt++;
                }
                if (cnt > maxCnt) {
                    maxCnt = cnt;
                    ans = i;
                }
            }
        }
        if (n == 1) {
            System.out.println(1);
        } else {
            System.out.println(ans);   
        }
    }
}
