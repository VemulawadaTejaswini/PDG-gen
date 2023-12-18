import java.util.*;

public class Main{
    static long[] last = new long[26];
    static long[] c = new long[26];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        long[][] s = new long[d+1][26];

        for(int i=0; i<26; i++) {
            c[i] = sc.nextLong();
        }

        for(int i=1; i<=d; i++) {
            for(int j=0; j<26; j++) {
                s[i][j] = sc.nextLong();
            }
        }

        for(int i=1; i<=d; i++) {
            int index = select(s[i], i);
            System.out.print(index);
            if(i!=d) {
                System.out.print("\n");
            }
        }
    }

    public static int select(long[] s, int day) {
        long[] score = new long[26];
        int index = 0;
        long max = -1000000000;
        for(int i=0; i<26; i++) {
            score[i] = s[i];
            for(int j=0; j<26; j++) {
                if(i!=j) {
                    score[i] -= c[j]*(day-last[i]);
                }
            }

            if(score[i]>max) {
                index = i;
                max = score[i];
            }
        }
        return index+1;
    }
}