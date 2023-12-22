import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // 主処理
        int count0 = 0;
        int count1 = 0;
        String[] arr = s.split("");
        for (int i = 0; i < s.length(); i++) {
            if ("0".equals(arr[i])) {
                count0++;
            } else {
                count1++;
            }
        }
        int result = s.length() - Math.abs(count0 - count1);

        // 出力
        System.out.println(result);
        sc.close();
    }
}