import java.util.*;
import java.text.*;

class Main {
    public static void main(String[]args)throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][][] cnt = new int[4][3][10];
        while(n-- > 0) {
            int b = sc.nextInt() - 1;
            int f = sc.nextInt() - 1;
            int r = sc.nextInt() - 1;
            int v = sc.nextInt();
            cnt[b][f][r] += v;
        }
        for(int b = 0; b < 4; b++) {
            if(b>0)System.out.println("####################");
            for(int f = 0; f < 3; f++) {
                for(int r = 0; r < 10; r++) {
                    System.out.print(" " + cnt[b][f][r]);
                }
                System.out.println();
            }
        }
    }
}