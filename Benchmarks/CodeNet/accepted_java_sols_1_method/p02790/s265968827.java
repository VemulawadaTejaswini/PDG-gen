import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());

        // 主処理
        String strA = "";
        for (int i = 0; i < b; i++) {
            strA += a;
        }
        String strB = "";
        for (int i = 0; i < a; i++) {
            strB += b;
        }
        String[] array = new String[] { strA, strB };
        Arrays.sort(array);
        String result = array[0];

        // 出力
        System.out.println(result);
        sc.close();
    }
}
