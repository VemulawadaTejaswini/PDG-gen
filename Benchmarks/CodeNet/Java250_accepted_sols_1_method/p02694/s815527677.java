// 問題URL
// https://atcoder.jp/contests/abc165/tasks/abc165_b

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Long n = scanner.nextLong();

        //System.out.println(n / 100L);
        Long count = 0L;
        Long result = 100L;
        for(;;) {
            result += ((long)Math.floor(result*0.01));
            count++;
            if(result >= n) break;;
        }


        System.out.println(count);
    }
}
