import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        int[] q = new int[26];
        int[] r = new int[26];
        //要素数26、初期値：－1の変換表を用意
        for (int i = 0; i < 26; i++) {
            q[i] = -1;
            r[i] = -1;
        }
        boolean flag = true;
        for (int i = 0; i < S.length(); i++) {
            if (q[S.charAt(i) - 'a'] < 0) {
                q[S.charAt(i) - 'a'] = T.charAt(i) - 'a';
            } else {
                if (q[S.charAt(i) - 'a'] != T.charAt(i) - 'a') {
                    flag = false;
                }
            }
            if (r[T.charAt(i) - 'a'] < 0) {
                r[T.charAt(i) - 'a'] = S.charAt(i) - 'a';
            } else {
                if (r[T.charAt(i) - 'a'] != S.charAt(i) - 'a') {
                    flag = false;
                }
            }
        }
        if (flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}