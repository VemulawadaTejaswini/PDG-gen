import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
    static final int MOD = 1000000007;
    static final int INF = 1 << 30;
    static final int ALF = 26;

    Main() {
        Scanner sc = new Scanner(System.in);
        long ans = 0;
        int N = sc.nextInt();
        List<Integer> prime = primeList(N);
        for (int i = 1; i <= N; i++) {
            ans += i * fastPrimeFactor(i, prime);
            // System.out.println(ans);
        }
        System.out.println(ans);
    }

    public static List<Integer> primeList(int max) {
        final List<Integer> prime = new ArrayList<Integer>();
        prime.add(2);
        for (int i = 3; i <= max; i += 2) {
            for (int wari : prime) {
                if (i % wari == 0)
                    break;
                if (wari * wari > i) {
                    prime.add(i);
                    break;
                }
            }
        }
        return prime;
    }
    public static long fastPrimeFactor(int n, List<Integer> prime) {
        // final List<Integer> list = new ArrayList<Integer>();
        // HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        if (n < 2) {
            // return list;
            return 1;
        }

        long ret = 1;
        for (int num : prime) {
            int k = 0;
            while (n % num == 0) {
                // list.add(n);
                // map.put(num, map.getOrDefault(num, 0)+1);
                k++;
                n /= num;
            }
            ret *= k+1;
            if (num * num > n)
                break;
        }

        if (n != 1) {
            // list.add(n);
            // map.put(n, map.getOrDefault(n, 0)+1);
            ret*=2;
        }
        // int ret = 1;
        // for(Entry<Integer,Integer> entry:map.entrySet()){
        //     ret *= entry.getValue()+1;
        //     // System.err.println(entry);
        // }
        return ret;
    }
/*
    public static int divisorX(final int n, List<Integer> pList) {
        // final List<Integer> list = new ArrayList<Integer>();
        // list.add(1);
        int ret = 0;
        for (int num : pList) {
            if (num * num == n){
                ret++;
                break;
            }else if(num*num>n)break;

            if (n % num == 0) {
                
                ret+=2;
            }
        }



        ret++;
        if(n>1)ret++;
        // if (n > 1)
        //     list.add(n);
        // for (int i = 1; i * i <= n; i++) {
        // if (n % i == 0) {
        // list.add(i); // a x b
        // if (i != n / i) {
        // list.add(n / i); // b x a
        // }
        // }
        // }
        // System.err.println(Arrays.toString(list.toArray()));
        System.err.println(ret);
        return ret;
    }
*/
    public static void main(String[] args) {
        new Main();
    }
}
