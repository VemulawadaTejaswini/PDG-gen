import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] S = sc.next().toCharArray();
        int len = S.length;
        int[] cnt = new int[26];
        for(char c : S) {
            cnt[c - 'a']++;
        }

        int odd = 0, even = 0;
        for(int n : cnt) {
            if(n % 2 == 0) even++;
            else odd++;
        }
        if(len % 2 == 0 && odd == 0) {
            long k = fact(len / 2);
            for(int n : cnt) {
                k /= (fact(n / 2));
            }
            System.out.println(k);

        }
        else if(len % 2 == 1 && odd == 1) {
            long k = fact(len / 2);
            for(int n : cnt) {
                k /= (fact(n / 2));
            }
            System.out.println(k);
        }
        else {
            System.out.println(0);
        }
    }

    static long fact(int n) {
        return n < 2 ? 1 : n * fact(n - 1);
    }
}