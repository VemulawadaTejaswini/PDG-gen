import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Integer[] a = new Integer[n];
        Arrays.setAll(a, i -> Integer.parseInt(sc.next()));
        sc.close();

        // 主処理
        int min = Arrays.stream(a).mapToInt(i -> i).min().getAsInt();
        int max = Arrays.stream(a).mapToInt(i -> i).max().getAsInt();
        int result = max - min;

        // 出力
        System.out.println(result);
    }
}
