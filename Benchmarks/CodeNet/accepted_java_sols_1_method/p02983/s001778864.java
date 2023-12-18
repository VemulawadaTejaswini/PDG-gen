

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long L = sc.nextLong();
        long R = sc.nextLong();

        if(R-L>3000) {
            System.out.println(0);
        } else {
            long res = 2018;
            for(long i = L; i < R; i++) {
                for(long j = L+1; j <= R; j++) {
                    res = Math.min(res, (i*j)%2019);
                }
            }
            System.out.println(res);
        }
    }
}
