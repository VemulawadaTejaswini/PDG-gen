
// 問題URL
// https://atcoder.jp/contests/abc151/tasks/abc151_a

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();

        char []alphabet = new char[26];
        //String alphabet = new char[26];
        char c = 'a';

        for (int i = 0; i < 26; i++){
            alphabet[i] = c++;
        }

        for (int j = 0; j < alphabet.length; j++) {
            if (alphabet[j] == x.charAt(0) && x.charAt(0) != 'z') {
                System.out.println(alphabet[j + 1]);
                break;
            }
        }

    }
}