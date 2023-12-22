import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        // 整数の入力
        // final int a = sc.nextInt();
        // 文字列の入力
        // final String s1 = sc.next();
        final int N = Integer.parseInt(sc.next());
        final int K = Integer.parseInt(sc.next());
        int result = 0;
        int[] pricelist = new int[N];
        for (int i = 0; i < N; i++) {
            pricelist[i] = Integer.parseInt(sc.next());
        }
        sc.close();
        Arrays.sort(pricelist);
        for (int i = 0; i < K; i++) {
            result = result + pricelist[i];
        }
        System.out.println(result);
    }
}