import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        Integer[] p = new Integer[n];
        Arrays.setAll(p, i -> Integer.parseInt(sc.next()));
        sc.close();

        // 主処理
        int p1 = Arrays.stream(p).filter(i -> i <= a).mapToInt(i -> i).toArray().length;
        int p2 = Arrays.stream(p).filter(i -> a < i && i <= b).mapToInt(i -> i).toArray().length;
        int p3 = Arrays.stream(p).filter(i -> b < i).mapToInt(i -> i).toArray().length;
        int result = Math.min(Math.min(p1, p2), p3);

        // 出力
        System.out.println(result);
    }
}
