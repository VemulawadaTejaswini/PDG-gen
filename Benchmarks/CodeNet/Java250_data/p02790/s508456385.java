import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        Integer a = Integer.parseInt(sc.next());
        Integer b = Integer.parseInt(sc.next());

        // 主処理
        String strA = "";
        for (int i = 0; i < b; i++) {
            strA += a;
        }
        String strB = "";
        for (int i = 0; i < a; i++) {
            strB += b;
        }

        String[] arr = new String[]{strA, strB};
        Arrays.sort(arr);

        String result = arr[0];

        // 出力
        System.out.println(result);
        sc.close();
    }
}
