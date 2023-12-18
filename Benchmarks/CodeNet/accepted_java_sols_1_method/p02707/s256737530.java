import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Integer[] a = new Integer[n - 1];
        Arrays.setAll(a, i -> Integer.parseInt(sc.next()));
        sc.close();

        // 主処理
        int[] num = new int[n];
        for (int i : a) {
            num[i - 1]++;
        }

        // 出力
        for (int i : num) {
            System.out.println(i);
        }
    }
}
