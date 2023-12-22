import java.util.*;
import java.io.*;
import java.math.BigInteger;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int min = N + 1;
        int[] s1 = new int[N];
        int[] s2 = new int[N];
        for(int i = 0; i < N; i++) {
            if(S.charAt(i) == 'W') s1[i]++;
            else s2[i]++;
        }
        for(int i = 0; i < N-1; i++) {
            s1[i+1] += s1[i];
            s2[N - i - 2] +=  s2[N - i - 1];
        }

        for(int i = 0; i < N; i++) {
            min = Math.min(min,s1[i] + s2[i] - 1);
        }
        System.out.println(min);





    }
}