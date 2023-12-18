

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        int rtn = 0;
        for (int i = 0; i < s.length(); i++) {
            if (String.valueOf(s.charAt(i)).equals(String.valueOf(t.charAt(i)))) {
                continue;
            }
            rtn++;
        }
        System.out.println(rtn);
    }

}
