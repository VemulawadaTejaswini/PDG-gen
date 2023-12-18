import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * Print Test Casesのエントリポイントを持つメインクラスです。
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        List<Integer> inputs = new ArrayList<Integer>();

        try {
            for ( ; stdIn.hasNext();) {
                int data = stdIn.nextInt();

                if (data == 0) {

                    // 0の場合処理終了
                    break;
                } else {

                    // その他の場合、値を格納する。
                    inputs.add(data);
                }
            }

            for (int i = 0; i < inputs.size(); i++) {
                System.out.println("Case " + (i + 1) + ": " + inputs.get(i));
            }
        } finally {
            stdIn.close();
        }
    }
}