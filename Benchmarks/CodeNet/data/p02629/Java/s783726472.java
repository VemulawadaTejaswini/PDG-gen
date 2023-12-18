import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        sc.close();

        // 主処理
        char[] array = Long.toString(n, 26).toCharArray();
        String result = "";
        if (new String(array).matches("^1+0$")) {
            for (int i = 0; i < array.length - 1; i++) {
                result += "z";
            }
        } else {
            int num = (int) 'a' - 1;
            for (char c : array) {
                int charNum;
                if (String.valueOf(c).matches("[0-9]")) {
                    charNum = Integer.parseInt(String.valueOf(c));
                } else {
                    charNum = (int) c - 87;
                }
                result += (char) (charNum + num);
            }
        }

        // 出力
        System.out.println(result);
    }
}
