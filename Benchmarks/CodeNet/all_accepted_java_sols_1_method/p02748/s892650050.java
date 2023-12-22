import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        Integer[] arrA = new Integer[a];
        Arrays.setAll(arrA, i -> Integer.parseInt(sc.next()));
        Integer[] arrB = new Integer[b];
        Arrays.setAll(arrB, i -> Integer.parseInt(sc.next()));
        Integer[] x = new Integer[m];
        Integer[] y = new Integer[m];
        Integer[] c = new Integer[m];
        for (int i = 0; i < m; i++) {
            x[i] = Integer.parseInt(sc.next());
            y[i] = Integer.parseInt(sc.next());
            c[i] = Integer.parseInt(sc.next());
        }
        sc.close();

        // 主処理
        int minReizouko = Arrays.stream(arrA).mapToInt(i -> i).min().getAsInt();
        int minRenji = Arrays.stream(arrB).mapToInt(i -> i).min().getAsInt();
        int result = minReizouko + minRenji;
        for (int i = 0; i < m; i++) {
            int reizouko = arrA[x[i] - 1];
            int renji = arrB[y[i] - 1];
            int sum = reizouko + renji - c[i];
            result = Math.min(sum, result);
        }

        // 出力
        System.out.println(result);
    }
}
