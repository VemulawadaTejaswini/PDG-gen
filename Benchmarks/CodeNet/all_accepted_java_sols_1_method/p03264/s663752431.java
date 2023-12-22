import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int cnt = 0;
        for (int i = 1 ; i <= n; i ++) {
            for (int j = 1; j <= n; j++) {
                if ((i % 2 == 0 && j % 2 != 0) || (j % 2 == 0 && i % 2 != 0)) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt / 2);
    }
}