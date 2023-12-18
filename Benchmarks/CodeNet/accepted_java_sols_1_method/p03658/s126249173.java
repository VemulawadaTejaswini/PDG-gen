import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        Integer[] l = new Integer[n];
        for (int i = 0; i < n; i++) {
            l[i] = Integer.parseInt(sc.next());
        }

        // 主処理
        Arrays.sort(l, Collections.reverseOrder());
        int result = 0;
        for (int i = 0; i < k; i++) {
            result += l[i];
        }

        // 出力
        System.out.println(result);
        sc.close();
    }
}
