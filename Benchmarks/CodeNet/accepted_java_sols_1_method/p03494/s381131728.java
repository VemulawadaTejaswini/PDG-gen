import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }

        // 主処理
        int result = 0;
        int[] array = a;
        int len = a.length;
        while (len == array.length) {
            len = array.length;
            array = Arrays.stream(array).filter(c -> c % 2 == 0).map(c -> c / 2).toArray();
            if (len == array.length) {
                result++;
            }
        }

        // 出力
        System.out.println(result);
        sc.close();
    }
}
