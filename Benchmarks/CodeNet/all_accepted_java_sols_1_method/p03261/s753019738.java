import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String[] w = new String[n];
        for (int i = 0; i < n; i++) {
            w[i] = sc.next();
        }

        // 主処理
        Set<String> set = new HashSet<>(Arrays.asList(w));
        boolean isObey = set.size() == n;
        if (isObey) {
            for (int i = 0; i < n - 1; i++) {
                char end = w[i].charAt(w[i].length() - 1);
                char start = w[i + 1].charAt(0);
                isObey = isObey && (end == start);
            }
        }

        String result = isObey ? "Yes" : "No";

        // 出力
        System.out.println(result);
        sc.close();
    }
}