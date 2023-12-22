
// 問題URL
// https://atcoder.jp/contests/abc133/tasks/abc133_a

import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer n = Integer.parseInt(scanner.next());
        Integer a = Integer.parseInt(scanner.next());
        Integer b = Integer.parseInt(scanner.next());

        int train = n * a;
        if(train < b) {
            System.out.println(train);
        } else {
            System.out.println(b);
        }

    }
}