import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        Integer[] m = new Integer[n];
        Arrays.setAll(m, i -> Integer.parseInt(sc.next()));
        sc.close();

        // 主処理
        int sum = Arrays.stream(m).mapToInt(i -> i).sum();
        int min = Arrays.stream(m).mapToInt(i -> i).min().getAsInt();
        int result = n + (x - sum) / min;

        // 出力
        System.out.println(result);
    }
}
