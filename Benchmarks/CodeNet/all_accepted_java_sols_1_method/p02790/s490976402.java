
// 問題URL
// https://atcoder.jp/contests/abc152/tasks/abc152_b

import java.util.*;
import java.lang.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer x = Integer.parseInt(scanner.next());
        Integer y = Integer.parseInt(scanner.next());


        int kekka;
        String moji = new String();

        if(x > y) {
            for(int i=0; i< x; i++) {
                moji += String.valueOf(y);
            }
        } else {
            for(int i=0; i< y; i++) {
                moji += String.valueOf(x);
            }

        }

        System.out.println(moji);
    }
}