import java.util.*;
import java.io.*;
import java.math.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] p = new int[M];
        String[] S = new String[M];

        for (int i = 0; i < M; i++) {
            p[i] = sc.nextInt();
            S[i] = sc.next();
        }

        boolean[] ac = new boolean[N];
        int[] nac = new int[N];
        int[] nwa = new int[N];
        for (int i = 0; i < N; i++) {
            ac[i] = false;
            nac[i] = 0;
            nwa[i] = 0;
        }

        for (int i = 0; i < M; i++) {
            int pr = p[i] - 1;

            if (!ac[pr]) {
                if (S[i].equals("AC")) {
                    nac[pr]+=1;
                    ac[pr] = true;
                } else { // "WA"
                    nwa[pr]+=1;
                }
            }

        }

        int sumac = 0;
        int sumwa = 0;
        for (int i = 0; i < N; i++) {
            if (ac[i]) {
                sumac += nac[i];
                sumwa += nwa[i];
            }
        }

        System.out.println(sumac + " " + sumwa);
    }

}
