import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        int[] arr = new int[] { a, b, c };
        Arrays.sort(arr);
        for (int i = 0; i < k; i++) {
            arr[arr.length - 1] *= 2;
        }
        int result = Arrays.stream(arr).sum();

        // 出力
        System.out.println(result);
    }
}
