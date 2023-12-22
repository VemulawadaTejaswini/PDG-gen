import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        Integer h = Integer.parseInt(sc.next());
        Integer n = Integer.parseInt(sc.next());
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }

        // 主処理
        int sum = 0;
        for (int num : a) {
            sum += num;
        }

        String result = h <= sum ? "Yes" : "No";

        // 出力
        System.out.println(result);
        sc.close();
    }
}
