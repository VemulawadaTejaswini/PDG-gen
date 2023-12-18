//package src.com.jetman.atcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @description:
 * @author: Jetman
 * @create: 2020-08-29 14:39
 **/
public class Main {

    Scanner sc = new Scanner(System.in);

    long MOD = 1000000000 + 7;
    boolean[] judge;
    List<Integer> prime ;

    void initial(int bound) {
        judge[0] = false;
        judge[1] = false;
        for (int i = 2; i <= bound; i++) {
            judge[i] = true;
        }

        for (int i = 2; i <= bound; i++) {
            if (judge[i]) {
                prime.add(i);
                //倍数不是
                for (int j = 2 * i; j <= bound; j += i) {
                    judge[j] = false;
                }
            }
        }
    }



    List<Integer> divide(int n){
        if (judge[n]) {
            return Arrays.asList(n);
        }
        int tmp = (int) Math.sqrt(n);
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        while (prime.get(i) <= tmp && prime.get(i) <= n){
            int k = prime.get(i);
            if(n%k==0){
                ans.add(k);
                while(n%k==0){
                    n/=k;
                }
            }
            i++;
        }
        if(n>1){
            ans.add(n);
        }
        return ans;
    }

    private void slove() {

        int n = sc.nextInt();

        judge = new boolean[1000002];
        prime = new ArrayList<>();
        initial(1000000);

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] flag = new int[1000002];
        int ans = 1;
        for (int i = 0; i < n ; i++) {
            List<Integer> prime = divide(a[i]);
            for (int j = 0; j < prime.size(); j++) {
                if (ans == 1 && flag[prime.get(j)] > 0) {
                    ans++;
                }
                flag[prime.get(j)]++;
            }
        }
        if (ans == 1) {
            System.out.println("pairwise coprime");
            return ;
        }
        boolean f = Arrays.stream(flag).anyMatch(p -> p >= n);
        System.out.println(f?"not coprime":"setwise coprime");



    }

    public static void main(String[] args) {
        new Main().slove();
    }
}
