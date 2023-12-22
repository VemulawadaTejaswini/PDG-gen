
// 問題URL
// https://atcoder.jp/contests/abc155/tasks/abc155_b

import java.util.*;
import java.lang.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer a = Integer.parseInt(scanner.next());
        Integer[] b = new Integer[a];

        // 合計値
        List<Integer> total = new ArrayList<Integer>();

        boolean  flag = false;
        for(int i =0; i < a; i++) {
            b[i] = Integer.parseInt(scanner.next());
            if (b[i] % 2 == 0) total.add(b[i]);
        }

        for(int i =0; i < total.size(); i++) {
            if (!(total.get(i) % 3 == 0 || total.get(i) % 5 == 0)) {
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.println("DENIED");
        } else{
            System.out.println("APPROVED");
        }
    }
}