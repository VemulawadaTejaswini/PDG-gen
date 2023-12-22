import java.util.Scanner;

public class Main {

    private static final int NINE＿VAL = 9;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        final String indexStr = sc.next();
        String[] Array = indexStr.split("");
        int iTotalVal = 0;
        for (String i : Array) {
            iTotalVal += Integer.parseInt(i);
        }

        String outputVal = "";
        // 入力された文字の総数が9の倍数か？
        if (0 == (iTotalVal % NINE＿VAL)) {
            outputVal = "Yes";
        } else {
            outputVal = "No";
        }
        System.out.print(outputVal);
    }
}
