import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        long h = Long.parseLong(sc.next());

        // 主処理
        long count = 0;
        long result = 0;
        if (1 < h) {
            h = (long) Math.ceil(h / 2);
            count++;
            result += count;
            while (1 < h) {
                h = (long) Math.ceil(h / 2);
                count *= 2;
                result += count;
            }
            h = (long) Math.ceil(h / 2);
            count *= 2;
            result += count;
        } else {
            result++;
        }

        // 出力
        System.out.println(result);
        sc.close();
    }
}