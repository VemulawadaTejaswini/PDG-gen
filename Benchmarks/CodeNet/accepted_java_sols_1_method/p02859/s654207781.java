import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 標準入力から値を取得してinput_lineに入れる
        String r = sc.nextLine();
      
      	int shuturyoku = Integer.parseInt(r) * Integer.parseInt(r);

        // 取得した値を標準出力するために"XXXXXX"をどう書き換える？
        System.out.println(shuturyoku);
    }
}