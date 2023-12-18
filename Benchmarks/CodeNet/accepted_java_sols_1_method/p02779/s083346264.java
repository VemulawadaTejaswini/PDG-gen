import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        Arrays.setAll(a, i -> Integer.parseInt(sc.next()));

        // 主処理
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        boolean judge = n == set.size();
        String result = judge ? "YES" : "NO";

        // 出力
        System.out.println(result);
        sc.close();
    }
}
