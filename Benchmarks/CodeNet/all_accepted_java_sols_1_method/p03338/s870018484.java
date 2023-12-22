import java.util.*;
import java.io.*;
import java.math.BigInteger;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int max = 0;

        for(int i = 0; i < N; i++) {
            String s1 = S.substring(0,i);
            String s2 = S.substring(i,N);

            boolean[] e1 = new boolean[26];
            boolean[] e2 = new boolean[26];
            for(int j = 0; j < s1.length(); j++) {
                e1[s1.charAt(j) - 'a'] = true;
            }
            for(int j = 0; j < s2.length(); j++) {
                e2[s2.charAt(j) - 'a'] = true;
            }
            int sum = 0;
            for(int j = 0; j < 26; j++) {
                sum += (e1[j] && e2[j] ? 1:0);
            }
            max = Math.max(sum,max);
        }
        System.out.println(max);


    }
}