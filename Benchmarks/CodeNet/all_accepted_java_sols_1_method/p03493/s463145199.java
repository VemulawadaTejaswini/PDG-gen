import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // 入力
        String sss = sc.next();
        // 出力
        int val = Integer.parseInt(sss);
        int len = sss.length();
        int num = 0;
        for (int i = 0; i < len; i++) {
            num += val & 0x01;
            val >>= 1;
        }
        System.out.println(num);
        sc.close();
    }
}
