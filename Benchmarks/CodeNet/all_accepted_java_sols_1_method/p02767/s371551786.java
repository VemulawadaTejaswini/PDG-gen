
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer N = Integer.parseInt(scanner.next());

        Integer[] X = new Integer[N];
        for(int i = 0; i < N; i++) {
            X[i] = Integer.parseInt(scanner.next());
        }


        Integer all = Integer.MAX_VALUE;
        for (int i = 1; i < 100; i++) {
            Integer ans = 0;
            for (int j = 0; j < X.length; j++) {
                ans += Math.abs((X[j]  - i) )* Math.abs((X[j]  - i));
            }
            all = Math.min(all, ans);
        }
        System.out.println(all);
    }
}
