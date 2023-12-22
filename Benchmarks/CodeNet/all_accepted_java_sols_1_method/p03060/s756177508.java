/*https://atcoder.jp/contests/abc125/tasks/abc125_a*/

import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int v[] = new int[n];
        for (int i = 0; i < n; ++i){
            v[i] = in.nextInt();
        }
        int c[] = new int[n];
        for (int i = 0; i < n; ++i){
            c[i] = in.nextInt();
        }

        int diff, max_diff = 0;

        // 宝石ごとに価値-コストが正か調べる
        for (int i = 0; i < n; ++i){
            if ((diff = v[i]-c[i]) > 0){
                max_diff += diff;
            }
        }
        System.out.println(max_diff);
    }
}
