import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Integer[] l = new Integer[n];
        Arrays.setAll(l, i -> Integer.parseInt(sc.next()));
        sc.close();

        // 主処理
        Arrays.sort(l, Collections.reverseOrder());
        int result = 0;
        for (int i = 0; i < l.length - 2; i++) {
            for (int j = i + 1; j < l.length - 1; j++) {
                for (int k = j + 1; k < l.length; k++) {
                    if (l[i] < l[j] + l[k]) {
                        result++;
                    }
                }
            }
        }

        // 出力
        System.out.println(result);
    }
}
