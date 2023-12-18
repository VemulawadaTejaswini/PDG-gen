import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int[] arrayA = new int[a];
        for (int i = 0; i < a; i++) {
            arrayA[i] = Integer.parseInt(sc.next());
        }
        int[] arrayB = new int[b];
        for (int i = 0; i < b; i++) {
            arrayB[i] = Integer.parseInt(sc.next());
        }
        int[] x = new int[m];
        int[] y = new int[m];
        int[] c = new int[m];
        for (int i = 0; i < m; i++) {
            x[i] = Integer.parseInt(sc.next());
            y[i] = Integer.parseInt(sc.next());
            c[i] = Integer.parseInt(sc.next());
        }

        // 主処理
        int minA = Arrays.stream(arrayA).min().getAsInt();
        int minB = Arrays.stream(arrayB).min().getAsInt();
        int result = minA + minB;
        for (int i = 0; i < m; i++) {
            int priceA = arrayA[x[i] - 1];
            int priceB = arrayB[y[i] - 1];
            int price = priceA + priceB - c[i];
            result = Math.min(result, price);
        }

        // 出力
        System.out.println(result);
        sc.close();
    }
}