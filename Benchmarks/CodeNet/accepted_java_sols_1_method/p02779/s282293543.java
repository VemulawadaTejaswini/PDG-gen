import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        Integer n = Integer.parseInt(sc.next());
        Set<Integer> a = new HashSet<>();
        for (int i = 0; i < n; i++) {
            a.add(Integer.parseInt(sc.next()));
        }

        // 主処理
        String result = n == a.size() ? "YES" : "NO";

        // 出力
        System.out.println(result);
        sc.close();
    }
}
