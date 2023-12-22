import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());

        // 主処理
        int result = 0;
        int position = 0;
        for (int i = 1; position < x; i++) {
            position += i;
            result++;
        }

        // 出力
        System.out.println(result);
        sc.close();
    }
}