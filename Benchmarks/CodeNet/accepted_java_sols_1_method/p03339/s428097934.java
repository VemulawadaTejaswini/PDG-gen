

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        String[] s = new String[N];
        int initData = 0;
        for (int i = 0 ; i < N ; i++) {
                s[i] = String.valueOf(S.charAt(i));

        }

        for (int i = 1; i < N ; i++) {
            if (String.valueOf(S.charAt(i)).equals("E")) {
                initData++;
            }
        }
        int min = initData;
        int calc = initData;
        for (int i = 1; i < N ; i++) {

            if (s[i -1].equals("W")) {
                calc++;
            }
            if (s[i].equals("E")) {
                calc--;
            }

            min = Math.min(calc, min);

        }
        System.out.println(min);

    }
}
