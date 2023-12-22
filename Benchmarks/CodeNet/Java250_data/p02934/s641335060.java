// https://atcoder.jp/contests/abc138/tasks/abc138_b

import java.util.*;
import java.lang.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer x = Integer.parseInt(scanner.next());
        Integer[] arr = new Integer[x];

        for(int i = 0; i < x; i++) {
            arr[i] = Integer.parseInt(scanner.next());
        }

        Double total = 0.0;
        for(int i = 0; i < x; i++) {
            total += ((double)1 / arr[i]);
        }

        System.out.println((double)1 / total);
    }
}
