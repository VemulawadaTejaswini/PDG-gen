//package src.com.jetman.atcoder;

import java.util.*;

/**
 * @description:
 * @author: Jetman
 * @create: 2020-08-29 14:39
 **/
public class Main {

    Scanner sc = new Scanner(System.in);

    long MOD = 1000000000 + 7;

    long dp[][];

    private void slove() {

        long n = sc.nextLong();

        long ans = 0;
        for (int i = 1; i <= n ; i++) {
            long tmp = n%i == 0 ? 1L:0L;
            ans += (n/i-tmp);
        }

        System.out.println(ans);



    }

    private void build(Map<Integer, List<Integer>> edge, int l, int r) {
        List<Integer> list = edge.getOrDefault(l, new ArrayList<>());
        list.add(r);
        edge.put(l,list);
    }


    public static void main(String[] args) {
        new Main().slove();
    }
}
