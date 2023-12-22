import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 標準入力から値を取得してinput_lineに入れる
        int input_line = sc.nextInt()*2;

        // 取得した値を標準出力するために"XXXXXX"をどう書き換える？
        System.out.println(input_line * 3.14159);
    }
}