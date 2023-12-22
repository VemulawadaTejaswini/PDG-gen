
// 問題URL
// https://atcoder.jp/contests/abc132/tasks/abc132_a

import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        String[] ar = x.split("");
        int count = 0;
        int no_count = 0;

        for(int i = 0; i< ar.length; i++) {
            String s = ar[i];
            for(int j = 0; j < ar.length; j++) {
                if (s.equals(ar[j])) count++;
            }
            if(count >= 2) break;
            count = 0;
        }

        for(int i = 0; i< 4; i++) {
            if(ar[i].equals(ar[0])) no_count++;
            if(ar[i].equals(ar[1])) no_count++;
            if(ar[i].equals(ar[2])) no_count++;
            if(ar[i].equals(ar[3])) no_count++;
        }

        if(count >= 2 && no_count == 8) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}