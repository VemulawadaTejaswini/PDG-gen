

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long res = Integer.MAX_VALUE;

        for(long i = 1L; i*i<=N; i++) {
            if(N%i!=0) continue;
            if(N%i==0) {
                long len1 = String.valueOf(i).length();
                long len2 = String.valueOf(N/i).length();

                res = Math.min(res, Math.max(len1, len2));
            }
        }
        System.out.println(res);
    }
}
